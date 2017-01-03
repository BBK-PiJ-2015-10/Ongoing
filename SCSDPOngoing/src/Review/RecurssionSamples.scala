package Review

import annotation.tailrec

trait PimpedList[T] {
  
  val xs: List[T]
  
  def tailrecursiveLength:Int  = {
    @tailrec def iter(xs:List[T],acc:Int):Int  = {
      xs match {
        case List()=>acc
        case x :: xs => iter(xs,acc+1)
      }
    }
    iter(xs,0)
  }
  
  def traditionalRecursiveLength(xs:List[T]):Int = {
    xs match {
      case List()=>0
      case x :: xs => 1 + traditionalRecursiveLength(xs)
      
    }
    
  }
  
  
}



object RecurssionSamples extends App {
  
}