package day6.AlgebraicDataTypes

trait A4

final case class D4(b: B4) extends A4

//final case class E4(c: C4) extends C4

final case class D5() extends A4

final case class E5() extends A4

class B4

class C4


object HasaOR {
  
  def tonto(a: A4): Int = 
    a match {
      case E5() => 1
      case D5() => 2
      case D4(b)=>3
      case _ =>0
    }
  
  
  
}