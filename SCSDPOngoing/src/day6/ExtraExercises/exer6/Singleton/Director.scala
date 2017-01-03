package day6.ExtraExercises.exer6.Singleton

class Director (val firstName: String, val lastName: String, val yearOfBirth: Int)  {
  
  def name () : String = {
    firstName+" "+lastName
  }
 
}


object Director {
  
  def apply(firstName: String, lastName: String, yearOfBirth: Int ) : Director = {
      new Director (firstName,lastName,yearOfBirth)
  }
  
  def older (firstDirector: Director, secondDirector: Director ) : Director = {
    
    if (firstDirector.yearOfBirth <= secondDirector.yearOfBirth ) {
      return firstDirector
    }
    else {
      return secondDirector
    }
       
  }
  
}
  
