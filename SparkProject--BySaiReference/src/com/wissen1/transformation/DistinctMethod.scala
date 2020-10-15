package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object DistinctMethod {
  
  def main(args:Array[String]){
   
     //setup spark-configuration projetc
    val config=new SparkConf().setAppName("distinct").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc=new SparkContext(config)
    
    val file=sc.parallelize(List("Spark","Scala","Java","Spring","Hadoop","Spark","Spring","HADOOP"))
    
    val distdat= file.distinct()
    
    //display the data
    distdat.foreach(println)
  }
}