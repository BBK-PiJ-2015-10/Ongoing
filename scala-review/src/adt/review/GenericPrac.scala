package adt.review

object GenericPrac {
  
  def main(args: Array[String] ) : Unit = {
    
    val plus2 = createAdder(a=>a+1)
    
    assert(plus2(50) == 101, "Expected 101, Got" +plus2(50))
    
    val func = twice(a => a * 2 +1)  
    
    assert(func(10) == 43, "Expected 43, Got " +func(10))
    
    val exclaim = twiceG((a: String) => a +"!")
    
    assert(exclaim("ale") == "ale!!","Expected ale!!, Got " +exclaim("ale"))
    
    
    val both = andThen(a => a + 1, a => a * 2)  
    
    assert(both(10) == 22,"Expected 22, Got " +both(10) )
    
    
    val bothG = andThenG(
    (a: Int) => a * 2.5,
    (a: Double) => "the answer is " +a
    )
    
    assert(bothG(3) == "the answer is 7.5","Expected the answer is 7.5, Got " +bothG(3) )
    
        
    
  }
  
  
  def createAdder(num: (Int) => Int) = 
    (input: Int) => input + num(input)
  
  
  def twice(f1: (Int) => Int) = 
    (input: Int) => f1(f1(input))
  
  def twiceG[A](f: (A) => A) =
    (input: A) => f(f(input))
    
  
  def andThen(f1: (Int) => Int, f2: (Int) => Int)=
    (input: Int) => f2(f1(input))
  
  def andThenG[A, B, C](f1: (A) => B, f2: (B) => C) =
    (input: A) => f2(f1(input))
  
  
}