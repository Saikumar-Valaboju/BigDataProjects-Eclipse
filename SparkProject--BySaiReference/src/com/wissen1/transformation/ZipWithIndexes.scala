package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object ZipWithIndexes {
  
  def main(args:Array[String]){
    
    // create spark-configuration object
    val conf=new SparkConf().setAppName("ZipWithIndexes").setMaster("local")
    
    //create spark context object
    val sc = new SparkContext(conf)
    
    val file=sc.parallelize(List("SaiKumar","Anuradha","RajaBrahmam"))
    
    val zipwithindex=file.zipWithIndex()
    
    zipwithindex.foreach(println)
  }
}