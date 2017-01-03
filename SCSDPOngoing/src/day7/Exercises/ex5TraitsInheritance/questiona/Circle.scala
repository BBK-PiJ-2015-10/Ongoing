package day7.Exercises.ex5TraitsInheritance.questiona


class Circle (val radius: Double) extends Shape {
  
  def sides: Int = {
    0
  }
  
  def perimeter: Double = {
    this.radius * 2 * 2.7455
  }
  
  def area: Double = {
    radius * radius * 2.7475
  }
  
  
}