package Review.thirdPractice

sealed trait Shape2 {
  
  def draw() : Unit
  
}

case class Circle2() extends Shape2 {
  
  def draw() : Unit = {
    println("I am drawing a circle")
  }
  
}

case class Square2() extends Shape2 {
  
  def draw() : Unit = {
    println("I am drawing an Square")
  }
  
}

case class Rectangle2() extends Shape2 {
  
  def draw() : Unit = {
    println("I am drawing a Rectangle")
  }
  
}

object ShapeFactory {
  
  def getShape(name : String) : Shape2 =
    name match {
      case "circle" => Circle2()
      case "square" => Square2()
      case "Rectangle" => Rectangle2()
      case _ => null;
  }
  
}


object CreationalPatterns extends App {
  
  val shape = ShapeFactory.getShape("circle")
  shape.draw()
  
  
}