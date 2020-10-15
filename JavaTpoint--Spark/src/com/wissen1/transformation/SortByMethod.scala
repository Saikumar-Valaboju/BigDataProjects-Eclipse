package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object SortByMethod {
  def main(args:Array[String]){
    
    // create spark-configuration object
     val conf=new SparkConf().setAppName("SortByMethod").setMaster("local")
    
    //create spark context object
     val sc = new SparkContext(conf)
     
    val numbers=sc.parallelize(Seq(("C",3),("A",2),("D",4),("B",1),("E",5))) // sorted bases on values
    
    val sorted=numbers.sortByKey()   // or below one
    // val sorted = numbers.sortBy(x => x, true)
    
    sorted.foreach(println)
  }
}