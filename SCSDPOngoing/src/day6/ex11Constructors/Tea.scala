package day6.ex11Constructors

class Tea (val name: String ="Early Grey", val decaf: Boolean = false, val sugar: Boolean = false, val milk: Boolean = false, var calo: Int = 0) {
  
  def describe : String = {
     var result: String = name
     if (decaf == true ) {
       result = result +" decaf"
     }
     if (sugar == true ) {
       result = result +" + sugar"
     }
     if (milk == true ) {
       result = result +" + milk"
     }
     return result
  }
  
  def calories : Int = {
    if (sugar == true ) {
      this.calo=this.calo+16
    }
    if (milk == true ) {
      this.calo = this.calo+100
    }
    return this.calo
  }
  
  
  
}