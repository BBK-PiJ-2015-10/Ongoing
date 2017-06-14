package monad.review.scalamonads2

trait M[A] {
  
  def flatMap[B](f: A => M[B]): M[B]
  
}

object M {
  
  //def unit[A](x: A): M[A]
  
}

  //def unit[A](x: A): M[A]