package com.wissen2.keyvaluepairs

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object GroupByKey {
  
  def main(args:Array[String]){
    
     //create spark-config object
    val conf=new SparkConf().setAppName("RightOuterJoinMethod").setMaster("local")
    
    //create spark-contect object
    val sc=new SparkContext(conf)
   
    //create an RDD by using parallelized collection
   val data2 = sc.parallelize(List((10,1),(20,2),(10,3),(10,4),(20,8),(40,9),(20,5),(10,6) ))
     
   val groupByKeyData = data2.groupByKey()
   
   groupByKeyData.foreach(println)
   
   val iniData = sc.parallelize(List(("Spark",1),("Scala",2),("Spark",3),("Spark",4),("Spark",8),("Java",9),("Scala",5),("Spark",6) ))
   
   val res=iniData.groupByKey()
   
   res.foreach(println)
  }
}