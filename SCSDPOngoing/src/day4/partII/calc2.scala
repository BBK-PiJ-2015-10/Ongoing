package day4.partII

object calc2 {
  
    def square(input : Double) : Double = {
      return input*input
    }
  
    def cube(input : Double) : Double = {
      return square(input) * input
    }
  
    def square(input : Int) : Int = {
      return input*input
    }
  
    def cube(input : Int) : Int = {
      return square(input) * input
    }
  
  
}