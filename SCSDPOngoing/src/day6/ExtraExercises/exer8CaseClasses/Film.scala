package day6.ExtraExercises.exer8CaseClasses

case class Film (name: String, yearOfRelease: Int, imdRating: Double, 
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
        Film (name,yearOfRelease,imdRating,director)
        //new Film (name,yearOfRelease,imdRating,director)
    }
  
}

object Film {
  
  //def apply (name: String, yearOfRelease: Int, imdRating: Double, director: Director ) : Film = {
      //new Film(name,yearOfRelease,imdRating,director)
  //}
  
  def highestRating (film1: Film, film2: Film) : Film = {
    if (film1.imdRating>=film2.imdRating){
      return film1
    }
    else {
      return film2
    }    
  }
  
  def oldestDirectorAtTheTime (film1: Film, film2: Film) : Director = {
    if (film1.director.yearOfBirth <= film2.director.yearOfBirth) {
      return film1.director
    }
    else {
      return film2.director
    }
  }
  
  
  
}