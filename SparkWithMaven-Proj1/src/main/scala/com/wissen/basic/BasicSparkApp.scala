package com.wissen.basic

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object BasicSparkApp {
  
  def main(args: Array[String]) {
    
    //create Spark conf Object
    val conf = new SparkConf().setAppName("BasicSparkApp").setMaster("local")
    
    //create Spark Context Object
    val sc = new SparkContext(conf)
  
    val ratings = sc.parallelize(List(1,2,3))
    val tech = sc.parallelize(List("Spark","Scala","Java"))
    val cartRatTech = ratings.cartesian(tech)
   
    cartRatTech.foreach(println)
    
  }
}