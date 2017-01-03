package IntReview

object Day4Review extends App {
  
  println("I will get a job in England")
  
  /*
  
  var sky : String = "cloudy"
  var temp : Integer = 90
  
  var exp1 : Boolean = {
    if ( (sky == "cloudy") && (temp > 80)) {
      true } 
    else {
      false
    }
  }
  
  println(exp1)
  
  sky = "cloud"
  temp = 71
  
  println(exp1)
  println(sky)
  println(temp)
  
  */
  
  /*
  
  def sumInt(a: Int, b:Int): Int = {
    if (a > b ) {
      0
    }
    else {
     1 + sumInt(a+1,b) 
    }
  }
  
  def id (x:Int) :Int = x
  
  def cub(x:Int) :Int = x*x*x
  
  def fact(a:Int) :Int = {
    if (a == 0){
      1
    } else {
      a * fact(a-1)
    }
  }
  
  def sumCubes1(a:Int,b:Int): Int = {
    if (a>b){
      0
    }
    else {
      cub(a)+sumCubes(a+1,b)
    }
  }
  
  
  println(fact(3))
  
  def sum (f:Int=>Int,a:Int,b:Int) : Int = {
    if (a>b) {
      0
    }
    else {
      f(a) + sum(f,a+1,b)
    }
  }
  
  def sumInts(a:Int,b:Int) = sum(id,a,b)
  
  def sumCubes(a:Int,b:Int) = sum(cub,a,b)
  
  def sumFact(a:Int,b:Int) = sum(fact,a,b)
  
  */
  
  def sum(f:Int=>Int):(Int,Int) => Int = {
    def sumF(a:Int,b:Int):Int = {
      if (a>b) {
        0
      } else {
        f(a)+sumF(a+1,b)
      }
    }
    sumF
  }
  
  def sumInts = sum(x=>x)
  
  sumInts(1,3)
  
  def sumCubes = sum(x=>x*x*x)
  
  println(sumCubes(1,4))
  
  
  println(sum(x=>x*x*x)(1,4))
  
}