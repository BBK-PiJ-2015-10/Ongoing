package day6.ex17to19ParameterisedTypes

object ParameterisedTypesScript extends App {
  
  
  
  def inferred(c1: Char, c2:Char, c3:Char) = {
    Vector (c1,c2,c3)
  }
  
  def explicit(c1:Char, c2:Char, c3:Char) :Vector[Char] = {
    Vector (c1,c2,c3)
  }
  
  assert(inferred('a','b','c') == Vector('a','b','c'))
  
  assert(explicit('a','b','c')== Vector('a','b','c'))
  
  //Answer to question 17
  
  def explicitDouble(c1:Any, c2:Any, c3:Any) :Vector[Any] = {
    Vector (c1,c2,c3)
  }
  
  assert(explicitDouble(1.0,2.0,3.0) == Vector(1.0,2.0,3.0))
  
  
  //Answer to question 18
  
  def explicitList(c1:Vector[Double]) :List[Double] = {
     return c1.toList
  }
  
  assert(explicitList(Vector(10.0,20.0)) == List(10.0,20.0))
  assert(explicitList(Vector(1,2,3)) == List(1.0,2.0,3.0))
  
  //Answer to question 19
  
  def explicitSet(c1:Vector[Double]) :Set[Double] = {
    return c1.toSet
  }
  
  assert(explicitSet(Vector(10.0,20.0)) == Set(10.0,20.0))
  assert(explicitSet(Vector(1,2,3,2,3,4)) == Set(1.0,2.0,3.0,4.0))
    
}