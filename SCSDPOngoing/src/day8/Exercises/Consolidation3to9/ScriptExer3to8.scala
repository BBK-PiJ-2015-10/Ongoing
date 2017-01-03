package day8.Exercises.Consolidation3to9

object One {
  
  def sqrtIter(guess: Double, x:Double):Double = 
    if (isGoodEnough(guess,x)) guess
    else sqrtIter(improve(guess,x),x)
  

  def improve(guess:Double,x:Double) = 
    (guess+x / guess ) /2
    
  def isGoodEnough(guess:Double,x:Double): Boolean =
    abs(square(guess) - x ) <0.000000000000000000001
    
  def sqrt(x:Double) = sqrtIter(1.0,x)
 
  def square(x:Double) = x * x
 
  def abs(x:Double) = if (x > 0) x else -x
    
 
}

object Factorials {
  
  def factorial(n: Int) : Int = {
    if ( n== 0 ) 1
    else n*factorial(n-1)
  } 
    
  def factorialTailRecursive(n:Int) : Int  = {
    def factorialAux(n: Int, accumulator: Int) : Int = {
      if ( n== 1) accumulator
      else factorialAux(n-1,n*accumulator)
    }
    factorialAux(n,1)
  }
  
}

object Functions {
  
  //This is the answer to question 5
  def sum(f:Int=>Int)(a:Int,b:Int): Int = {
     def iter (a: Int, accum:Int) : Int = {
         if (a>b) accum
         else iter(a+1,accum+f(a))
     }
     iter(a,0)
  }
  
  //This is my iterative answer to question 6
  def prod(f:Int=>Int)(a:Int,b:Int): Int = {
     def iter (a: Int, accum:Int) : Int = {
         if (a>b) accum
         else iter(a+1,accum*f(a))
     }
     iter(a,1)
  }
  
  //This is the answer to question 8
  //def general(f:Int=>Int)(a:Int,b:Int,r:Int)(g:(Int,Int)=>Int): Int = {
  def general(f:Int=>Int)(a:Int,b:Int)(g:(Int,Int)=>Int)(r:Int): Int = {  
     def iter (a: Int, accum:Int) : Int = {
         if (a>b) accum
         else iter(a+1,g(accum,f(a)))
     }
     iter(a,r)
  }
  
  //This is the answer to question 6 using recursion
  def productcurry(f:Int=>Int)(a:Int,b:Int):Int = {
    if (a==b) f(b)
    else f(a) * productcurry(f)(a+1,b)   
  }
  
  
  def sumlinear(f:Int=>Int):(Int,Int) => Int = {
    def sumF(a:Int,b:Int): Int =
      if (a>b) 0
      else f(a) + sumF(a+1,b)
    sumF
  }
  
  def sumcurry(f:Int=>Int)(a:Int,b:Int): Int = {
    if (a>b) 0
    else f(a) + sumcurry(f)(a+1,b)
  }
  
  def product(a:Int,b:Int): Int = {
    if ( a == b ) b
    else a*product(a+1,b) 
  }
  
  
  
  
  //This is the answer t question 7
  def factviaproduct(n:Int):Int = productcurry(x=>x)(1,n)
  
  
}
   


object ScriptExer3 extends App {
     
  //Answer to question 3
   
  assert(One.sqrtIter(1,0.000025) == 0.005)
  
  //Answer to question 4
    
  assert(Factorials.factorialTailRecursive(6) == Factorials.factorial(6) )
  
  
  //Answer to question 5
  
  def sumInts = Functions.sumlinear(x=>x)
  
  assert(Functions.sumcurry(x=>x)(2,7) == Functions.sum(x=>x)(2,7))
  
  assert(Functions.sumcurry(x=>x*x*x)(2,7) == Functions.sum(x=>x*x*x)(2,7))
  
  assert(Functions.sumcurry(x=>x/10)(2,7) == Functions.sum(x=>x/10)(2,7))
  
  //Answer to question 6
  
  assert(Functions.productcurry(x=>x)(2,9) == Functions.product(2,9))
  
  assert(Functions.productcurry(x=>x*x*x)(2,5) == 1728000)
  
  assert(Functions.productcurry(x=>x*x*x)(2,5) == Functions.prod(x=>x*x*x)(2,5))
  
       
  //Answer to question 7
  
  assert(Functions.factviaproduct(12) == Factorials.factorial(12))
  
 // Answer to question 8
 
 
 assert(Functions.general(x=>x*x*x)(2,4)((y,z)=>y*z)(1)== Functions.prod(x=>x*x*x)(2,4))
  
 assert(Functions.general(x=>x*x*x)(2,7)((y,z)=>y+z)(0) == Functions.sum(x=>x*x*x)(2,7))
 

 
  
  
}