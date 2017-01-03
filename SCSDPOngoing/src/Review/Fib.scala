package Review

object Fib extends App {
  
  def fib(n:Int):Int = {
    if (n <= 2 ) {
      1
    }
    else {
      fib(n-1) + fib(n-2)
    }
  }
  
  import scala.annotation.tailrec
  def fibrec(n:Int):BigInt = {
    @tailrec
    def fibHelper(x:Int,prev:BigInt=0,next:BigInt =1):BigInt =
      x match {
        case 0 => prev
        case 1 => next
        case _=> fibHelper(x-1,next,next+prev)
      }
    fibHelper(n)
  }
  
  println(fib(7))
  
  println(fibrec(7))
  
  //val memofib = memo(fibrec)
  
  /*
  def memo(X,Y)(f: X->Y):X=>Y = {
    val cache = collection.mutable.Map{X,Y]()
    (x: X) => {
      (cache get x) match {
        case Some(y
      }
    }
    }
  }
  */
}