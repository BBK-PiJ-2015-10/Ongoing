package Review.firstRevision


object ClassSamples1 extends App {
  
  //example of currying function
  def f (x:Int)(y:Int) = x*y
  
  def timestwo = f(2)_
  //println(timestwo(5))
  
  def timesthree = f(3)_
  //println(timesthree(5))
  
  //example of a partially applied function
  def x= f(3)_
  var n = x(4)
  //println(n)
  
  def g(x:Int, y:Int) = x+y
  
  //example of a partially applied function
  def zz = g(3,_:Int)
  //println(zz(3))
  
  
  def ff(x:Int):Int => Int = x * _
  
  def xx = ff(3)
  //println(xx(10))
  
  def thrice = ff(3)
  
  thrice(6)
  
  def mul(x:Int)(y:Int)(z:Int)(r:Int) = x * y * z * r
  
  def mul1 = mul(3)_
  def mul2 = mul1(2)
  println(mul2(5))
  
  def add (x:Int)(y:Int)(z:Int) = x*y*z
  
  def addlast = add(_:Int)(_:Int)(3)
  
  def xxx = addlast(_:Int,4)

  
  
  
  
}