package multithreading

object ParallelScript {
  
  def main(args: Array[String]): Unit = {
    
    //This is to convert the sequence int parallel
    val p = (1 to 100).par
    
    //This is to convert the parallel back into a sequence
    val s = p.seq
    
    Array(1,2,3).par
    
    //List are not parallel in scala, instead use vector. They will conver it to a vector
    //but with a n order performance instead of 1 performance of the other containers
    List(1,2,3).par
    
    Vector(1,2,3).par
    
    //(1 to 100)
  
    println("ale tonto")
    
  }
  
  
  
  
}