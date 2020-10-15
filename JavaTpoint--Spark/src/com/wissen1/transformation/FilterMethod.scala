package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object FilterMethod {
  
  def main(args:Array[String]){
    
    //setup spark-configuration projetc
    val config=new SparkConf().setAppName("FilterMethod").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc=new SparkContext(config)
    
    //create an Rdd by using parallelized collecion
    val data=sc.parallelize(List(10,25,35,40,45))
    
    //Now, we can read the generated result by using the following command.
    data.foreach(println)
    
    //Apply filter function and pass the expression required to perform.
    val filterfunc=data.filter(x=>x!=35)
    
    filterfunc.foreach(println)
    
  }
}