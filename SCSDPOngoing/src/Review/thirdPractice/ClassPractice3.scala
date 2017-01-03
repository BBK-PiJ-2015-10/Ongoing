package Review.thirdPractice

object ClassPractice3 extends App {
  
  //Practice of ZIP
  
  var left = Vector("a","b","c","d")
  var right = Vector (1,2,3)
  var names = Vector("x","y")
  
  //println(left.zip(right).zip(names))
  
  left.zip(0 to 4)
  left.zipWithIndex
  
    //Zip will make a set of tupples from the two vectors. Size equal the size
  //of the smalles vector.
  
  
  
  case class Person (name:String,ID:Int)
  val mynames = Vector("yasser","alejandro","alberto")
  val IDs = Vector (22,45,100)
  
  mynames.zip(IDs).map{
    case (a,b)=> Person(a,b)
  }
  
  //Examples of map
  
  val v = Vector(1,2,3,4)
  v.map(x=>x*6)
  var sum =0
  v.foreach(a=>sum+=a)
  
  println(v.reduce((accum,b)=>accum+b))
  
  //Examples of filter
  
  v.filter(_ % 2 != 0)
  v.filter(x=> x % 2 !=0)
  
  val evens = Range(0,10).filter(_%2 ==0)
  
  val evens2 = Range(0,10).map(Option(_).filter(_%2 ==0))
  
  //
  
  val list2 = List(1,2,3,4,5)
  
  def g(v:Int) = List(v-1,v,v+1)
  
  println(list2.map(x=>g(x)))
  
  println(list2.flatMap(x=>g(x)))

  //Example of Flatten
  
  
  val test1 = List("bir","tal")
  val test2 = List ("amor","rino")
  //val test3 = List("tonto",List(test1,test2))
  val results = List("ale","tonto","pala")
  
  
  
  
  val flattenresults = results.flatten
  
  //val flat3 = test3.flatten
  
  //println(flat3)
  
  //flat3.flatten
  
  
  //Operations in a List
  
  val lista = List(2,4,10)
  
  val listb = List(2,5,8,9)
  
  lista ++ listb
  //Concanates the list and returns a new one. first argument is first, then second.
  
  lista ::: listb
  
  lista :+ 345
  //Adding the element to the back
  
  345 +: lista
  //Adding the element to the front
  
  (100 /: lista)(_+_)
  
  1 :: lista
  
  (lista :\ 100)(_+_)
  
  
  val c = List("a","b","c")
  
  val ex = List(1,2,3)
  
  val res1 = ex.foldRight(0)(_+_)
  
  //println(res1)
  
  val resl = c.foldLeft("accum")("("+_+"/"+_+")")
  val resleft = ("accum" /: c)("("+_+"/"+_+")")
  //println("This is fold left")
  //println(resl)
  //println(resleft)
  
  val d = List(2,5,7)
  val resnleft = (100.0 /: d)(_/_)
  val resnl = d.foldLeft(100.0)(_/_)
   
  //println(resnleft)
  //println(resnl)
  
  
  val resright = (c :\ "accum")("("+_+"/"+_+")")
  val resr = c.foldRight("accum")("("+_+"/"+_+")")
  //println("This is foldright")
  //println(resright)
  //println(resr)
  
  val resnright = (d :\ 1.0)(_/_)
  val resnr = d.foldRight(1.0)(_/_)
  
  //println(resnright)
  //println(resnr)
  
  

  
  val listc = lista.head :: listb
  
  //Inserstion sort example
  
  //First insert method
  
  def insert(x:Int,xs:List[Int]):List[Int] =
    xs match {
     case List()=>List(x)
     case yh :: yt => 
       if (x<=yh) x :: xs
       else yh :: insert(x,yt)
  }
  
  def isort(xs:List[Int]):List[Int] =
     xs match {
       case List()=>List()
       case yh :: yt => insert(yh,isort(yt))
  }
  
  //This is an example of a manual filter
  
  def manfilter(p:Int=>Boolean)(lst:List[Int]):List[Int] = 
    lst match {
      case List()=>List()
      case lh :: lt =>
        if (p(lh)) lh :: manfilter(p)(lt)
        else manfilter(p)(lt)
  }
  
  val greaterthan10 = manfilter(x=>x>10)(_)
  
  val lessthan5 = manfilter(x=>x<5)(_)
  
  
  val list1 = List(10,5,2)
  
  //This is an example of a manual reduce to the left
  
  def mansumleft(lst:List[Int]):Int = 
    lst match {
      case List()=>0
      case xh :: xt => xh + mansumleft(xt)
  }
  
  def mansredright(accum:Double)(f:(Double,Double)=>Double)(lst:List[Int]):Double = 
    lst match {
      case List()=>accum
      case xh :: xt => f(xh,mansredright(accum)(f)(xt))
  }
  
  def mansredleft(accum:Double)(f:(Double,Double)=>Double)(lst:List[Int]):Double = 
    lst match {
      case List()=>accum
      case xh :: xt => f(mansredleft(accum)(f)(xt),xh)
  }
  
  
  //println(mansredright(10)(_/_)(list1))
  
  //println(mansredleft(10)(_/_)(list1))
  
  
  //type Student =(String,String)
  
  case class Student(name:String) 
  
  def manualMapper(f:Int=>Int)(lst:List[Int]):List[Int]=
     lst match {
       case Nil=>Nil
       case xh :: xt => f(xh) :: manualMapper(f)(xt)
  }
  
  
  
  //println(manualMapper(x=>x*x)(list1))
  
  
  //def
  
  
  

  
  
  //println(greaterthan10(list1))
  
  //println(lessthan5(list1))
  
    
  
  
  

             
  
  
  

  
  
}