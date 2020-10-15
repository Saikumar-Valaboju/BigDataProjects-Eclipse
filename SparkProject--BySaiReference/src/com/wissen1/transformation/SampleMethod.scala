package com.wissen1.transformation

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object SampleMethod {
  
  def main(args:Array[String]){
    
    //create spark-configuration object
    val conf=new SparkConf().setAppName("SampleMethod").setMaster("local")
    
     
    //create spark-context object
    val sc=new SparkContext(conf)
    
    val numbers=sc.parallelize(1 to 9)
    
    val samplenumbers=numbers.sample(true,.2)
      
    samplenumbers.foreach(println)  
    
  }
}