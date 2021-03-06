package com.datax.play.spark

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.rdd.RDD;

import java.util.Arrays;

object log {
  
  /*
   * load errors messages from a log into memory
   * then interactively search for various patterns
   */
  
  
  def main ( args:Array[String]):Unit = {
    
    ///*
  
    val conf = new SparkConf().setAppName("logger").setMaster("local[*]")
    
    val sc = new SparkContext(conf)
    
    //base RDD
    val lines = sc.textFile("logger/log.txt")
    //val temps = sc.textFile("inputtemp/temp2.txt")
    
    
    
    //transformed RDDs
    val errors = lines.filter(_.startsWith("ERROR"))
    val messages = errors.map(_.split("\t")).map(r=>r(1))
    messages.cache()
    
    //val alejito : RDD[String] 
    
  
    
    //This searches for ERROR, splits it, grabs the second item on array, and saves it in files.    
    //lines.filter(_.startsWith("ERROR")).map(_.split(" ")).map(x=>x(1)).saveAsTextFile("output4.txt")
    
    //temps.map(_.split(" ")).map(x=>x(3)).saveAsTextFile("output5.txt")
    
    //temps.map(_.split(" ")).foreach {( => ??? }
    
    //temps.foreach { x => ??? }
     

    
    val accum = sc.accumulator(0)
    
    
    
    //The below drops the year, and calculates the cumulative of the elements
    //temps.map(_.split(" ").drop(1).map(x => x.toInt).reduce(_+_)).saveAsTextFile("output6.txt")
    
    //temps.map(_.split("\t")).fold((0)(a,b)=>a+b))
    
    //val test = temps.map(_.split(" ")).first().reduce(_+_)
    
 
    
    //temps.map(_.split(" ")).flatMap { x => Integer.getInteger(x) }
    
    
    
    
    //sc.parallelize(Array(1,2,3,4)).foreach(x=>accum+=x)
    
    //println(accum)
    
    
    //
    
    //Left on page 94
    
      
    //action 1
    println(messages.filter(_.contains("mysql")).count())
  
    //action 2
    println(messages.filter(_.contains("php")).count())
  
  
  }
  
  
  
}