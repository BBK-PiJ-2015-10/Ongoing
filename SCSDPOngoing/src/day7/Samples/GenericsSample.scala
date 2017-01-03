package day7.Samples

final case class Box[A](value:A)


//Invariant Generic Sum Type Pattern
trait Result[A]
case class Success[A](result:A) extends Result[A]
case class Failure[A](reason: String) extends Result[A]

trait IntList
case class Pair2 (head:Int, tail: IntList) extends IntList
case object End extends IntList

sealed trait LinkedList[A]
final case class End[A]() extends LinkedList[A]
final case class Pair[A] (head: A, tail:LinkedList[A]) extends LinkedList[A]





object GenericsSample extends App {

  println(Box(2).value)
  
  def orig[A](a:A) = a
  
  println(orig(3))
  println(orig("asd"))
  
  Box("asdhakjdh")
  
  val ll :LinkedList[Int] = Pair(1,Pair(2,End()))
  
  println(ll)
  
  
  
}