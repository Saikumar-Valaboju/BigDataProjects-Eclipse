package com.wissen2.keyvaluepairs

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object ValuesMethod {
  
   def main(args:Array[String]){
    
    //create Spark-configuration objet
    val conf=new SparkConf().setAppName("keysMethod").setMaster("local")
    
    //create spark-context object
    val sc=new SparkContext(conf)
    
    //create an RDD by using parallelized collection
    val numb=sc.parallelize(List(("Sai",25),("Saatwik",8),("Saahithi",6)))
    
    numb.values.foreach(println)    
   }
}