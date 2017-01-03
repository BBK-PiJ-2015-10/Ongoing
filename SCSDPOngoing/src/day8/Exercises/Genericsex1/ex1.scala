package day8.Exercises.Genericsex1

sealed trait LinkedList[A]  {
  
  def length() : Int
  
  def contains(input: A) : Boolean
  
  def apply(input: Int) : A
  
  def apply2(input: Int) : Result[A]
  
}

final case class End[A] () extends LinkedList[A] {
  
  def length() : Int = { 0 }
  
  def contains(input: A) : Boolean = false
  
  def apply(input: Int) : Nothing = throw new NoSuchElementException("Index out of bounds")
  
  def apply2(input: Int) : Result[A] = {
    return Failure("Index out of bounds")
  }
  
}

final case class Pair[A] (head:A, tail:LinkedList[A]) extends LinkedList[A] {
  
  def length() : Int = {
    1 + tail.length()
  }
  
  def contains(input: A) : Boolean = {
    if (this.head == input ) {
      true
    }
    else {
      this.tail.contains(input)
    }
  }
  
  def apply(input: Int) : A  = {
    if (input == 0 ) {
      return this.head
    }
    else {
      this.tail.apply(input-1)
    }
  }
  
  
  def apply2(input: Int) : Result[A] = {
    if (input == 0 ) {
      return Success(this.head)
    }
    else {
      this.tail.apply2(input-1)
    }
  }
  
}
  
sealed trait Result[A]
  
case class Success[A] (result: A) extends Result[A]
  
case class Failure[A] (reason: String) extends Result[A]


object GenericsScript extends App {
  
  
  //Answer to question b
  
  val example = Pair(1,Pair(2,Pair(3,End())))
  
  assert(example.length == 3)
  
  assert(example.tail.length == 2)
  
  assert(End().length == 0)
    
  //Answer to question c
  
  assert(example.contains(3) == true)
  
  assert(example.contains(4) == false)
  
  assert(example.contains(0) == false)
  
  //Answer to question d
  
  assert(example(0) == 1)
  assert(example(1) == 2)
  assert(example(2) == 3)
  assert(try { 
            example(3) 
          false 
         } catch { 
            case e: Exception => true 
         })
  
  
  //Answer to question e
         
  /*I changed the name of apply to apply2 in order to keep apply method solution
  in this file as opposed to creating a new package just for answering question e.
  */
      
  assert(example.apply2(0) == Success(1))
  assert(example.apply2(1) == Success(2))
  assert(example.apply2(2) == Success(3))
  assert(example.apply2(3) == Failure("Index out of bounds"))
  
  
}