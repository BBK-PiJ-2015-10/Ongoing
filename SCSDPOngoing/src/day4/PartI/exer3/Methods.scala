package day4.PartI.exer3

object Methods {
  
  def main (args: Array[String]): Unit = {
    
    //Exer1
    def getSquare (input : Int ) : Int = {
        return input * input
    }
    
    val a = getSquare(3)
    println(a)
    assert(a == 9)
    
    val b = getSquare(6)
    println(b)
    assert(b == 36)
    
    val c = getSquare(5)
    println(c)
    assert(c == 25)
    
    //Exer2
    
    def isArg1GreaterThanArg2 (input1 : Double , input2 :Double ) : Boolean = {
      if (input1>input2) {
        return true
      }
      else return false
    }
    
    val t1 = isArg1GreaterThanArg2(4.1,4.12)
    println(t1)
    assert(t1 == false)
    
    val t2 = isArg1GreaterThanArg2(2.1,1.2)
    println(t2)
    assert(t2 == true)
    
    //Exer3
    
    def manyTimesString (inputstring : String, times : Int ) : String = {
      var result = ""
      for ( i <- 1 to times) {
        result = result + inputstring
      }
      return result
    }
    
    val m1 = manyTimesString("abc",3)
    println(m1)
    assert("abcabcabc" == m1, "Failed to pass the test")
    
    val m2 = manyTimesString("123",2)
    println(m1)
    assert("123123" == m2, "Failed to pass the test")
    
    
  
    
    
    
    
  }
  
  
}