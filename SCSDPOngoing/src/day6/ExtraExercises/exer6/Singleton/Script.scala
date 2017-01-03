package day6.ExtraExercises.exer6.Singleton

object Script {
  
  def main (args: Array[String]):Unit = {
    
    val director1 = new Director("George","Lucas",1946)
    
    val director2 = new Director("Spieldberg","Stephen",1950)
    
    println(director1.name())
    
    val movie1 = new Film ("Star Wars", 1979, 10.0, director1)
    
    println(movie1.directorsAge())
    println(movie1.isDirectedBy(director2))
    println(movie1.isDirectedBy(director1))
    
    println(movie1.copy(name = "Ale Cane").name)
    println(movie1.copy(yearOfRelease = 1910).yearOfRelease)
    
    val director3 = Director.apply("Ale","Cane",1975)
    
    val movie2 = new Film("La Mascotta",2015,10.5,director3)
    
    println(Director.older(director2,director3).name())
    
    val movie3 = Film.apply("The Panther",2010,8.0,director1)
    
    println(Film.highestRating(movie3, movie1).name)
    
    println(Film.oldestDirectorAtTheTime(movie2, movie3).name())
    
    
    //apply("Ale","Cane",1975)
    
    
  }
  
  
}