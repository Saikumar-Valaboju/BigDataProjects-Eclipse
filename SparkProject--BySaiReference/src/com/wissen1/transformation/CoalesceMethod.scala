package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object CoalesceMethod {
  
  def main(args:Array[String]){
    
    // create spark-configuration object
     val conf=new SparkConf().setAppName("CoalesceMethodMethod").setMaster("local")
    
    //create spark context object
     val sc = new SparkContext(conf)
     
    val numbers=sc.parallelize(1 to 100) 
    
    numbers.coalesce(2).foreach(print)
  }
}