package day8.Exercises.Sequences11to18

object Function {
  
  def isort(xs: List[Int]) : List[Int] = {
    if (xs.isEmpty) Nil
    else insert (xs.head,isort(xs.tail))
  }

  //Answer to question 12
  
  def insert(x:Int,xs:List[Int]) : List[Int] = {
     xs match {
        case List() => List(x)
        case y :: ys =>
           if (x <= y) x :: xs
           else y :: insert(x,ys)
     }   
  }
  
  def length(l:List[Int]): Int =
    l match {
    case Nil => 0
    case x :: xs => 1 + length(xs)
  }
  
  
  //Answer to question 13
  
  def recursivelength(l:List[Int]): Int = {
    def flength(l:List[Int],r:Int): Int = {
      l match {
       case Nil => r
       case x :: xs => flength(xs,r+1)
      }
    }  
    flength(l,0)  
  }
  
  
  //Answers to question 14
  
  def squareList(xs:List[Int]) : List[Int] = 
    xs match {
      case List() => List()
      case y :: ys => math.pow(y,2).toInt :: squareList(ys) 
  }
  
  def squareList2(xs:List[Int]) : List[Int] = 
    xs map (x=>math.pow(x,2).toInt)
    
  
}

object Answer12 extends App {
  
  println("This is a test")
  
  val list1 = List(2,4,1)
  
  //Tests for question 12
  
  assert(Function.insert(3,list1) == List(2,3,4,1))
  
  assert(Function.isort(list1) == List(1,2,4))
  
  //Tests for question 13
  
  assert(Function.length(list1) == Function.recursivelength(list1))
  
  println(list1.length)
  
  //Tests for question 14
  
  assert(Function.squareList(list1) == List(4,16,1))
  
  assert(Function.squareList2(list1) == Function.squareList(list1))
  
 
  
}