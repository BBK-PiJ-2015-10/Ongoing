package day4.partII

import day4.PartI.exer5.{Flare,Motorboat,Sailboat,MIC}
import day4.PartI.exer6.{Cup => ImportedCup}

object ImporterScript {
  
  def main (args: Array[String]): Unit = {
 
    val motorboat = new Motorboat()
    println(motorboat.on())
    
    val importedCup = new ImportedCup
    println(importedCup.get())
    
  }
  
     
}