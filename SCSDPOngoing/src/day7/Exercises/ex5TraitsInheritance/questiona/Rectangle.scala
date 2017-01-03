
package day7.Exercises.ex5TraitsInheritance.questiona

class Rectangle (val w: Double, val l:Double) extends Shape {
  
  def sides: Int = {
    4
  }
  
  def perimeter: Double = {
    2*(l+w)
  }
  
  def area: Double = {
    w * l
  }
  
}