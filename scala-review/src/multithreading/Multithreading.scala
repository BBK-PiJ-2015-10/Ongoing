package multithreading

import java.util.concurrent.atomic.AtomicInteger

/*
 * Concurrency:
 * 
 * Parallelism:
 * 
 */

object Multithreading {
  
   def main(args: Array[String]): Unit = {
     //simpleCollisions
     println("Ale Tonto")
   }
   
   case class Particle(x:Double,y:Double,vx:Double,vy:Double,radios:Double) {
     def quadrant: Int = (if(x>0) 1 else 0) + (if(y>0) 2 else 0)
   }
   
   val dt = 0.01
   
   def simpleCollisions {
     val particles = Array.fill(10000)(Particle(math.random-0.5,
       math.random-0.5,math.random-0.5,math.random-0.5,0.01))
     val groups = particles.groupBy(_.quadrant)
     var completeCount = 0
     val threads = for(i <-0 to 3) yield {
       new Thread(
         new Runnable {
           val parts = groups(i)
           def run {
             for(step <-1 to 10 ) {
               val overlapIndices = findOverlaps(parts)
               Multithreading.synchronized{
                 if (completeCount < 3){
                   completeCount += 1
                   Multithreading.wait
                 } else {
                   Multithreading.notifyAll
                   completeCount = 0
                 }
              }
               //check for collisions
               handleOverlaps(parts,overlapIndices)
               advanceParticles(parts)
               //exchange particles
      
             }
           }
         }
       )
     }
     threads.foreach(_.start)
   }
  
  def findOverlaps(parts: Array[Particle]): List[(Int,Int)] = {
    
    Nil
  }
  
  def handleOverlaps(parts: Array[Particle], overlaps: List[(Int,Int)]) = {
    
  }
  
  def advanceParticles(parts: Array[Particle]){
    for (i <- parts.indices ) {
      parts(i) = parts(i).copy(x=parts(i).x+dt*parts(i).vx,y=parts(i).y+dt*parts(i).vy)
    }
  }
  
  def countingAndRaceConditions(): Unit = {
    
    //Example of minimizing the section that is protected, leveraging local variables
    //inside runnable
    var cnt=0
    val start = System.nanoTime()
    val threads = for (i <- 1 to 10 ) yield {
      new Thread(new Runnable {
        def run {
          var c = 0
          for (j <-1 to 10000000) {
            c +=1
          }
          Multithreading.synchronized {
            cnt += c
          }
        }
      })
    }
    threads.foreach(_.start())
    threads.foreach(_.join)
    println((System.nanoTime()-start)/1e9)
    println(cnt)
    
    
    //This is an example using an array
    /*
    var cnt=0
    val start = System.nanoTime()
    val cnts = Array.fill(10)(0)
    val threads = for (i <- cnts.indices ) yield {
      new Thread(new Runnable {
        def run {
          var c = 0
          for (j <-1 to 10000000) {
            c +=1
          }
          cnts(i) += c
        }
      })
    }
    threads.foreach(_.start())
    threads.foreach(_.join)
    println((System.nanoTime()-start)/1e9)
    println(cnts.sum)
    */
    
    
    //This is an example using atomic values
    /*
    var acnt = new AtomicInteger(0)
    val start = System.nanoTime()
    val threads = for (i <- 1 to 10) yield {
      new Thread(new Runnable {
        def run {
          for (j <-1 to 1000000) {
            acnt.addAndGet(1)
          }
        }
      })
    }
    threads.foreach(_.start)
    threads.foreach(_.join)
    println((System.nanoTime() - start)/ 1e9)
    println(acnt)
    */
    
    //Use case illustrating the use of join and synchronization
    /*
    var cnt=0
    val start = System.nanoTime()
    val threads = for (i <-1 to 10) yield {
      new Thread(new Runnable {
        def run {
          for (j <-1 to 10000000) Multithreading.synchronized {
            cnt +=1
          }
        }
      })
    }
    threads.foreach(_.start())
    println(cnt)
    threads.foreach(_.join)
    println((System.nanoTime()-start)/1e9)
    println(cnt)
    
   
    
    //This is sequential
    
    val start2 = System.nanoTime()
    cnt = 0
    for (j <- 1 to 100000000) Multithreading.synchronized {
      cnt +=1
    }
    println((System.nanoTime()-start2)/1e9)
    println(cnt)
    
    */
    
    //Very simple use case
    /*
    new Thread(new Runnable {
      def run {
        for (i <- 1 to 15) {
          println(i)
          Thread.sleep(200)
        }
      }
    }).start
    
    for (c <- 'A' to 'Z'){
      println(c)
      Thread.sleep(100)
    }
   
  */
    
  }
  
  
  
}