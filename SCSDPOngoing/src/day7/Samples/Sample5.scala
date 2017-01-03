package day7.Samples

sealed trait Option[+A]

final case class Some[A] (value:A) extends Option[A]
final case object None extends Option[Nothing]

case class Foo[+A]()

trait B

case class A() extends B

//A is only an A - invariant
//+A covariant plus subtypes
//-A contravariant plus supertypes


object Sample5 {

  val x: Option[Int] = Some(3)
  
  val y: Option[Int] = None
  
  
  
}