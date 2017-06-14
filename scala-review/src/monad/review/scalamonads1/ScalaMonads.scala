package monad.review.scalamonads1

/*
 * Monads capture policies for function application and composition, in
 * map and flatMap
 * 
 */



trait Monad[A]{
  def map[B](f: A => B): Monad[B]
  def flatMap[B](f: A => Monad[B]): Monad[B]
}

sealed trait Option[A]{
  def map[B](f: A => B): Option[B]
  def flatMap[B](f: A => Option[B]): Option[B]
}

case class Some[A](a: A) extends Option[A] {
  def map[B](f: A => B): Option[B] = new Some(f(a))
  def flatMap[B](f: A => Option[B]) = f(a)
}
case class None[A]() extends Option[A] {
  def map[B](f: A => B): Option[B] = new None
  def flatMap[B](f: A => Option[B]) = new None
}

abstract class Foo { def bar: Option[Bar]}
abstract class Bar { def baz: Option[Baz]}
abstract class Baz { def compute: Int}


sealed trait Validation[E,A]{
  def map[B](f: A => B): Validation[E,B]
  def flatMap[B](f: A => Validation[E,B]): Validation[E,B]
  def liftFail[F](f: E => F): Validation[F,A]
}

case class Success[E,A](a: A) extends Validation[E,A] {
  def map[B](f: A => B): Validation[E,B] = new Success(f(a))
  def flatMap[B](f: A => Validation[E,B]): Validation[E,B] = f(a)
  def liftFail[F](f: E => F): Validation[F,A] = new Success(a)    
}

case class Failure[E,A](e: E) extends Validation[E,A] {
  def map[B](f: A => B): Validation[E,B] = new Failure(e)
  def flatMap[B](f: A => Validation[E,B]): Validation[E,B] = new Failure(e)
  def liftFail[F](f: E => F): Validation[F,A] = new Failure(f(e))
}

abstract class Foo2 { def bar: Validation[BarException,Bar2]}
abstract class Bar2 { def baz: Validation[BazException,Baz2]}
abstract class Baz2 { def compute: Validation[ComputeException,Int]}

class BarException
class BazException
class ComputeException (e: Any)


abstract class Foo3 { def bars: List[Bar3]}
abstract class Bar3 { def bazs: List[Baz3]}
abstract class Baz3 { def computeAll: List[Int]}


object ScalaMonads {
  
  def compute(maybeFoo: Option[Foo]) : Option[Int] = {
    maybeFoo.flatMap { foo =>
      foo.bar.flatMap { bar =>
        bar.baz.map { baz =>
          baz.compute
        }
      }
    }
  }
  
   def computewithFor(maybeFoo: Option[Foo]) : Option[Int] = {
    for {
      foo <- maybeFoo 
      bar <- foo.bar
      baz <- bar.baz
    } yield baz.compute
  }
  
  
  def compute(foo: Foo2): Validation[ComputeException,Int] = {
    foo.bar.liftFail { new ComputeException(_)}.flatMap { bar =>
      bar.baz.liftFail {new ComputeException(_)}.flatMap { baz =>
        baz.compute
      }
    }
  }
  
  def computewithFor(foo: Foo2): Validation[ComputeException,Int] = {
    for {
      bar <- foo.bar.liftFail { new ComputeException(_)}
      baz <- bar.baz.liftFail { new ComputeException(_)}
      result <- baz.compute
    } yield result
  }
  
  
  
  def computeAll(foos: List[Foo3]): List[Int] = {
    for {
      foo <- foos
      bar <- foo.bars
      baz <- bar.bazs
      results <- baz.computeAll
    } yield results
  }
  
  
  
}