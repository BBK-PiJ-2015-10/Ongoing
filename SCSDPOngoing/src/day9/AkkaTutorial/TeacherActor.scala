package day9.AkkaTutorial

import akka.actor.Actor
import day9.AkkaTutorial.TeacherProtocol._


class TeacherActor extends Actor {
    
  val quotes = List(
      "Moderation is for cowards",
      "Anything worth doing is worth overdoing",
      "The trouble is you think you have time",
      "You never gonna know if you never even try")
      
  def receive = {
    
    case QuoteRequest => {
      
      import util.Random
      
      val quoteResponse=QuoteResponse(quotes(Random.nextInt(quotes.size)))
          
      println(quoteResponse)    
      
    }
    
  }
      
  
  
}