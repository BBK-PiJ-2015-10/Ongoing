package day9.AkkaSampleML

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.actorRef2Scala
import scala.concurrent.duration._

object SchedulerExample extends App {
  
  case object Count
  
  class ScheduleActor extends Actor {
    
    var n = 0
    def receive = {
      case Count =>
        n +=1
        println(n)
    }
  
    
}

  val system = ActorSystem("SimpleSystem")
  
  //This is really an actorRef not an actor class
  val actor = system.actorOf(Props[ScheduleActor], "Actor")
  implicit val ec = system.dispatcher
  
  
  actor ! Count
  
  
  system.scheduler.scheduleOnce(1.second)(actor! Count)
  
  println("I hope this works")
  
  val can = system.scheduler.schedule(0.seconds,100.millis, actor, Count)
  
  Thread.sleep((2000))
  can.cancel
  system.terminate()
  
  
}