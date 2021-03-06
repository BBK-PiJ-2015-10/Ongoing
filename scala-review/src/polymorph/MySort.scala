package polymorph

object MySort {
  
  //This is an example of placing bounds
  def bubbleSort[A <%Ordered[A]](a: Array[A]){
    for (i <- 0 until a.length-1){
     for (j <- 0 until a.length-1-i ) {
       if(a(j+1)<a(j)){
         val temp = a(j)
         a(j) = a(j+1)
         a(j+1) = temp
       }
     } 
    }
  }
  
  def bubbleSortTwo[A](a: Array[A])(lt: (A,A)=> Boolean){
    for (i <- 0 until a.length-1){
     for (j <- 0 until a.length-1-i ) {
       if(lt(a(j+1),a(j))){
         val temp = a(j)
         a(j) = a(j+1)
         a(j+1) = temp
       }
     } 
    }
  }
  
  
  
  def main(args: Array[String]) {
  
    val nums = Array.fill(20)(util.Random.nextInt(100))
    println(nums.mkString(", "))
    bubbleSort(nums)
    println(nums.mkString(", "))
    
    val numsTwo = Array.fill(20)(util.Random.nextInt(100))
    bubbleSortTwo(numsTwo)(_>_)
    println(numsTwo.mkString(", "))
    
  }
 
}

