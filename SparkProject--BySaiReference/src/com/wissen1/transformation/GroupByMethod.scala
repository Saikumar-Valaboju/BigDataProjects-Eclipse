package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object GroupByMethod {
  
     def main(args:Array[String]){  
  
     // create spark-configuration object
     val conf=new SparkConf().setAppName("ZipWithIndexes").setMaster("local")
    
    //create spark context object
    val sc = new SparkContext(conf)
  
    val names=sc.textFile("C://SaiKumar V//Details.txt")
    
    val namesRow=names.map(l=>l.split(" "))
    
    val yearname=namesRow.map(c=>(c(1),c(2)))
    
    yearname.groupByKey().foreach(println)
    
  }
}