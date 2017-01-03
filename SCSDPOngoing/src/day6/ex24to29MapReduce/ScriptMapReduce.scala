package day6.ex24to29MapReduce

object ScriptMapReduce extends App {
  
  //Question 24
  
  val v = Vector (1,2,3,4)
  assert(v.map( n => n*11 + 10) == Vector(21,32,43,54))
  
  
  //Questions 25
  
  val v2 = Vector (1,2,3,4)
  assert(v2.foreach( n => n*11 + 10) == ())
  
  //*The output is only a ()
  
  //Question 26
  
  //Question 27
  
  val v3 = Vector(1,2,3,4)
  assert(v3.map(n => n + 1) == Vector(2,3,4,5))
  
 //Question 28
  
 //Question 29
  
  
  def sumIt(input: Int*) :Int = {
    input.reduce((sum, n) => sum + n)
  }
  
  assert(sumIt(1,2,3) == 6)
  assert(sumIt(45,45,45,60) == 195 )
   
  
  //v:+1
  

  
  
  
  
}