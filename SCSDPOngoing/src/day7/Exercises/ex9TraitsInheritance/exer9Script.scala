package day7.Exercises.ex9TraitsInheritance

trait Sum [A,B]

case class Left [A,B] (val a: A) extends Sum[A,B] {
  
  def value: A = { 
    this.a
  }
  
}

case class Right [A,B] (val b: B) extends Sum[A,B] {
  
  def value: B = {
    this.b
  }
  
  
}


object Script extends App{
  
  assert(Left[Int,String](1).value == 1)
  
  assert(Right[Int,String]("foo").value == "foo")
  
  val sum: Sum[Int,String] = Right("foo")
  
  assert (sum == Right("foo"))
   
  
  println(sum)
  println("did it work...")
  
  
}