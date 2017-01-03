package functional.chapter1

object Chapter1Exercises extends App {
  
  println("This book is going to be amazing")
  
  val capu = new Coffee()
  
  val visa = new CreditCard
  
  val costa = new Cafe
  
  costa.buyCoffee(visa)
  
  
 
  //println(test.price)
  
  class Coffee(val price:Double = 3.5) {
  }
  
  class CreditCard {
    
  }
  
  
  class Cafe {
    
    def buyCoffee(cc: CreditCard) : (Coffee,Charge) = {
      val cup = new Coffee()
      (cup,Charge(cc,cup.price))
    }
    
    def buyCoffees(cc:CreditCard, n:Int): (List[Coffee],Charge) = {
      val purchases: List [(Coffee,Charge)] = List.fill(n)(buyCoffee(cc))
      val (coffees,charges) = purchases.unzip 
      (coffees,charges.reduce((c1,c2)=>c1.combine(c2))) 
    }
    
  }
  
  case class Charge (cc:CreditCard, amount:Double) {
    
    def combine(other:Charge): Charge = {
      if (cc == other.cc) {
        Charge (cc,amount + other.amount)
      }
      else
        throw new Exception("Can't combine charges to different cards")
    }
    
    def coalesce(charges:List[Charge]): List[Charge] =
      charges.groupBy(_.cc).values.map(_.reduce(_ combine _)).toList
    
  }
  

  
}