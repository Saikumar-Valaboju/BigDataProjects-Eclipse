package com.wissen.basic

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object BasicApplication {
  
  def main(args:Array[String]){
    
    val conf = new SparkConf().setAppName("BasicApplication").setMaster("local")
    val sc= new SparkContext(conf)
    val ratings = sc.parallelize(List(1,2,3))
    val tech = sc.parallelize(List("Spark","Scala","Java"))
    val zipRatTech = ratings.zip(tech)
    
    zipRatTech.foreach(println)  

  }
}