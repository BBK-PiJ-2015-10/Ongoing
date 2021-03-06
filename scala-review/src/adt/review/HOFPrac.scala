package adt.review

object HOFPrac {
  
  def main(args: Array[String] ) : Unit = {
   
    val cubes = sum(x => x*x*x,2,3)
    
    val cubesF = sumF(x => x*x*x)_
    
    assert(cubes == cubesF(2,3))
    
    /*
     * https://www.youtube.com/watch?v=kkTFx3-duc8
     * 
     * Left on minute 39.41
     * 
     */
    
  }
  
  def sum(f: Int => Int , a: Int, b: Int ): Int = {
    if (a > b) 0 
    else f(a) + sum(f,a+1,b)
  }
  
  def sumF(f: Int => Int)(a: Int, b: Int ): Int = {
    if (a > b) 0 
    else f(a) + sum(f,a+1,b)
  }
  
  
}