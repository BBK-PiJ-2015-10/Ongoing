package day8.Exercises.Consolidation3to9

trait IntSet {
  
  def incl(x:Int): IntSet
  
  def contains(x:Int): Boolean
    
  def append(other:IntSet) : IntSet
  
  def union(other:IntSet) : IntSet
  
  def intersect(other:IntSet) : IntSet
  
  def excl(x: Int) : IntSet
  
  def isEmpty:Boolean
  
}

case class EmptySet() extends IntSet {
  
  override def contains(x:Int):Boolean = false
  
  override def incl(x:Int):IntSet = 
    new NonEmptySet(x,new EmptySet, new EmptySet)
  
  def append(other:IntSet): IntSet = other
   
  def union(other:IntSet) : IntSet  = other
  
  def intersect(other:IntSet) : IntSet = this
  
  def excl (x:Int): IntSet = this
  
  def isEmpty:Boolean = true
  
}

case class NonEmptySet(elem: Int, left:IntSet, right:IntSet) extends IntSet {
  
  override def contains(x:Int):Boolean = 
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
    
  override def incl(x:Int): IntSet =
    if (x<elem) new NonEmptySet(elem,left incl x, right)
    else if (x > elem) new NonEmptySet(elem,left, right incl x)
    else this
    
   def append(other:IntSet): IntSet = {
      val set = left.append(right.append(other))
      set.incl(elem)    
    }
  
   def union(other:IntSet) : IntSet  = append(other)
   
   def intersect(other:IntSet) : IntSet = {
     val l = left.intersect(other)
     val r = right.intersect(other)
     val s = l.union (r)
     if (other.contains(elem)) s.incl(elem) else s
   }
   
   
   def excl (x:Int): IntSet = {
     if (x<elem) new NonEmptySet(elem,left.excl(x),right)
     else if (x>elem) new NonEmptySet(elem,left,right.excl(x))
     else left.append(right)    
   }
   
   def isEmpty: Boolean = false
  
  
  
  
      

}


object ScriptExer9 extends App {
    
  val set1 : IntSet =  NonEmptySet(1,EmptySet(),EmptySet())
  println(set1)
  val set2 : IntSet =  NonEmptySet(2,EmptySet(),EmptySet())
  println(set2)
  val set3 = set1 union set2
  println(set3)
  val set4 = set3 excl(1)
  println(set4)
  val set5 = set1 intersect set2
  println(set5)
  
 
  
  
}