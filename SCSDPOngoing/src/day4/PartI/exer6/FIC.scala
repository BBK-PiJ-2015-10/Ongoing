package day4.PartI.exer6

object FIC {
  
   def main (args: Array[String]): Unit = { 
     
     //question1
     val cup = new Cup()
     
     assert(cup.add(45) == 45)
     assert(cup.add(-15) == 30)
     //assert(cup.add(-50) == -20)
     
     //question2
     val cup2 = new Cup()
     
     assert(cup2.add(45) == 45)
     assert(cup2.add(-55) == 0)
     assert(cup2.add(10) == 10)
     assert(cup2.add(-9) == 1)
     assert(cup2.add(-2) == 0)
     
     cup2.percentFull = 56
     //cup2.percentFull is 56
     //First one worked, since the default visibility is Package.
     
     val cup3 = new Cup()
     cup3.set(56)
     assert(cup3.get() == 56)
     
     
     
    
     
   }
   
   
  
  
}