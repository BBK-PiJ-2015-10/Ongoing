package day9.AkkaTutorial

import akka.actor.Actor
import akka.actor.ActorLogging
import day9.AkkaTutorial.TeacherProtocol._


class TeacherLogActor extends Actor with ActorLogging {

  val quotes = List(
      "Moderation is for cowards",
      "Anything worth doing is worth overdoing",
      "The trouble is you think you have time",
      "You never gonna know if you never even try")
      
  def receive = {
    
    case QuoteRequest => {
      
      import util.Random
      
      val quoteResponse=QuoteResponse(quotes(Random.nextInt(quotes.size)))
      log.info(quoteResponse.toString())
              
    }
    
  }
  
  
  def quoteList=quotes
  
  
}