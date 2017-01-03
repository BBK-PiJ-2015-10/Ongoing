package day6.ex3to5ClassArguments

object TestArgs extends App {
  
  //Answer to question 1
  
  val family1 = new Family ("Mum","Dad","Sally","Dick")
  assert(family1.familySize() == 4)
  
  val family2 = new Family ("Dad","Mom","Harry")
  assert(family2.familySize() == 3)
  
  //Answer to question 2
  
  val family3 = new FlexibleFamily ("Mum","Dad","Sally","Dick")  
  assert(family3.familySize() == 4)
  
  val family4 = new FlexibleFamily ("Dad","Mom","Harry")
  assert(family4.familySize() == 3)
  
  //Answer to question 3
  
  def squareThem(numbers: Int*) :Int = {
    var result : Int = 0
    for (i <- numbers) {
      result = result + i*i
    }
    result
  }
  
  assert(squareThem(2) == 4)
  assert(squareThem(2,4) == 20)
  assert(squareThem(1,2,4) == 21)
  
}