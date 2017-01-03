package day7.Exercises.ex1to4MapReduce

object MapReduce extends App {
 
  //Question 1
  
  var v = Vector (1,2,3,4)
  println(v.map(n=>n+1))
 
    
  assert(v.map(n=>n*11+10) == Vector(21,32,43,54))
  
  
  //Question 2
  
  //Question 3
  
  //Question 4
  
  def sumIt(input: Int*) : Int ={
    input.reduce((sum,n) => sum + n )
  }
  
  println(sumIt(1,2,3))
  
  assert(sumIt(1,2,3) == 6 )
  assert(sumIt(45,45,45,60) == 195 )
 
}