package com.wissen2.keyvaluepairs

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext


object JoinMethod {
  
  def main(args:Array[String]){
    
    //create spark-config object
    val conf=new SparkConf().setAppName("JoinMethod").setMaster("local")
    
    //create spark-contect object
    val sc=new SparkContext(conf)
    
    //create an RDD by using parallelized collection
    val dta1=sc.parallelize(List( ("Spark",10),("Scala",20),("Java",30) ))
    val dta2=sc.parallelize(List(("Phython","PaltformDep"),("Scala","JVM"),("Spark","Cache")))
    
    val res1=dta1.join(dta2)
    val res2=dta2.join(dta1)
    val res3=dta1.join(dta1)
    
    res1.foreach(println)
    res2.foreach(println)
    res3.foreach(println)
        
  }
}