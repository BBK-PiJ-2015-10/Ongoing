package Review.secondRevision

sealed trait Expr

final case class Number(num:Double) extends Expr

final case class Var(name:String) extends Expr

final case class Plus(left:Expr, right:Expr) extends Expr

final case class Fun(param:String,body:Expr) extends Expr

final case class App2(fun:Expr, arg:Expr) extends Expr

final case class Let (name:String, expr:Expr, body:Expr) extends Expr

trait Value

case class NumValue(num: Double) extends Value

case class ClosureValue(param:String,body:Expr,env:Evaluation.Env) extends Value

object Operations {
  
  def reduce(expr:Expr) = 
    expr match {
     case Plus(Number(i),Number(j))=>Number(i+j)
     case Plus(Number(0),e)=>e
     case App2(Fun(param,body),e)=>Let(param,e,body)
     case Let(x,e,Var(y)) if x==y=>e
     case _=>expr
  }
  
  def simplify(expr:Expr) :Expr = 
    expr match {
     case Number(d)=>Number(d)
     case Var(name)=>Var(name)
     case Plus(left,right) =>reduce(Plus(simplify(left),simplify(right)))
     case Let(name,expr,body)=> Let(name,simplify(expr),simplify(body))
     case Fun(param,body)=>Fun(param,simplify(body))
     case App2(fun,arg)=>reduce(App2(simplify(fun),simplify(arg)))
  }
    
}


object Evaluation {
  type Env = Map[String,Value]
  
  def makeEnv():Env = Map()
  
  val num: Value =>Double = {
    case NumValue(num) => num
  }
  
  def plus(x:Value,y:Value) = NumValue(num(x)+num(y))
  
  def eval(expr: Expr):Value = eval(expr,makeEnv())
  
  def eval(expr:Expr,env:Env):Value = {
    expr match {
      case Number(d)=> NumValue(d)
      case Var(name)=>env(name)
      case Plus(left,right)=>plus(eval(left,env),eval(right,env))
      case Let(name,expr,body)=> {
        eval(body,env+ (name->eval(expr,env)))
      }
      case Fun(param,body) => ClosureValue(param,body,env)
      case App2(fun,arg)=>{
        val ClosureValue(param,body,env2) = eval(fun,env)
        val v = eval(arg,env)
        eval(body,env2 + (param->v))
      }
    }
  } 
}



object AMain extends App {
  
  
  val t0 = List("lkmk")
  
  val t1 = List(List("a"),List("ab"),List("abc"),List("abdcd")).
  map(x=>x.count(s=>s.length > 1))
  
  val t2 = List(List(1),List(1,1),List(1,1,1),List(1,1,1,1))
  .filter(x=>x.length > 1)
  .map(x=>x.reduce((a,b)=>a*b))
  
  
  val t3 = List(1,3,5,7)
  val t4 = t3.foldLeft(1.0)(_/_)
  
  val t5 = for (x <- 1 to 10; val y = x*x; if y% 2 == 0) yield y+3
  
  
  
  println(t5)
  
  def sorter(xs:List[Int],g:(Int,Int)=>Boolean) = {
    def h (x: Int, xs: List[Int]):List[Int] =
        xs match {
          case List() => List(x)
          case y :: ys =>
            if (!g(x,y)) x :: xs
            else y :: h (x,ys)
          }
        (xs :\ List[Int]())(h) 
  }
  
  
  
  //def main(args: Array[String]):Unit = {
    
    /*
    println(Evaluation.eval {
      Let("y",Number(3),
          Let("f",Fun("x",Plus(Var("x"),Var("y"))),
              Var("f")))
    })
    */
  //}
  
}