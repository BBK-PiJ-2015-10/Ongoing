package day4.PartI.exer5

class Sailboat {
  
  def raise() : String = {
    return "Sails raised"
  }
  
  def lower() : String = {
    return "Sails lowered"
  }
  
  def signal() : String = {
    return new Flare().light()
  }
  
  
}