package com.datax.play.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql._

case class Auction(auctionid: String, bid:Float, bidtime: Float, 
  bidder:String, bidderrate: Int, opebid:Float, price: Float,
  item:String, daystolive: Int
)


object SQLExample {
  
  def main(args:Array[String]) {
    
    val conf = new SparkConf().setAppName("SparkSQLUseCase").setMaster("local[*]")
    
    val sc = new SparkContext(conf)
    
    //SQL entry point for working with structured data
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    
    //This is use to implicitily convert an RDD to a DataFrame
    import sqlContext.implicits._
    
    import sqlContext._
   
    //Load data into an RDD
    val ebayText = sc.textFile("auctions/*.csv")
    
    //Create an RDD of Auctions objects
    val ebay = ebayText.map(_.split(",")).map(p=>Auction(p(0),
      p(1).toFloat,p(2).toFloat,p(3),p(4).toInt,p(5).toFloat,
      p(6).toFloat,p(7),p(8).toInt
    ))
    
    
    //Return the number of elements in the RDD
    //ebay.count
    
    //Changes ebay RDD of Action objects to a DataFrame
    val auction = ebay.toDF
    
    //shows the top 20 rows
    //auction.show()
    
    //returns the schema of this DataFrame
    //auction.printSchema()
    
    //How many auctions were held?
    //auction.select("auctionid").distinct().count()
    
    //Display How many bids per item?
    //auction.groupBy("auctionid","item").count.show
    
    //Get the auctions with a closing price > 100
    //val highPrice = auction.filter("price > 100")
    
    //show the top 20 of this highpricess
    //highPrice.show()
    
    
    //register the DataFrame as a temp table
    auction.registerTempTable("AUCTIONTABLE")
    
    /*
     
    val results = sqlContext.sql(
      """SELECT auctionid, item, count(bid) FROM AUCTIONTABLE
         GROUP BY auctionid, item """    
    	)
    
    results.show()
    
    */
    
    val results2 = sqlContext.sql(
      """
        SELECT auctionid, MAX(price) FROM AUCTIONTABLE
        GROUP BY item,auctionid
      """  
      )
    
    results2.show()
      
    
  }
  
  
}