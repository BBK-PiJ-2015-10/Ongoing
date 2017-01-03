package day9.AkkaSampleML

//This is from the Communicating Actors video.

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.actorRef2Scala
import akka.actor.ActorRef

object ActorCountDown extends App {
  
  case class StartCounting(n:Int,other:ActorRef)
  case class CountDown(n:Int)
  
  class CountDownActor extends Actor {
    
    def receive = {
      case StartCounting(n,other) => {
        println(n)
        other ! CountDown(n-1)
      }
      case CountDown(n) =>
        {
          println(self)
          if(n>0) {
            println(n)
            sender ! CountDown(n-1)
          }
          else {
            context.system.terminate()
          }
          
        }
        
        println(n)
      case i:Int => println("Number: "+i)
    }
    
    def foo = println("Normal method")
    
}

  val system = ActorSystem("SimpleSystem")
  
  //This is really an actorRef not an actor class
  val actor1 = system.actorOf(Props[CountDownActor], "CountDownActor1")  
  
  val actor2 = system.actorOf(Props[CountDownActor], "CountDownActor2")  

  actor1 ! StartCounting(10,actor2)
  
}