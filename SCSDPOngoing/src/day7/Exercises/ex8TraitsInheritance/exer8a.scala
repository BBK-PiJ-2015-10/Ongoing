package day7.Exercises.ex8TraitsInheritance

sealed trait LinkedList[A] {
  
  def head : A
  
  def tail : LinkedList[A]
  
}

case class Pair[A] (var head: A, var tail: LinkedList[A]) extends LinkedList[A] {
    
}

case class Empty[A] () extends LinkedList[A] {
  
   def head : A = throw new NoSuchElementException("Nil.head")
  
   def tail : LinkedList[A] = throw new NoSuchElementException("Nil.tail")
  
  
}



object exer8a extends App {
  
  
  var list : LinkedList[Int] = Pair(1,Pair(2,Pair(3,Empty())))
  
  var list2 = Pair(1,Pair(2,Pair(3,Empty())))
  
  assert(list.isInstanceOf[LinkedList[Int]] == true)
  
  assert(list.head == 1)
  
  assert(list.tail.head == 2)
  
  assert(list.tail.tail == Pair(3,Empty()))
  
  println("It worked")
  
  
  
}