package day4.PartI.exer4

object CO {
  
  def main (args: Array[String]): Unit = {
       
    //Question1
    
    var r1 = 0 until 10
    println(r1.step)
 
    var r2 = new Range(0,10,2)
    println(r2.step)
    
    println("The default step value is 1")
    
    //Question2
    
    var s1 = "Sally"
    
    var s2 = "Sally"
    
    if((s1.equals(s2)==true)){
      println("They are the same")
    }
    else {
      println("They are different")
    }
    
    //Question3
    
    val hippo1 = new Hippo()
    
    val lion1 = new Lion()
    
    val tiger1 = new Tiger()
    
    val monkey1 = new Monkey()
    
    val giraffe1 = new Giraffe()
    
    println(hippo1)
    println(lion1)
    println(tiger1)
    println(monkey1)
    println(giraffe1)
    
    val lion2 = new Lion()
    
    val giraffe2 = new Giraffe()
    
    val giraffe3 = new Giraffe()
    
    var giraffe4 = giraffe3
    
    giraffe4 = giraffe2
    
    println(lion2)
     
    println(giraffe2)
     
    println(giraffe3)
    
    println(giraffe4)
     
    
    
  }
  
  
  
}