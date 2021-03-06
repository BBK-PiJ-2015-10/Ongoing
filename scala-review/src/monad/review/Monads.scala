package monad.review

import monad.review.scalamonads.Monad

/*

sealed trait Maybe[+A] {
 
  def flattener[B](f: A => Maybe[B]): Maybe[B] =
    this match {
      case Just(a) => f(a)
      case MaybeNot => MaybeNot    
    }
  
}

case class Just[+A](a: A) extends Maybe[A]{
  
  //override
  //def flatMaybe[B](f: A=> Maybe[B]) = f(a)
  
}

case object MaybeNot extends Maybe[Nothing] {
  
  //override
  //def flatMaybe[B](f: Nothing => Maybe[B]) = MaybeNot
  
}

*/

  sealed trait Monad[A] {
    
    def mapMon[B](f: A => B): Monad[B]
    
    def flatMapMon[B](f: A => Monad[B]): Monad[B]
    
  }

  sealed trait OptionMon[A] {
    
    def mapOpt[B](f: A => B): OptionMon[B]
    
    def flatMapOpt[B](f: A => OptionMon[B]): OptionMon[B]
    
  }
  
  case class SomeMon[A](a: A) extends OptionMon[A] {
    
    def mapOpt[B](f: A => B): OptionMon[B] = SomeMon(f(a))
    
    def flatMapOpt[B](f: A => OptionMon[B]): OptionMon[B] = f(a)
    
  }
  
  case class NoneMon[A]() extends OptionMon[A] {
    
    def mapOpt[B](f: A => B): OptionMon[B] = NoneMon()
    
    def flatMapOpt[B](f: A => OptionMon[B]): OptionMon[B] = NoneMon()
    
    
  }
  
  

  

  


object Monads {
  
  //val k : Monad[String] = Tonto("mimason")
  
  
  def main(args: Array[String] ) : Unit = {
    println("ale tonto")
  }
  
  
  
}

