package com.datax.play.spark

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;

object tempcalculator {
  
  def main (args: Array[String]):Unit = {
    
    /*
     * This tutorial will read a file and for each line will
     * capture the year and estimate the average temperature for that year
     */
    
    ///*
    
    println("Welcome to the temp calculator")
    
    val conf = new SparkConf().setAppName("tempCalculator").setMaster("local[*]")
    
    val sc = new SparkContext(conf)
    
    val text = sc.textFile("inputtemp/temp.txt")
    
    //text.flatMap(line=>line.split(" ")).collect().array[0]
    
    //*/
        
        
    val list = List(1,2,3,4)
    
    list.foreach(println)
    
  }
  
}