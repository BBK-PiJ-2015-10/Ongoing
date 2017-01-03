package day7.Exercises.ex5TraitsInheritance.questiond

sealed trait Color {
  
  var R: Int
  
  var G: Int
  
  var B: Int
  
  def custom (R: Int, G: Int, B: Int ) = {
    this.R=R
    this.G=G
    this.B=B
  }
  
}

  case class Blue (var R: Int= 0, var G:Int = 0, var B:Int = 100) extends Color  {
    
  }

  
  case class Red (var R: Int = 100, var G:Int = 0, var B:Int = 0) extends Color {
       
  }
  
  case class Yellow (var R: Int = 0, var G:Int = 70, var B:Int = 30) extends Color { 
  }



object Tone {
  def apply(color: Color) : String = {
    if ((color.R < 50 ) && (color.B<20) && (color.G>45) ) {
      "Dark"
    }
    else {
      "Light"
    }
  }  
}

object Adjust {
  def apply(color: Color, input1:Int, input2:Int, input3:Int)  = {
    color.R=input1
    color.G=input2
    color.B=input3  
  }
}



object ScriptQuestiond extends App {
    
  
   println(Tone(Red()))
   
   var color1 : Color = Red()
   color1.custom(20,45,26)
   
   var color2 : Color = Blue()
   
   Adjust(color2,0,40,100)
   
   var color3 = Blue()
   color3.custom(20,45,26)
   
   Adjust(color3,0,0,0)
   
  
}