package day6.ExtraExercises.exer3

object ScriptCounter {
  
  def main (args: Array[String]): Unit = {
    
    println("Exercise 2")
    
    println(new Counter(10).count)
    
    println(new Counter(10).inc().count)
    
    println(new Counter(10).inc(5).count)
    
    println(new Counter(20).adjust(new Adder(6)).count)

    //println(new Counter(10).inc.dec.inc.inc.count)
    
    //val ca = new Counter(10)
    //println(ca.count)
    //println(ca.inc)
    //println("Let's see now")
    //println(ca.count)
    //println(ca.dec)
  }
  
 
 
}