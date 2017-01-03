package Review

object FoldExample extends App {
  
  
  val lst = List(2,4,8)
  
  lst.fold(0)((x,y)=> x+y)
  
  lst.fold(0)(_+_)
  
  lst.reduce(_+_)
  
  println(lst.foldRight(1.0)(_ / _))
  
  println(lst.foldLeft(1.0)(_/_))
  
  //lst.filter(_>3).reduce(_+_)
  
  (1.0 /: lst)(_/_)
  (lst :\ 1.0)(_/_)
  
  
  
}