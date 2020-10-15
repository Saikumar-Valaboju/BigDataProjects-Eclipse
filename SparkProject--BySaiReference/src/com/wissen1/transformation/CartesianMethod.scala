package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object CartesianMethod {
  
  def main(args:Array[String]){
    
    
    // create spark-configuration object
    val conf=new SparkConf().setAppName("CartesianMethod").setMaster("local")
    
    //create spark context object
    val sc = new SparkContext(conf)
    
    val ratings=sc.parallelize(List(1,2,3))
    
    val texch=sc.parallelize(List("Spark","Scala","Scala"))
    
    val CarRatTech=texch.cartesian(ratings)
    
    CarRatTech.foreach(println)
    
  }
  
}