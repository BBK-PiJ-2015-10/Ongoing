package day4.PartI.exer5

class Motorboat {
  
  def on() : String = {
    return "Motor on"
  }
  
  def off() : String = {
    return "Motor off"
  }
  
   def signal() : String = {
    return new Flare().light()
  }
  
  
  
}