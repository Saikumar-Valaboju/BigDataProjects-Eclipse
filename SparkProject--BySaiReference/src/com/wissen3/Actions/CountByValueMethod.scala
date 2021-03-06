package com.wissen3.Actions

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object CountByValueMethod {
  def main(args:Array[String]){
    
    //create Spark-configuration objet
    val conf=new SparkConf().setAppName("CountMethod").setMaster("local")
    
    //create spark-context object
    val sc=new SparkContext(conf)
    
    val char=sc.parallelize(List("AAA","BBB","CCC","DDD","FFF","KKK","UUU","BBB"))
    
    println(char.countByValue())
  }
}