package com.datax.play.spark

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext

object counter {
  
    val conf = new SparkConf().setAppName("counter").setMaster("local[*]")
    
    val sc= new SparkContext(conf)
    
    val text = sc.textFile("input/*.txt")
    
    var helper : Any = null
    
    val freqTracker: Map[String,Int] = Map()
  
  def main (args: Array[String]): Unit = {
    
      
      nextWords("MIA").foreach(x=>println(x))
      
      //val tester = nextWords("Munich") 
      
      //testLines()
      
      
      //nextWords("Berlin").foreach(x=>println(x))
      
      //println("What happened")
    
  }
    
  def nextWords(first: String) : Set[String] = {
    var result : Set[String] = Set()
    val list = text.flatMap{line=>line.split(" ")}.collect().toList 
    for (i <- 0 to list.size-2){
      if (list.apply(i).equals(first)){
        result += list.apply(i+1)
      }
    }
    return result
  }
  
  def topN(set: Set[String], count: Int, first: String) : Set[String] = {
    
    var eval = 0.0
    for (second <- set){
      eval = relativeFreqTuples(first,second)
    }
 
    return null;
    
  }
  
  
  def relativeFreqTuples(first: String, second: String) : Double = {
    val array = text.flatMap{line=>line.split(" ")}
    val list = array.collect().toList
    val deno = array.filter(x=>x.equals(first)).count().toDouble
    val nume = countAdjacentTargets(first,second,list).toDouble
    println(first +" was found : " +deno +" times")
    println(second +" was found : " +nume +" times")
    return nume/deno
  }
  
  /*
   * Takes a directory, flat mapt it and count the number of times a word appears on the text
   */
  def countTarget(first: String) : Long = {  
    return text.flatMap{line=>line.split(" ")}.filter(x=>x.equals(first)).count()
  }
  
  /*
   * This function counts the number of times a two Strings are together in a List of Strings
   */
  def countAdjacentTargets(target1 : String, target2 : String, list :List[String]) : Long = {
    var count=0
    for ( i <- 0 to list.size-2){
      if (list.apply(i).equals(target1) && list.apply(i+1).equals(target2)){
        count +=1
      }
    }
    return count
  }
  
  /*
   * This function count words from a directory and saves output
   */
  def countWords() : Unit = {
    text.flatMap{line=>line.split(" ")}
    .map{word=>(word,1)}
    .reduceByKey(_+_).saveAsTextFile("output.txt")
  }
  
  def testLines(): Unit = {
    //text.collect()
    breakLines("Munich",text.collect())
  }
  
  /*
   * Takes an array of Strings and a target String and provides a
   * list of the neighbors of the target String on each array String
   */
  def breakLines(target: String, lines: Array[String]): Unit = {
    for (line <- lines ) {
      provideNeighbors(target,line).foreach(println)    
    } 
  }
  
  /*
   * Provides a list of Strings that are neighbors of a target String within
   * a String sentence
   */
  def provideNeighbors(first: String, line: String): List[String] = {
    var result : List[String] = List()
    val temp = line.split(" ").toList
     for (i <- 0 to temp.size-2){
      if (temp.apply(i).equals(first)){
        result = result :+ temp.apply(i+1)
     }
    }
    result
  }
  
 /*
  * This is a work in process 
  */
 def top2(list: List[String], max: Int): Set[String] = {
   var assocarray : Map[String,Int] = Map()
   var result : Set[String] = Set()
   for (word <- list){
   }
   return result;
 }
  

  
  
  
}