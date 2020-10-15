package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object SortByMethod {
  def main(args:Array[String]){
    
    // create spark-configuration object
     val conf=new SparkConf().setAppName("SortByMethod").setMaster("local")
    
    //create spark context object
     val sc = new SparkContext(conf)
     
    val numbers=sc.parallelize(List(21,29,41,15,6,89,25,36,20))
    
    val sorted=numbers.sortBy(x=>x,true)
    
    sorted.foreach(println)
    
    val number=sc.parallelize(List("AAA","GGG","KKK","III",""))
    
    val sorte=number.sortBy(x=>x,true)
    
    sorte.foreach(println)
  }
}