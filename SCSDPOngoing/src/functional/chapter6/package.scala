package functional

package object chapter6 {
  
  trait RNG {
    
    def nextInt: (Int,RNG)
    
  }
  
  case class SimpleRNG(seed: Long) extends RNG {
    
    def nextInt: (Int,RNG) = {
      val newSeed = (seed * 0x5DEECE66DL + 0xBL ) & 0xFFFFFFFFFFFFL
      val nextRNG = SimpleRNG(newSeed)
      val n = (newSeed >>> 16).toInt
      (n,nextRNG)
    }
    
    /*
    def randomPair(rng: RNG): ((Int,Int), RNG) = {
      val (i1,rng2) = rng.nextInt
      val (i2,rng3) = rng2.nextInt
      ((i1,i2),rng3)
    }
    */
    
  }
  
  type Rand[+A] = RNG =>(A,RNG)
  
  
  def main (args: Array[String] ) : Unit = {
    
    
    //val rng = SimpleRNG(42)
    
    /*
    
    val (n1, rng2 ) = rng.nextInt
    println(n1)
    println(rng2)
    
    val (n2, rng3 ) = rng2.nextInt
    println(n2)
    println(rng3)
    
    def randomPair(rng: RNG): ((Int,Int), RNG) = {
      val (i1,rng2) = rng.nextInt
      val (i2,rng3) = rng2.nextInt
      ((i1,i2),rng3)
    }
    
    println(randomPair(rng))
    
    */
    
    val int: Rand[Int] = _.nextInt
    
    def unit[A](a: A): Rand[A] =
      rng => (a,rng)
    
    def map[A,B](s: Rand[A])(f: A => B): Rand[B] = 
        rng => {
          val (a,rng2) = s(rng)
          (f(a),rng2)
        }
    
    
      
    //println("Testing this chapter 6")
    
    
    
  }
  
}