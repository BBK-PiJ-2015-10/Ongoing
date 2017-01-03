package day6.ExtraExercises.exer8CaseClasses

case class Director (firstName: String, lastName: String, yearOfBirth: Int)  {
  
  def name () : String = {
    firstName+" "+lastName
  }
 
}


object Director {
  
  //def apply(firstName: String, lastName: String, yearOfBirth: Int ) : Director = {
      //new Director (firstName,lastName,yearOfBirth)
  //}
  
  def older (firstDirector: Director, secondDirector: Director ) : Director = {
    
    if (firstDirector.yearOfBirth <= secondDirector.yearOfBirth ) {
      return firstDirector
    }
    else {
      return secondDirector
    }
       
  }
  
}
  
