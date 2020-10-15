package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object MapMethod {
  
  def main(args:Array[String]){
    
    //setup spark-configuration
    
    val conf=new SparkConf().setAppName("MapMethod").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc= new SparkContext(conf)
    
    //create an RDD using parallelized collection
    val data=sc.parallelize(List(10,20,30))
    
    //Read the generated result by using the following command
    data.foreach(println)  // in eclipse
    
    //data.collect()    //---->in terminal or cmd
    
    //Apply map function and pass the expression required to perform
    val malfunc=data.map(x=>x+10)
    
    //generate result by using following command
    malfunc.foreach(println)
    
  }
}