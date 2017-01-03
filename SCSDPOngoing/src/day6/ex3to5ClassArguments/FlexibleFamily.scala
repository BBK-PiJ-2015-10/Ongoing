package day6.ex3to5ClassArguments

class FlexibleFamily (val father:String, val mother:String, val children:String*) {
  
  def familySize() : Int = {
    children.size+2
  }
  
}