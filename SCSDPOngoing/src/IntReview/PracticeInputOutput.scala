package IntReview

import java.io.File
import scala.io.Source
import scala.io.Source._
import scala.swing._
import java.io._

//import scalafx
//import scalafx.scene.Scene

//import scala.swing._
//import scala.swing.FileChooser
//import scala.swing.FileChooser,


object PracticeInputOutput extends App {
  
  //println("I am printing")
  
  ///*
  
  val address = "C:\\Users\\YasserAlejandro\\Dropbox\\MSc Computer Science Birkbeck\\AC Modules\\CloudComputing\\Lab\\InputFiles\\test1.txt"
  
  val file = new File(address)
  
  //println(file.exists())
  
  //val chooser = new FileChooser
  //val response = chooser.showOpenDialog(null)
  
  //for ( ch <- Source.fromFile(file) ) {
    //print(ch)
  //}
  
  val writer = new PrintWriter(file)
  writer write "I am writing this back to the file"
  writer write "and also this line"
  writer write "and also this guy"
  writer.close()
  
  //Need to read Class7 HOF
  
  /*
  
  
  //Source.fromFile(file)
  
  
  
  
  //chooser.
  
  
 
  
  val foo = (n: Int) => n*(n-1)
  
  foo(4)
  
  val c = "This is a long sentece for me".split(" ").sortWith(_.length < _.length)
  
  c.foreach { println }
  
  */
  
}

