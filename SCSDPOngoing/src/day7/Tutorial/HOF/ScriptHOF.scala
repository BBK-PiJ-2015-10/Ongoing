package day7.Tutorial.HOF

object ScriptHOF extends App {
  
  println("This is a test")
  
  def id(x: Int) : Int = x
  
  def sumInts(a: Int, b:Int) :Int  = {
    if (a > b ) { 0 }
    else { a + sumInts(a+1,b) }
  }
  
  def cube(x: Int) : Int = { x*x*x }
  
  def sumCubes(a: Int, b:Int): Int = {
    if (a > b ) { 0 }
    else { cube(a) + sumCubes(a+1,b)}
  }
  
  def fact(x:Int) : Int = {
    if (x == 0 ) { 1 }
    else { x * fact(x-1) } 
  }
  
  def sumFactorials (a:Int, b:Int) : Int = {
    if (a>b) { 0 }
    else { fact(a) + sumFactorials(a+1,b)}
  }
  
  //println(sumInts(1,4))
  //println(sumCubes(1,4))
  //println(sumFactorials(1,4))
  
  //Now using a HLF
  
  def sum (f: Int=>Int, a:Int,b:Int) : Int = {
    if (a>b) { 0 }
    else { f(a) + sum(f,a+1,b) }
  }
  
  def sumInts2(a:Int, b:Int) = sum(id,a,b)
  def sumCubes2(a:Int, b:Int) = sum(cube,a,b)
  def sumFactorials2(a:Int,b:Int) = sum(fact,a,b)
  
  //println(sumInts2(1,4))
  //println(sumCubes2(1,4))
  //println(sumFactorials2(1,4))
  
  //Now using a HLF with anonymous functions
  
  def sumInts3(a:Int,b:Int) = sum(x=>x,a,b)
  def sumCubes3(a:Int,b:Int) = sum(x=>x*x*x,a,b)
  def sumFactorials3(a:Int,b:Int) = sum(x=>fact(x),a,b)
  
  //println(sumInts3(1,4))
  //println(sumCubes3(1,4))
  //println(sumFactorials3(1,4))
  
  
  //Now we are moving into Currying
  
  def sum2(f:Int=>Int):(Int,Int)=>Int = {
    def sumF(a:Int,b:Int): Int = {
      if (a>b) { 0}
      else { f(a) + sumF(a+1,b) }
    }
    sumF
  }
  
  def sumInts4 = sum2(x=>x)
  def sumCubes4 = sum2(x=>x*x*x)
  def sumFactorials4 = sum2(x=>fact(x))
  
  //println(sumInts4(1,4))
  //println(sumCubes4(1,4))
  
  //println(sum2 (x=>x*x*x)(1,4))
  
  //println(sumFactorials4(1,4))
  
  //println(sum2(cube)(1,4))
  
  
  def sum3(f:Int=>Int)(a:Int,b:Int):Int = {
    if (a>b) { 0 }
    else { f(a) + sum3(f)(a+1,b) }
  }
  
  //println(sum3(cube)(1,4))
  
  //println(sum3(x=>x*2)(1,4))
  
  
  
  
}