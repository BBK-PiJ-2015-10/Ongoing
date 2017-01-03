package day6.ExtraExercises.exer5

class Director (val firstName: String, val lastName: String, val yearOfBirth: Int)  {
  
  def name () : String = {
    firstName+" "+lastName
  }
  
}