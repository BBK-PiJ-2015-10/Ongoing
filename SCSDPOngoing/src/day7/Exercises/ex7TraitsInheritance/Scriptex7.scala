package day7.Exercises.ex7TraitsInheritance


class Author (val name:String) {
  
}

class Editor (val name:String) {
  
}

class Issue (volume:Int, issueNumber: Int, manuscripts:Manuscript*) {
  
}

class Manuscript (var mauthor:Author, var mlen:Int) {
  
  
}



sealed trait Publication

  case class Book(author: Author,len:Int) extends Manuscript(author,len) with Publication {
  
  }
  
  case class Periodical(editor: Editor, issue: Issue*) extends Publication {
    
  }


  



object Scriptex7 extends App {
  
  println("Welcome to ex 7")
  
  val pub1 = Book(new Author("Adam"),100)
  
  val pub2 = Book(new Author("Ale"),200)
  
  val pub3 = Periodical(new Editor("Publishers"),new Issue(1,2,pub1,pub2)) 
  
  
  
  
}