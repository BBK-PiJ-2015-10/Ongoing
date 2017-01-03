package day8.Exercises.Genericsex2

sealed trait IntList  {
  
  
  def abstraction (end: Int, fold:(Int,Int)=>Int ) : Int = { 
    this match {
      case End => end
      case Pair(hd,tl) => fold(hd, tl.abstraction(end,fold))
    }
  }
  
  def abstraction2 (end: IntList, fold:(Int,IntList)=>IntList ) : IntList = { 
    this match {
      case End => End
      case Pair(hd,tl) => fold(hd, tl.abstraction2(end,fold))
    }
  }
  
  
  
   
  def sum = abstraction(0,(result,current)=>result+current)
  
  def length = abstraction(0,(result,current)=>current+1)
  
  def product = abstraction(1,(result,current)=> (result*current))
  
  def double = abstraction2(this,(result,current)=> current)
  
  
}

final case object End extends IntList

final case class Pair(head:Int, tail:IntList) extends IntList


object ex2 extends App {
  
  
  val example1: IntList = Pair(1,Pair(2,Pair(3,Pair(4,End))))
  
  assert(example1.length == 4)
  
  assert(example1.sum == 10 )
  
  assert(example1.product == 24 )
  
  println(example1)
  
  println(example1.double)
  

  
}