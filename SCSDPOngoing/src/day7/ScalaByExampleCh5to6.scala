package day7

object ScalaByExampleCh5to6 extends App {
  
  def abs(x:Double) = { if (x>0) x else - x }
  
  //Chapter 5
  
  println(abs(5))
  println(abs(-5))
  
  def sqrtIter(guess: Double, x:Double) :Double = {
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess,x),x)
  }
  
  def improve(guess:Double, x:Double) = {
    (guess + x / guess ) /2
  }
  
  def square(x:Double) : Double = {
      x * x
  }
  
  
  def isGoodEnough(guess:Double, x:Double) = {
    abs(square(guess) - x ) < 0.001
  }
  
  def sqrt (x:Double) = sqrtIter(1.0,x)
  
  //Examples
  
  def sumInts(a: Int,  b:Int): Int = {
    if (a>b) {
      0
    }
    else {
      a + sumInts(a+1,b)
    }
  }
  
  println(sumInts(1,4))
  
  //Example
  
  def id(x:Int):Int = x
  
  def SumInts2(a:Int,b:Int) : Int = sum2(id,a,b)

  
  def sum2(f: Int=> Int, a:Int,b:Int):Int =
  {
    if (a > b) 0
    else {
      f(a) + sum2(f,a+1,b)
    }
  }
  
  println(SumInts2(1,4))
  
  //Next Examples
  
  def sumInts3(a:Int, b:Int): Int = {
    sum2((x:Int)=>x,a,b)
  }
  
  println(sumInts3(1,4))
  
  //Next Examples
  
  def sum4(f:Int =>Int): (Int, Int)=>Int = {
    def sumF(a: Int, b:Int):Int = {
      if (a>b)  0
      else f(a) + sumF(a+1,b)
    }
    sumF
  }
  
  def id4 = sum4(x=>x)
  
  println(id4(1,4))
  
  
  println("I hope this works")
  
}