package day6.ExtraExercises.exer9CaseClasses

object ScriptCounter {
  
  def main (args: Array[String]): Unit = {
    
    println("Exercise 2")
    
    println(Counter(10).count)
    
    println(Counter(10).inc().count)
    
    println(Counter(10).inc(5).count)
    
    println(Counter(20).adjust(new Adder(6)).count)

    //println(new Counter(10).inc.dec.inc.inc.count)
    
    //val ca = new Counter(10)
    //println(ca.count)
    //println(ca.inc)
    //println("Let's see now")
    //println(ca.count)
    //println(ca.dec)
  }
  
 
 
}