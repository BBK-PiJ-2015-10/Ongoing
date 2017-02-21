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
    
    //based RDD
    val lines = sc.textFile("input/log.txt")
    val temps = sc.textFile("inputtemp/temp2.txt")
    
    
    
    //transformed RDDs
    val errors = lines.filter(_.startsWith("ERROR"))
    val messages = errors.map(_.split("\t")).map(r=>r(1))
    messages.cache()
    
    //val alejito : RDD[String] 
    
    val mima : String = "ale"
    
       
    //lines.filter(_.startsWith("ERROR")).map(_.split(" ")).map(x=>x(1)).saveAsTextFile("output4.txt")
    
    //temps.map(_.split(" ")).map(x=>x(3)).saveAsTextFile("output5.txt")
    
    temps.map(_.split(" ")).map(x=>x(2)).saveAsTextFile("output6.txt")
     

    
    val accum = sc.accumulator(0)
    
    //temps
    
    //temps.map(_.split(" ")).flatMap { x => Integer.getInteger(x) }
    
    
    
    
    //sc.parallelize(Array(1,2,3,4)).foreach(x=>accum +=x)
    
    
    //
    
    //Left on page 94
    
    /*
    
    for (x <-tonto) {
      val temp = x.split(" ").last
      
      println(temp)
    }
    
    */
    
    //val ale = Array(1,2,3)
    
    //*/
    
    //val names = Array("ale","tonto")
    
    //val first =names(0)
    
    //println(first)

    
    //val ale : Array[String] = ["yasser","alejandro","palacios"]
    
    
    

    
    //action 1
    //messages.filter(_.contains("mysql")).count()
  
  //action 2
  //messages.filter(_.contains("php")).count()
  
  
  }
  
  
  
}