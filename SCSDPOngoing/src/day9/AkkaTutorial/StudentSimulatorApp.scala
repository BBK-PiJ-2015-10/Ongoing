package day9.AkkaTutorial

import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.ActorRef
import day9.AkkaTutorial.TeacherProtocol._



object StudentSimulatorApp2 extends App {
  
  val actorSystem = ActorSystem("UniversityMessageSystem")
  
  val teacherActorRef :ActorRef= actorSystem.actorOf(Props[TeacherActor])
  
  teacherActorRef ! QuoteRequest
  
  Thread.sleep(20000)
  
  actorSystem.terminate()
  
  
  
  
}