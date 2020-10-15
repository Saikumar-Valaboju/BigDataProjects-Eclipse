package com.wissen6.hive

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.hive.HiveContext

object SparkWithHive {
  
  def main(args:Array[String]){
    
    //setup spark-configuration
    
    val conf=new SparkConf().setAppName("MapMethod").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc= new SparkContext(conf)
    
    val sqlContext = new HiveContext(sc)
    
    sqlContext.sql("show tables").collect()

  }
}