package Review

object Flatten extends App {
  
  def flatten2(lst:List[_]):List[Any] = {
    lst match {
      case List()=> List()
      case (lh: List[_]) :: lt => flatten2(lh) ::: flatten2(lt)
      case lh :: lt  => lh :: flatten2(lt)
    }
  }
  
  
  //def flatten1(list:List[_]):List[Int] = {
    //var result :List[Int] = List()
    //if (list.nonEmpty){
      //result :+ list.head
      //flatten1(list.tail)
    //}  
    //result 
  //}
  
  
  val a = List(1,2,3)
  val b = List(4,5,6)
  val c = List(7,8,9,b)
  
  println(flatten2(c))
  
  
  
  //def fLl
  
  
  
}