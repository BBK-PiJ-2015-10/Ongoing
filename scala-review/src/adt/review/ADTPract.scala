package adt.review

object ADTPract {
  
}

//Product data type, it has a B and a C

trait A {
  
  def b: B  
  def c: C
  
}

trait B
trait C


//Sum data type, Human is a Male or a Female

sealed trait Human
case class Man() extends Human
case class Woman() extends Human

//Is a And

trait European
trait Wealthy
trait London extends European with Wealthy


//has or

trait Person {
  
  def vehicle: Vehicle
  
}

sealed trait Vehicle
final case class Car() extends Vehicle
final case class Motorbike() extends Vehicle

