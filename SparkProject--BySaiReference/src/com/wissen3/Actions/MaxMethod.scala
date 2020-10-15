package com.wissen3.Actions

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object MaxMethod {
  
  def main(args:Array[String]){
    
    //create Spark-configuration objet
    val conf=new SparkConf().setAppName("MaxMethod").setMaster("local")
    
    //create spark-context object
    val sc=new SparkContext(conf)
    
    val char=sc.parallelize(List("Java","Scala&Java","Spark","Scala"))   
    
    println(char.max())
  }
}