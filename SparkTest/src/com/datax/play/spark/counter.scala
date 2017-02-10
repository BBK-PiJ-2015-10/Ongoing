package com.datax.play.spark

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext

object counter {
  
  def main (args: Array[String]): Unit = {
    
    println("Hello back Scala")
    
    val conf = new SparkConf().setAppName("counter").setMaster("local[*]")
    
    val sc= new SparkContext(conf)
   
    val text = sc.textFile("input/*.txt")
    
    
    text.flatMap{line=>line.split(" ")}
    .map{word=>(word,1)}
    .reduceByKey(_+_).saveAsTextFile("output.txt")
    
    println("Work is completed")
    
    
  }
  
}