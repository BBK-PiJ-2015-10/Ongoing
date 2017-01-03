package day6.ExtraExercises.exer5

class Film (val name: String, val yearOfRelease: Int, val imdRating: Double, 
    val director: Director ) {

    def directorsAge() : Int = {
      2016-this.director.yearOfBirth
    }
  
    def isDirectedBy (director: Director) : Boolean = {
        if ( (this.director.name() == director.name())  && (this.director.yearOfBirth == director.yearOfBirth)) {
          return true
        }
        else {
          return false
        }     
   }
    
    def copy(name: String = this.name, yearOfRelease: Int = this.yearOfRelease, imdRating: Double = this.imdRating, director: Director = this.director) : Film  = {
        new Film (name,yearOfRelease,imdRating,director)
    }
  
  
}