package day4.partII.exer13

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