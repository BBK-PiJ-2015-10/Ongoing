package day6.ExtraExercises.exer5

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
    
    
  }
  
  
}