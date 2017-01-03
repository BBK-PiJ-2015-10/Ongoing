package day7.Exercises.ex10TraitsInheritance

sealed trait DivisionResult

  case class Finite (result: Int) extends DivisionResult {
  }
  
  case class Infinite () extends DivisionResult {     
  }


sealed trait Maybe

  case class Full(value: Int) extends Maybe
  case class Empty() extends Maybe
      
  
  
object divide {
  def apply (input1: Int, input2: Int) : Maybe = {
       if (input2 == 0 ) {
         return Empty()
       }
       else {
         return Full(input1/input2)
       }
  }
}  
 

object exer10Script extends App {
  
  
  def divisor (input1: Int, input2: Int)  = {
    var outcome = divide(input1,input2)
    outcome match {
      case Full(value) => println(s"It's finite: ${value}")
      case Empty() => println(s"It's infinite")
    }
  }
  
  
  divisor(6,2)
  divisor(6,0)
  
  
}