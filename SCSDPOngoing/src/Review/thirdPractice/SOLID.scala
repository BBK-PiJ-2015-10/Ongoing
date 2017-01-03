package Review.thirdPractice

//This is an example of Single Object Responsability

abstract class Modem {
  
  def dial(number:Int):Unit
  
  def hangup() : Unit
  
  def send(text: String) : Unit
  
  def receive(txt: String) : Unit
  
}

trait Connector {
  
 def dial(number:Int):Unit
  
 def hangup() : Unit
   
}

trait Communicator {
  
  def send(text: String) : Unit
  
  def receive(txt: String) : Unit
  
}

abstract class Modem2 (con: Connector, com: Communicator) {
  
}


//This is an example of Open for extension and close for modification

case class Rectangle1(wa:Int,la:Int)

class TotalAreaCalculator {
  
  def calculate(inputs: List[Rectangle1]) : Double = {
    var result = 0.0
    for (input <- inputs ) { 
      result +=(input.wa * input.la)   
    }
    result
  }
 
}  

trait Shape {
  
  def area: Double
  
}

case class Square (w:Int,h:Int) extends Shape {
  
  @Override
  def area :Double = {
    w * h
  }
  
}

case class Circle(r:Int) extends Shape {
  
  @Override
  def area: Double = {
    2+2.74*r*r
  }
  
}

case class Traingle (h:Int,b:Int) extends Shape {
  
  @Override
  def area: Double = {
    h*b/2
  }
  
}

class TotalAreasCalculator {
  
  def totalAreas(lst:List[Shape]):Double = {
    var result =0.0
    for (input <- lst){
      result += input.area
    }
    result
  }
  
  
}


// This is an example of Interface Segregation Principle


trait runner {
  
  def runningSpeed : Double
  
}

trait swimmer {
  
  def swimmingSpeed : Double
  
}

case class Decathloner(s: Double,r:Double) extends runner with swimmer {
  
  def runningSpeed: Double = {
    s;
  }
  
  def swimmingSpeed: Double = {
    r
  }
  
}


//Dependency Inversion

sealed trait Color {
  
  def paint(): Unit;
  
}

case class Blue() extends Color {
  
  def paint():Unit = {
    println("Painting in blue")
  }
  
}

case class Black() extends Color {
  
  def paint():Unit = {
    println("Painting in black")
  }
  
}


case class myParticularWall(col:Color) {
  
  def paintWall(): Unit = {
    col.paint()
  } 
  
}





object SOLID extends App {
  
  

    
  
  
}