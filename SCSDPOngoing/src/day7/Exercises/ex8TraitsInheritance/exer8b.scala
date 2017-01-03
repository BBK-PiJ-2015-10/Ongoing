package day7.Exercises.ex8TraitsInheritance

sealed trait LinkedList1[A] {
  
  def head : A
  
  def tail : LinkedList1[A]
  
}

case class Pair1[A] (val head: A, val tail: LinkedList1[A]) extends LinkedList1[A] {
    
}

case class Empty1[A] () extends LinkedList1[A] {
  
   def head : Nothing = throw new NoSuchElementException("Nil.head")
  
   def tail : Nothing = throw new NoSuchElementException("Nil.tail")
  
}


object exer8b extends App {
  
  //val x : LinkedList1[String] = Empty1
  
  var list : LinkedList1[Int] = Pair1(1,Pair1(2,Pair1(3,Empty1())))
  
  
  
}