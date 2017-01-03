package functional.chapter2

object MyModule {
  
  def main(args: Array[String]): Unit = {
    
      println("Welcome to chapter 2")
      
      println(factorial(3))
      
      println(findFirst( Array(7,9,13),(x: Int) => x ==9 ))
      
  }
  
  private def abs(n: Int) = {
    if (n < 0) -n
    else n
  }
  
  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x,abs(x))
  }
  
  private def factorial(x: Int): Int = {
    def go (n:Int,accu:Int): Int = {
      if (n == 1) accu
      else go(n-1,n*accu)
    }
    go(x,1)
  }
  
  private def findFirst(ss :Array[String], key :String) :Int = {
    @annotation.tailrec
    def loop(n :Int) :Int = {
      if (n >= ss.length-1) - 1
      else if (ss(n) == key ) n
      else loop (n+1)  
    }
    loop(0)
  }
  
  private def findFirst[A](as: Array[A], p: A => Boolean) : Int = {
    @annotation.tailrec
    def loop (n :Int): Int = {
      if (n >= as.length-1) -1
      else if (p(as(n))) n
      else loop (n+1)
    }
    loop(0)
  }
  
  private def partial1[A,B,C](a: A, f: (A,B) => C): B => C = {
    (b) => f(a,b)
  }
  
  
}