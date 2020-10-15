package com.wissen3.Actions

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object TopMethod {
  
   def main(args:Array[String]){
    
    //create Spark-configuration objet
    val conf=new SparkConf().setAppName("TopMethod").setMaster("local")
    
    //create spark-context object
    val sc=new SparkContext(conf)
    
    val char=sc.parallelize(List("Java","Scala&Java","Spark","Scala"))   
    
    char.top(1).foreach(println)
  }
   
}