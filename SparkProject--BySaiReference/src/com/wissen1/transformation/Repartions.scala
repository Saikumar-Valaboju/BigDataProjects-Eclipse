package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Repartions {
  
  def main(args:Array[String]){
    
    
    // create spark-configuration object
     val conf=new SparkConf().setAppName("RepartionsMethod").setMaster("local")
    
    //create spark context object
     val sc = new SparkContext(conf)
     
     //create an RDD by using parallelized collection
     val number=sc.parallelize((1 to 100).toList)
     
     val rep=number.repartition(2)
     
     rep.foreach(println)
  }
  
}