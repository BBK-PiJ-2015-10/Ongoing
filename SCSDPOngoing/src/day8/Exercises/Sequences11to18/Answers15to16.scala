package day8.Exercises.Sequences11to18




object Func {
  
  def filter[A] (input:List[A])(p:A=>Boolean): List[A] =
    input match {
    case Nil => input
    case x:: xs => if (p(x)) x:: xs.filter(p) else xs.filter(p) 
  }
  
  
  def forall[A] (input:List[A])(p: A=>Boolean) : Boolean = { 
    input.isEmpty || (p(input.head) && (input.tail forall p))
  }
  
  def exists[A] (input:List[A])(p: A=>Boolean) : Boolean = { 
    input.isEmpty || (p(input.head) && (input.tail exists p))
  }
  
  
  //Answers to question 15
  
  def existsfilter[A] (xs:List[A])(p: A=>Boolean) : Boolean = { 
    def filter[A] (xs:List[A])(p: A=>Boolean) : List[A] = {  
      xs match {
        case Nil => Nil
        case y :: ys =>
          if (p(y)) y :: ys.filter(p)
          else ys.filter(p)
      }
    }  
    filter(xs)(p).length > 0
  }
   
  def forallfilter[A] (xs:List[A])(p: A=>Boolean) : Boolean = { 
    def filter[A] (xs:List[A])(p: A=>Boolean) : List[A] = {
    xs match {
        case Nil => Nil
        case y :: ys =>
          if (p(y)) y :: ys.filter(p)
          else Nil
      }
    }  
    filter(xs)(p).length == xs.length
  }
  
  //Answer to question 17
  
  def flatten[A](xs:List[List[A]]): List[A] = {
    (xs :\ (Nil: List[A])) {(x,xs)=> x::: xs} 
  }
  
  
}    
  
  



object Answers15to16 extends App {

  
  val list1 = List (1,2,3)
  
  assert(Func.forall(list1)(x=>x>2) == Func.forallfilter(list1)(x=>x>2))
  
  assert(Func.exists(list1)(x=>x>6) == Func.existsfilter(list1)(x=>x>6))
  
  
}