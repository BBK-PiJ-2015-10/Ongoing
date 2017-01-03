package day7.Exercises.ex6TraitsInheritance


sealed trait DivisionResult

  case class Finite (result: Int) extends DivisionResult {
  }
  
  case class Infinite () extends DivisionResult {     
  }

  

object divide {
  def apply (input1: Int, input2: Int) : DivisionResult = {
       if (input2 == 0 ) {
         return Infinite()
       }
       else {
         return Finite(input1/input2)
       }
  }
}



object Scriptex6 extends App {
  
  val result1 = Finite
  
  assert(divide(1,2) == Finite(0))
  assert(divide(1,0) == Infinite())
  
  
  def divider (input1: Int, input2: Int) : String = {
    var division = divide(input1,input2)
    division match {
      case f: Finite  => "The result is " +input1/input2
      case i: Infinite => "Division by zero is not allowed"
    }
  }
  
  assert(divider(1,2) == "The result is 0")
  assert(divider(1,0) == "Division by zero is not allowed")
  
}