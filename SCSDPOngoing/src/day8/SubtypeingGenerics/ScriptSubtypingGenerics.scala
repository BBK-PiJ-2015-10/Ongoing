package day8.SubtypeingGenerics

class IntSet {
  
}

class NonEmpty extends IntSet {
  
}

class Empty extends IntSet {
  
}



object ScriptSubtypingGenerics extends App {
  
  val c : Int = 4
  
  val a : Empty = new Empty
  
  //val a: Array[NonEmpty] = Array(new NonEmpty)
  
  
   
  //def assertAllPos(s: IntSet): IntSet
  
  //def assertAllPos[S <: IntSet](r: S):S = 
  
  //def assetAllPos[S >: NonEmpty](r: S):S =
  
  //def assetAllPos[S >: NonEmpty <: IntSet]
  
  
  
  //var k = new IntSet
  
}