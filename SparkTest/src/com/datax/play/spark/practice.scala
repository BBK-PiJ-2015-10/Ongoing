package com.datax.play.spark

object practice {
  
  val list = List("yasser","alejandro","palacios","otero")
  
  def main (args: Array[String] ) : Unit = {
    
    //test()
    
    println("Ale Tonto")
    
    var list2 = List("yasser","alejandro")
    
    var list3 = List("culon","biruta")
    
    //list2 = list2 :+ "mimasone"
    
    list2 = list2 :+ list3.apply(0)
    
    //var list3 = list2 :+ "ale"
      
    println(list2.size) 
    
    
    
  }
  
  def test() : List[String] = {
    var results = List()
     for ( i <- 0 to list.size-1){
     // val list2 = List("tontolone")
      results +: list.apply(i) 
      //println(list.apply(i))
    }
    println(results.size)
    return null
  }
  
  
  
}