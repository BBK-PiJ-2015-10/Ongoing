package day8.Exercises.Sequences11to18

abstract class IntTree

  
case object EmptyTree extends IntTree

case class Node(elem:Int,left:IntTree,right:IntTree) extends IntTree

object Functions {
 
  def contains(t:IntTree,v:Int): Boolean = {
    t match {
       case EmptyTree => false
       case Node(elem:Int, left:IntTree, right:IntTree) => {
         if ( v == elem ) true
         else if ( v < elem) contains (left,v)
         else contains (right,v)
       }      
     }
  }
  
  def insert(t:IntTree,v:Int): IntTree = 
     t match {
       case EmptyTree => Node(v,EmptyTree,EmptyTree)
       case Node(elem:Int,left:IntTree,right:IntTree) => {
         if ( v < elem) {
           Node(elem,insert (left,v),right)
         }
         else {
           Node(elem,left,insert (right,v))
         }
       }
    
  }
  
}



object Answer11 extends App {
  
  val test1 = Node(1,EmptyTree,EmptyTree)
  
  assert(Functions.contains(test1,1) == true)
  assert(Functions.contains(test1,3) == false)
  
  val test2 = Functions.insert(test1,6) 
  
  println(Functions.insert(test2,4)) 
  
  
}