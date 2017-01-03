package day6.ex12to14AuxiliaryConstructors

object ScriptAuxiliaryConstructors extends App {
  
  //Answer to question 12
  
  val clothesWasher1 = new ClothesWasher("firstmodel")
  
  assert(clothesWasher1.modelName == "firstmodel")
  assert(clothesWasher1.capacity == 0.0)
  
  //Answer to question 13
  
  val clothesWasher2 = new ClothesWasher(10.0)
  assert(clothesWasher2.modelName == "defaultmodel")
  assert(clothesWasher2.capacity == 10.0)
  
  //Answer to question 14
  
  //Tested putting something that was not a call to the primary constructor on the auxiliary
  //constructor but the code wouldn't compile.
  
  
 
}