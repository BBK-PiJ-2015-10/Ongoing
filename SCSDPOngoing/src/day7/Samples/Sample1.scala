package day7.Samples

object Sample1 extends App {
  
  val s1 = (1,2,3)
  s1._1
  s1._2
  
  
  def fun() = (1,"ashahsd")
  
  //println(fun()._1)
  
  val t = (1,2,3,4,5,6,7,8,9,10)
  
  val v = List("a","b","c","d")
  
  
  val s = List (1,2,3)
  
  // map
  
  def square(x: Int) :Int = x * x
    
  //println(s map(x => 2*x))
  //println(s)
  
  // filter
  
  val lst = List(s,s)
  
  println(s map (square))
  
  //lst flatMap (x: => x * x)
  
  //last flatMap ((x:Int)
  
  val l = List(1,2,3,4,5)
  
  l map (x=> x * 2)
  
  def f(x:Int) =
  { if (x>2) Some(x) else None }
     
  l map (x=> f(x))
  
  def g(x:Int) = List(x-1,1,x+1)
  
  g(3)
  
  
  //trait Option
  
  //case class Some (x: Object) extends Option
  
  //case object None extends Option
  
  val lst2 = List(7,8,9)
  l.length
  lst2.length
  
  val res = l zip lst2
  //println(res)
  
  //println(res.tail.head._2)
  
  //reduce
  
  //println(l reduce ((x,y) => x * y))
  
  
  val numbers = List(1,2,3)
  
  //println(numbers reduce ((x,y) => (x+y)))
  //println(numbers.fold(0)((x:Int,y:Int) => (x+y)))
  //println(numbers.fold(1)((x:Int,y:Int) => (x+y)))
  
  //Generics
  
  //Invariant
  
  //Java only handles invariant
  
  
  
  
  //Covariant
  
  
  
  //Contravariant
  
  
  
  
  
}