package day4.PartI.exer2

object Expressions {
  
  def main (args: Array[String]): Unit = {
    
    println("These are the solutions for Expressions")
   
    var sky : String = "partly cloudly"
    var temperature : Int = 81 
    
    //Exer1
    
    var exp1 :Boolean = {
        if ( (sky == "sunny" ) && (temperature > 80 ) ) {
          true
        }
        else {
          false
        }
    }
    
    println(exp1)
    
    //Exer2
    
    var exp2 : Boolean = {
        if ( ( (sky == "sunny") || (sky == "partly cloudly") ) && 
           ( (temperature > 80 ) ) )  {
           true
        }
        else {
          false
        }
    }
    
     println(exp2)
     
     //Exer3
     
     var exp3 : Boolean = {
        if ( ( (sky == "sunny") || (sky == "partly cloudly") ) && 
           ( (temperature > 80 ) || (temperature < 20 ) ) )  {
           true
        }
        else {
          false
        }
    }
     
    println(exp3)
     
    //Exer4
    
    var fahrenheit : Int = 32
    
    var toCelcsConverter : Int = {
      ( ( (fahrenheit-32) * 5 ) /9 ) 
    }
     
    println(toCelcsConverter)
    
    //Exer5
    
     var celcius : Int = 0
    
     def toFahrConverter : Int = {
      return ( ( (celcius * 9 ) / 5 ) +32 )
    }
    
    println(toFahrConverter)
    
    
    //Below would be the solutions if having used methods instead.
  
    
    //Exer1
    
    
    def expression1 (sky: String , temperature: Int ) : Boolean = {
        if ( (sky == "sunny" ) && (temperature > 80 ) ) {
          return true
        }
        else {
          return false
        }
    }
    
    println("Testing the results of Expression1")
    println(expression1("sunny",81))
    println(expression1("sunny",78))
    println(expression1("raining",81))
    
    
    //Exer2
    def expression2 (sky: String, temperature: Int) : Boolean = {
        if ( ( (sky == "sunny") || (sky == "partly cloudly") ) && 
           ( (temperature > 80 ) ) )  {
           return true
        }
        else {
          return false
        }
    }
    
    println("Testing the results of Expression2")
    println(expression2("partly cloudly",85))
    println(expression2("partly cloudly",18))
    println(expression2("sunny",15))
    
     
    //Exer3
    def expression3 (sky: String, temperature: Int) : Boolean = {
        if ( ( (sky == "sunny") || (sky == "partly cloudly") ) && 
           ( (temperature > 80 ) || (temperature < 20 ) ) )  {
           return true
        }
        else {
          return false
        }
    }
    
    println("Testing the results of Expression3")
    println(expression3("partly cloudly",85))
    println(expression3("partly cloudly",18))
    println(expression3("sunny",15))
    
   //Exer4
    def expression4 (fahrenheit: Int) : Int = {
      return ( ( (fahrenheit-32) * 5 ) /9 ) 
    }
    
    println("Testing the results of Expression4")
    
    var x = 100 
    println(x +" Fahrenheits is equivalent to " +expression4(x) +" Celsius")
    x=32
    println(x +" Fahrenheits is equivalent to " +expression4(x) +" Celsius") 
    x=0
    println(x +" Fahrenheits is equivalent to " +expression4(x) +" Celsius")
     
  
    //Exer5
    def expression5 (celcius: Int) : Int = {
      return ( ( (celcius * 9 ) / 5 ) +32 )
    } 
   
   println("Testing the results of Expression5")
    
    x = 37 
    println(x +" Celsius is equivalent to " +expression5(x) +" Fahrenheits")
    x=0
    println(x +" Celsius is equivalent to " +expression5(x) +" Fahrenheits") 
    x= -17
    println(x +" Celsius is equivalent to " +expression5(x) +" Fahrenheits")
   
      // val f = (x:Double) => x * x
    //println(f(3))
   
 

  }
   
  
  
  
}