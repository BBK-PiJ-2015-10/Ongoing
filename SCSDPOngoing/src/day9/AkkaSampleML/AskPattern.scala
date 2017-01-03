package day9.AkkaSampleML

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.actorRef2Scala
import akka.pattern._
import akka.util.Timeout
import scala.concurrent.duration._
//import scala.concurrent.ExecutionContext.Implicits.global
import akka.actor.ActorRef
import scala.util.Failure
import scala.util.Success
import scala.concurrent.Future


object AskPattern extends App {
  
  case object AskName
  case class NameResponse(name:String)
  case class AskNameOf(other:ActorRef)
  
 
  
  class AskActor(val name:String) extends Actor {
    
    //If need 
    implicit val ec = context.system.dispatcher
    
    def receive = {
      case AskName => sender ! NameResponse(name)  
      case AskNameOf(other) => 
        //The below will return a future.
        val f = other ? AskName
        f.onComplete {
          case Success(NameResponse(n)) => 
            println("They said their name was " +n)
          case Success(s) =>
            println("They didn't tell us their name")
          case Failure(ex) =>
            println("Asking their name failed")
        }
        val currentSender = sender
        Future {
          currentSender ! "message"
        }
    }
    
}

  val system = ActorSystem("SimpleSystem")
  
  //Square brackets only referenced the type, now we want to specify a particular
  //object. Hence, we changed the brackets to parenth.
  val actor = system.actorOf(Props(new AskActor("Ale Cane")), "AskActor1")
  val actor2 = system.actorOf(Props(new AskActor("Valerie")), "AskActor2")
  
  implicit val ec = system.dispatcher
  implicit val timeout = Timeout(1.seconds)
  val answer = actor ? AskName
  
  answer.foreach(n => println("Name is " +n))
  
  actor ! AskNameOf(actor2)
  
  println("Hello hello")
  
  //system.terminate()
  
  
  
  
}