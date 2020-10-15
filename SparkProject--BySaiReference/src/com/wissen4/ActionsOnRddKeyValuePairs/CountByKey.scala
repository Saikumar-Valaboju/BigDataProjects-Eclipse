package com.wissen4.ActionsOnRddKeyValuePairs

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object CountByKey {
  
   def main(args:Array[String]){
    
    //create Spark-configuration objet
    val conf=new SparkConf().setAppName("CountByKeyMethod").setMaster("local")
    
    //create spark-context object
    val sc=new SparkContext(conf)
    
    val char=sc.parallelize(List(("Spark",1),("Scala",2),("Spark",3),("Spark",4),("Spark",8),("Java",9),("Scala",5),("Spark",6)))   
    
   val add=char.countByKey()
    
   add.foreach(println)
   
   } 
}