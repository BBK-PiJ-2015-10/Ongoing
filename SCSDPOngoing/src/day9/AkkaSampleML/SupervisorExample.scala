package day9.AkkaSampleML

import akka.actor.ActorSystem
import akka.actor.Actor
import akka.actor.Props
import akka.actor.ActorRef
import akka.actor.OneForOneStrategy
import akka.actor.SupervisorStrategy._
import scala.Exception

object SupervisorExample extends App {
  
  case object CreateChild
  case class SignalChildren(order:Int)
  case class PrintSignal(order:Int)
  case class DivideNumbers(n:Int,d:Int)
  case object BadStuff 
  
  class ParentActor extends Actor {
    
    private var number = 0
    
    //Will do this manually, Akka can do it for us.
    private var children = collection.mutable.Buffer[ActorRef]()
    
    def receive = {
      case CreateChild=>
        //Not only we create the child, but also added it to the children collection.
        children += context.actorOf(Props[ChildActor],"child"+number)
        //context.actorOf(Props[ChildActor],"child"+number)
        number +=1
      case SignalChildren(n)=>
        children.foreach(_ ! PrintSignal)
        //context.children.foreach(_ ! PrintSignal(n))
    }
    
    override val supervisorStrategy = OneForOneStrategy(loggingEnabled=false) {
      case ae:ArithmeticException => Resume
      case _:Exception => Restart
    }
    
}

  
  class ChildActor extends Actor {
    
    println("Child created.")
    
    def receive = {
      case PrintSignal(n)=>println(n+" " +self)
      case DivideNumbers(n,d) => println(n/d)
      case BadStuff => throw new RuntimeException("Suff happenned")
    }
    
    override def preStart() = {
      super.preStart()
      println("preStart")
    }
    
    override def postStop() = {
      super.postStop()
      println("postStop")
    }
    
    override def preRestart(reason:Throwable, message:Option[Any]) = {
      super.preRestart(reason, message)
      println("PreReStart")
    }
    
     override def postRestart(reason:Throwable) = {
      super.postRestart(reason)
      println("PostReStart")
    }
    
    
    
  }
  
  val system = ActorSystem("HierarchySystem")
  
  //This is really an actorRef not an actor class
  val actor = system.actorOf(Props[ParentActor], "Parent1")
  val actor2 = system.actorOf(Props[ParentActor],"Parent2")
  
  actor ! CreateChild
  //actor ! CreateChild
  val child0 = system.actorSelection("/user/Parent1/child0")
  child0 ! DivideNumbers(4,0)
  child0 ! DivideNumbers(4,2)
  child0 ! BadStuff
  
  Thread.sleep(1000)
  system.terminate()
  
  
  // self ! PoisonPill
  // context.stop(self)
  //Left on minute number 6
  
}