package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object distinctMethod {
  
   def main(args:Array[String]){
    
    //setup spark-configuration projetc
    val config=new SparkConf().setAppName("distinct").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc=new SparkContext(config)
    
    val file=sc.parallelize(List(10,20,20,30,50,50))
    
    val distdat= file.distinct()
    
    //display the data
    distdat.foreach(println)
   }
}