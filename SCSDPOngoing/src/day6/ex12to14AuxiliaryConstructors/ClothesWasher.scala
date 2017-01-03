package day6.ex12to14AuxiliaryConstructors

class ClothesWasher (val modelName: String, val capacity: Double ) {
  
  def this(modelName: String) {
    this(modelName,0.0)
  }
  
  def this(capacity: Double) {
    this("defaultmodel",capacity)
  }
  
  
  
  
}