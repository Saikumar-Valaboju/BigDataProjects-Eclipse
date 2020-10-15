package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object GroupByMethod {
  
     def main(args:Array[String]){
       
   // create spark-configuration object
    val conf=new SparkConf().setAppName("GroupByMethod").setMaster("local")
    
    //create spark context object
    val sc = new SparkContext(conf)
    
    //create an RDD by using parallelized collection
     val data = sc.parallelize(Seq(("C",3),("A",1),("B",4),("A",2),("B",5)))  
     
     data.foreach(println)
    
  }
}