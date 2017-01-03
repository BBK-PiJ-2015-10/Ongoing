package Review

object AtomicPractice extends App {
  
  var first = Set(1,2,3,4)
  println(first)
  println(first.drop(1))
  println(first)
  
  var second = Array(5,6,7)
  second.update(1, 25)
  var s = ""
  println(second.mkString(" "))
  //second.
  println((Array(second).foreach { x => s = s + x + " "  }))
  
   println(s)
  //println(second.toString())
  
  /*
  println("This is a practice review")
  
  //Example of functions
  
  def cube (x:Int) :Int = {
    x*x*x
  }
  
  println(cube(3))
  
  
  //Example of Vectors
   
  val v1 = Vector(19.2,88.3,22.1)
  v1(1)
  v1.reverse
  v1.sorted
  v1.max
  v1.min
  println(v1)
  
  
  
  //Examples of classes
  
  class NoBody
  val nb = new NoBody
  
  class SomeBody {
    val name = "Janet Doe"
    println(name + " is SomeBody")
  }
  
  val sb = new SomeBody
  
  class EveryBody {
    val all = Vector(new SomeBody, new SomeBody, new SomeBody)
  }
  
  val eb = new EveryBody
  
  class Temperature {
    
    var current = 0.0
    
    var scale : String = _
    
    def setFahrenheit(now:Double):Unit = {
      current = now
      scale = "f"
    }
    
    def setCelsius(now:Double):Unit = {
      current = now
      scale = "c"
    }
    
    def getFahrenheit():Double  = {
      if (scale == "f")
        current
      else
        current * 9.0 /5.0 + 32
    }
    
    def getCelcius():Double  = {
      if (scale == "c")
        current
      else
        (current - 32 ) *5.0/9.0
    }
    
  }
  
  val temp = new Temperature
  temp.setFahrenheit(98.6)
  println(temp.getFahrenheit)
  println(temp.getCelcius)
  
 
  
  val v = Vector("Somewhere","over","the","rainbow")
  for (word <- v) {
    println(word)
  }

  var result : String = ""
   
  
  */
  //for (i <-Range(0,10)){
    //result += i + " "
  //}
  //println(result)
  
  //for (i <- Range(1,21,3)){
    //result += i + " "
  //}
  //println(result)
  
  //for ( i <- 0 until 10){
    //result += i +" "
  //}
  //println(result)
  
  
  //for ( i <- 0 to 10){
    //result += i + " "
  //}
  //println(result)
  
  //PatternMatching
  
  /*
  
  def matchColor(color:String) :String = {
    color match {
      case "red" => "RED"
      case "blue" => "BLUE"
      case _ => "UNKNOWN COLOR: " + color  
    }
  }
  
  println(matchColor("white"))
  
  class ClassArg(var a:Int) {
    //println(f)
    def f():Int = { a * 10}
  }
  
  //If you want a to be available outside the class body, you have to declare it as
  //a var or val.
  
  val ca = new ClassArg(19)
  println(ca.f)
  println(ca.a)
  
  ca.a = 25;
  
  class Sum(args:Int*){
    def result(): Int = {
      var total =0
      for (n <- args) {
        total +=n
      }
      total
    }
  }

  println(new Sum(13,27,44).result)
  
  
  
  class Color (red:Int, blue:Int, green:Int)
  
  new Color(red =80,9,10)
  
  class Color2 (val red:Int = 100, val blue:Int = 100, val green:Int = 100)
  val c = new Color2(20)
  println(c.red)
  
 
  class Coffee(val shots:Int =2, val decaf:Boolean = false, val milk:Boolean = false,
      val toGo:Boolean = false, val syrup:String = ""){
    
    var result=""
    
    def getCup():Unit = {
      if (toGo)
        result +="ToGoCup "
      else
        result += "HereCup "
    }
    
    def pourShots():Unit = {
      for (s <- 0 until shots)
        if(decaf)
          result +="decaf shot "
        else
          result +="shot "
    }
    
    def addMilk():Unit = {
      if (milk)
         result += "milk "
    }
    
    def addSyrup():Unit = {
      result += syrup
    }
    
    getCup()
    pourShots()
    addMilk()
    addSyrup()
    
  }
  
  val usual = new Coffee
  println (usual.result)
  
  val mocha = new Coffee(decaf = true, toGo = true, syrup ="Chocolate")
  println (mocha.result)
  
  
  class GardenGname(val height:Double, val weight:Double, val happy:Boolean){
    
    var painted = true
    
    def magic(level:Int):String = {
      "Poof! " + level
    }
    
    def this(height:Double) {
      this(height,100.0,true)
    }
    
    def this(name:String){
      this(15.0)
    }
    
    def show():String = {
      height + " " + weight + " " + happy + " " + painted
    }
    
  }
  
  
  println(new GardenGname(20.0,110.0,false).show())
  println(new GardenGname("Bob").show())
  
  
  
  case class Dog (name:String)
  
  val dog1 = Dog("Henry")
  val dog2 = Dog("Cleo")
  val dogs = Vector(dog1,dog2)
  
  case class Cat(name:String,age:Int)
  val cat1 = Cat("Miffy",3)
  
  println(cat1)
  
  
  def i(s:String, n:Int, d:Double):String  = {
    s"first: $s, second: $n, third: $d"
  }
  
  val c = i("hi",11,3.14)
  println(c)
  
  def f(n:Int):Int = {n*11}
  
  val c2 = s"f(7) is ${f(7)}!"
  println(c2)
  
  
  def explicit(c1:Char,c2:Char,c3:Char):Vector[Char] = {
    Vector(c1,c2,c3)
  }
  
  def inferred(c1:Char,c2:Char,c3:Char) = {
    Vector(c1,c2,c3)
  }
  
  println(inferred('a','b','c'))
  
  
  
  def show(n:Int):Unit = { println("> " +n ) }
  val v = Vector (1,2,3,4)
  v.foreach(show)
  v.foreach(n=> println("> " +n))
  
  val duck = "Duck".toVector
  duck.foreach(n=>println("> " +n))
  
  println(v.sortWith((i,j)=> j< i))
  
  
  
  class Later(val f: ()=>Unit){
    def call():Unit  = { f()}
  }
  
  val cl = new Later(()=>println("now"))
  cl.call()
  
 
  
  val later1 = () => println("now")
  val later2 = () => println("later")
  
  later1()
  later2()
  
 
  
  val v = Vector(1,2,3,4)
  println(v.map(n=>n*10))
  println(v)
  
  var sum = 0
  v.foreach(x=>sum +=x)
  println(sum)
  println(v.reduce((suma,n)=>suma+n))
     
  
  
  val v2 = Vector("D","U","C","K")
  println(v2.reduce((sum,n) => sum + n))
  
  
  def evenGT5(v:Vector[Int]):Vector[Int] = {
    var result = Vector[Int]()
    for {
      n <- v
      if n >5
      if n % 2 == 0
    } result = result :+ n
    result
  }
  
  val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
  println(evenGT5(v))
  
  def yielding(v:Vector[Int]):Vector[Int]={
    val result = for {
      n <- v
      if n < 10
      if n % 2 != 0
    } yield n
    result
  }
  
  def acceptAnything(input:Any):String  = {
    input match {
      case s:String => "A string: "+2
      case i:Int if (i<20) => s"An int less than 20: $i"
      case i:Int => s"Some other int: $i"
      case _ => "I don't know what this is!"
    }
  }
  
  println(acceptAnything(5))
  println(acceptAnything(Vector(1,2,3)))
  
 
  
  case class Passenger(first:String,last:String)
  case class Train (travelers:Vector[Passenger],line:String)
  case class Bus (passengers:Vector[Passenger],capacity:Int)
  
  def travel(transport:Any):String = {
    transport match {
      case Train(travelers,line)=> s"Train line $line $travelers"
      case Bus(travelers,seats)=> s"Bus size $seats $travelers"
      case Passenger => "Walking along"
      case what => s"$what is in limbo!"  
    }
  }
  
  val travelers = Vector(Passenger("Harvey","Rabbit"),Passenger("Dorothy","Gale"))
  val trip = Vector(Train(travelers,"Reading"),Bus(travelers,100))
  println(travel(trip(0)))
  println(travel(trip(1)))
  
   
  
  def data3(input:Double) ={
    if (input > 5.0)
      (input*2,"High",true)
    else
      (input /2,"Low",false,"test")
  }
  
  println(data3(4))
  
  def f = (1,3.14,"mouse","rat")
  println(f._1)
  println(f._3)
  
  
  
  
  object X {
    val n =2
    def f = n*10
    def g = this.n * 20
  }
  
  println(X.n)
  println(X.f)
  println(X.g)
   
  
 
 
  class X {
    def increment() = { X.n +=1; X.n}
  }  
  
  object X {
    var n:Int =0
  }
  
  var a = new X
  var b = new X
  println(a.increment())
  println(b.increment())
  println(a.increment())
  
  
  class GreatApe(val weight:Double, val age:Int)
  
  class Bonobo(weight:Double,age:Int) extends GreatApe(weight,age)
  class Chimpanzee(weight:Double,age:Int) extends GreatApe(weight,age)
  class BonoboB(weight:Double,age:Int) extends Bonobo(weight,age)
  
  
  
  
   abstract class WithValVar {
     
    val x: Int
    
    val y: Int
    
  }
  
  abstract class WithMethod {
    
    def f():Int
    
    def g(n:Double)
    
  }
  
  
  
  trait AllAbstract {
    def f(n:Int): Int
    val d:Double
  }
  
  trait PartialAbstract {
    def f(n:Int):Int
    val d:Double
    def g(s:String) = s"($s)"
    val j=42
  }
  
  trait Concrete {
    def f(n:Int) = n* 11
    val d =1.61803
  }
  
  class Klass2 extends AllAbstract {
    def f(n:Int) = n*12
    val d=3.1416
  }
  
  new Klass2
  
  class Klass3 extends AllAbstract with Concrete
  
  new Klass3
  
  class Klass4 extends PartialAbstract with Concrete
 
  
  sealed trait Color
  
  case object Red extends Color
  case object Blue extends Color
  case object Green extends Color
  
  object Color {
    val values = Vector(Red,Green,Blue)
  }
  
  def display(c:Color) = 
    c match {
      case Red => s"It's a $c"
      case Green => s"It's a $c"
      case Blue => s"It's a $c"      
    }
  
  println(Color.values.map(display))
  
  println(Color.values(1))
 
 
  
  val s = Vector(1,7,22,11,17)
  val test2 = List(1,7,22,11,17)
  
  s.isEmpty
  s.length
  println(s :+99)
  println(s)
  println(99 +:s)
  s.head
  s.tail
  s.last
  s.drop(3)
  s.dropRight(3)
  s.take(3)
  s.takeRight(3)
  s.slice(2,5)
  s(3)
  s.contains(22)
  s.indexOf(22)
  println(s.updated(3,16))
  println(s)
  s.patch(3,Nil,1)
  val seq2 = s ++ Seq(99,88)
  println(seq2)
  s.distinct.sorted
  println(s.reverse)
  println(s)
  s.intersect(seq2)
  s.min
  s.max
  s.startsWith(Seq(1,7))
  s.endsWith(Seq(11,17))
  s.sum
  s.product
  s.toSet
  
  
  
  def rPrint(s:Seq[Char]):Unit = {
    print(s.head +".")
    if(s.tail.nonEmpty)
      rPrint(s.tail)
  }
  
  rPrint("Recursion")
  
  
  def sumIt(toSum:List[Int],sum:Int=0):Int =
    if (toSum.isEmpty)
      sum
    else
      sumIt(toSum.tail,sum+toSum.head)
 
  println(sumIt(List(0,1,2,3,4)))    
        
  */
  
  //Left on page 314
  
  
  
}