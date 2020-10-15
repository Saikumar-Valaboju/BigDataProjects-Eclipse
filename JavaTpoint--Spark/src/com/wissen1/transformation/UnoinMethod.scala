package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object UnoinMethod {
  
  def main(args:Array[String]){
    
    //setup spark-configuration projetc
    val config=new SparkConf().setAppName("UnoinMethod").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc=new SparkContext(config)
    
    //File1 info   
    val file1=sc.parallelize(List(1,2,3))
    
    // File2 Info
    val file2=sc.parallelize(List(4,5,6))
    
    file1.foreach(println)
    file2.foreach(println)
    
    //Apply union function and pass expression to perform required action
    val unionfunc=file1.union(file2)
   
    //print the union data
    unionfunc.foreach(println)
    
  }
}