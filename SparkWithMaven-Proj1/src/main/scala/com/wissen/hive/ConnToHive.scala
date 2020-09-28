package com.wissen.hive

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext 


object ConnToHive {
  def main(args:Array[String]){
   
    Class.forName("org.apache.hive.jdbc.HiveDriver").newInstance()
    val conf = new SparkConf().setAppName("SOME APP NAME").setMaster("local")
    val sc = new SparkContext(conf)
    println("Driver class loaded")
   // val spark = SparkSession.builder().appName("Spark Hive Example").getOrCreate()
  }
}