package multithreading

import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import actors.Futures;

object MultiExecutors {
  
  //Source: http://www.programmingusingscala.net/
  
  def main(args: Array[String]): Unit = {
    //calcFibWithExecutor
    calcFibWithParCollection
    //calcFibWithActorsFutures
  }
  
  def fib(n: Int): Int = {
    if (n<2) 1
    else fib(n-1)+fib(n-2)
  }
  
  /*
   * This is an example of calculating a Fibonaci with parallel collections
   */
  def calcFibWithParCollection {
    val values  = for (i <- (30 to 15 by -1).par) yield {
      val r = fib(i)
      println("Calc: " +r)
      r
    }
    //Adding the seq in case we want to print them sequentially
    values.seq.foreach(println)
  }
  
  /*
   * This is an example of calculating a fibonaci with an executor using 8 threads
   */
  def calcFibWithExecutor {
    val es = Executors.newFixedThreadPool(4)
    val futures = for (i <- 30 to 15 by -1) yield {
      es.submit(new Callable[Int] {
        def call: Int = {
          val r = fib(i)
          println("Calc : " +r)
          r
        }
      })
    }
    futures.foreach(f=> println(f.get()))
    es.shutdown()
  }
  
  
  //This is an example using simple actors future
  def calcFibWithActorsFutures {
    val futures = for (i <- 30 to 15 by -1) yield {
      actors.Futures.future {
        val r = fib(i)
        println("Calc : " +r)
        r
      }
    }
    futures.foreach(f=> println(f()))
  }
  
  
}