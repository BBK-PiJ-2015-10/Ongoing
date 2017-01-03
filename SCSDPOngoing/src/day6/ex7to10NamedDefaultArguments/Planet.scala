package day6.ex7to10NamedDefaultArguments

class Planet (val name: String, val description: String, val moons: Int = 1) {
  
  def hasMoon : Boolean = {
    if (this.moons == 0 ) {
      return false
    }
    else {
      return true
    }
  }
  
  
  
}