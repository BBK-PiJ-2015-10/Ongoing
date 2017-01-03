package day4.partII

object argh {
  
  def a = {
    println("a")
    1
  }
  
  val b = {
    println("b")
    a + 2
  }
  
  def c = {
    println("c")
    a
    b + "c"
  }
  
}