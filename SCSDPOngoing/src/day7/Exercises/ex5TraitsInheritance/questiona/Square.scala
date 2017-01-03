package day7.Exercises.ex5TraitsInheritance.questiona

class Square (val a: Double) extends Shape {
  
  def sides: Int = {
    4
  }
  
  def perimeter: Double = {
    4*a
  }
  
  def area: Double = {
    a*a
  }
  
  
}