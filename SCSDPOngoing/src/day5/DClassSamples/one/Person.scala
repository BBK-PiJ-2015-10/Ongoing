package day5.DClassSamples.one

class Person {
  val firstName = "Fred"
  val lastName = "Jobs"

  def name = s"${firstName} ${lastName}"
}

object Main extends App {
  val p = new Person
  println(p)
 
  //println(p.name)
  
}

