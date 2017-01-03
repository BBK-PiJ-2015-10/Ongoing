package day6.ex7to10NamedDefaultArguments

class Item (val name: String, val price: Double) {
  
  def cost(grocery: Boolean = false, medication: Boolean = false, taxRate: Double = .10) : Double = {
       if (grocery == true || medication == true ) {
         return price
       }
       else {
         return price*(1+taxRate)
       }
  }
  
}