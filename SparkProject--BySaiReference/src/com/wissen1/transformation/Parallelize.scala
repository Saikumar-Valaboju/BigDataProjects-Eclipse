package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Parallelize {
  
   def main(args:Array[String]){
    
    //setup spark-configuration projetc
    val config=new SparkConf().setAppName("Parallelize").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc=new SparkContext(config)
    
    val inputdata=Array(1,2,3,4,5)
    
    //apply parallelize function and pass expression to perform an required action
    val distdata=sc.parallelize(inputdata)
    
    distdata.foreach(println)
    
   }
}