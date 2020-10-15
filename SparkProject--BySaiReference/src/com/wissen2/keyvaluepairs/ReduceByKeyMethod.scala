package com.wissen2.keyvaluepairs

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object ReduceByKeyMethod {
  
  def main(args:Array[String]){
    
    //reduced by key used for calculating sum or product or find max or mini
    
    //setup spark-configuration 
    val conf=new SparkConf().setAppName("ReduceByKeyMethod").setMaster("local")
    
    //create spark-context object and pass spark-conf as parameter
    val sc=new SparkContext(conf)
    
    //create an RDD by using parallelized collection
    val iniData = sc.parallelize(List(("Spark",1),("Scala",2),("Spark",3),("Spark",4),("Spark",8),("Java",9),("Scala",5),("Spark",6) ))

    //apply reducebykey method 
    val sumofinidata=iniData.reduceByKey((x,y)=>(x+y))
    
    //display info
    sumofinidata.foreach(println)
    
  }
}