package day4.partII

class Planet ( var name : String, var description : String, var moons : Int = 0 ) {
  
  def hasMoon() : Boolean = {
    if (this.moons == 0 ) {
      return false
    }
    else {
      return true
    }
  }
  
}