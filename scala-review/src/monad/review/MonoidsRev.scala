package monad.review

object MonoidsRev {

  trait Monoid[A] {
  def op(a1: A, a2: A): A
  def zero: A
  }
  
  
  val StringMonoid = new Monoid[String] {
    def op(a1: String, a2: String) = a1 + a2
    def zero = ""
  }
  
  
  def listMonoid[A] = new Monoid[List[A]] {
    def op(a1: List[A], a2: List[A]) = a1 ++ a2
    val zero = Nil
  }
  
  
}


