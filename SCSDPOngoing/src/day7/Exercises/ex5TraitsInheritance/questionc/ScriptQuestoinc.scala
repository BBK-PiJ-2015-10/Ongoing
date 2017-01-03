package day7.Exercises.ex5TraitsInheritance.questionc

sealed trait Shape

  case class Rectangle (val w: Double, val l:Double) extends Shape  {
      
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

  
  case class Circle (val radius: Double) extends Shape {
   
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
  
  case class Square (a: Double) extends Shape { 
      
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


object Draw {
  def apply(shape: Shape) : String = 
      shape match {
      case r: Rectangle => "A rectangle of width " +r.w +"cm and height " + r.l
      case c: Circle => "A circle of radius " +c.radius +"cm"
      case s: Square => "A square of dimension " +s.a +"cm"
    }
    
}


object ScriptQuestoinc extends App {
  
  
  assert(Draw(Circle(10)) == "A circle of radius 10.0cm")
  
  assert(Draw(Rectangle(3,4)) == "A rectangle of width 3.0cm and height 4.0")
  
  assert(Draw(Square(4)) == "A square of dimension 4.0cm" )
   
}


