package day7.Samples

trait IntList2 {
  def length: Int = {
    this match {
      case End3 => 0
      case Pair3 (hd,tl) => 1 +tl.length
    }
  }
  
  def double: IntList2 = {
    this match {
      case End3 => End3
      case Pair3(hd,tl) => Pair3(hd*2,tl.double)
    }
  }
  
  def abstraction(end:Int,f:(Int,Int) => Int) : Int =
    this match {
    case End3 => end
    case Pair3 (hd,tl) => f(hd,tl.abstraction(end,f))
  }
  
  def length2: Int = 
    { abstraction(0,(_,tl) => 1 + tl) }
  
  def sum:Int  = {
    abstraction(0, (hd,tl) => hd + tl ) }
  
  def product: Int = {
    abstraction(1, (hd,tl) => hd * tl )}
  

}

case object End3 extends IntList2

case class Pair3 (head: Int, tail:IntList2) extends IntList2


  
  


object Sample2 extends App{
  
  println("This is a test")
  
  
}