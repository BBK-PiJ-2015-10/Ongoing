package day4.PartI.exer7

import scala.collection.immutable.Vector



object VectorsScript {
  
  def main (args: Array[String]): Unit = { 
    
    //var first = new Vector[Int]
    
    //val v = DoubleVector(1,2,3,4,5)
    //val v = new DoubleVector(1, 2, 3, 4, 5, 6)

    //val vec = scala.collection.immutable.Vector.empty
    
    //Question1
    
    val t1 = Vector (1,2,3,4)
    val t2 = Vector ("Yasser","Alejandro","Palacios")
    val t3 = Vector ()
    val c1 = new Cup()
    val c2 = new Cup()
    val c3 = new Cup()
    val t4 = Vector (c1, c2, c3)
    
    //Question2
    
    val vv = Vector (t1,t2,t3)
    
    //Question3
    
    val t45 = Vector ("The","dog","visited","the","fire","station")
    
    var friend : String = ""
    var sentence : String = ""
    
    for ( friend <- t45) {
      sentence = sentence +" "+ friend
    }
    
    
    println(sentence.toString())
    
    //assert(sentence == "The dog visited the fire station", "Expected: The dog visited the fire station" +" got" +sentence)
   
    
    
    
  }
  
  
  
}