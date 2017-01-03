package day4.PartI.exer7

class Cup {
  
  var percentFull = 0
  
  val max = 100
  
  def set(percentFull : Int ) = {
    this.percentFull = percentFull
  }
  
   def get() : Int  = {
    return this.percentFull
  }
  
  
  def add (increase: Int) : Int = {
    
    percentFull += increase
    if (percentFull > max ) {
      percentFull = max
    }
    else if (percentFull < 0 ) {
      percentFull = 0
    }
      percentFull
  }
  
 
  
  
}