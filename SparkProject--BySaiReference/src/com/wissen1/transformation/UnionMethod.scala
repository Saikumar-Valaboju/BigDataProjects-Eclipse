package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object UnionMethod {
  
  def main(args:Array[String]){
    
    //setup spark-configuration projetc
    val config=new SparkConf().setAppName("UnionPartitions").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc=new SparkContext(config)
    
    //File1 info   
     val file1=sc.textFile("C://SaiKumar V//File1.txt")
    
    // File2 Info
      val file2=sc.textFile("C://SaiKumar V//File2.txt")
  
    //Apply union function and pass expression to perform required action
    val unionfunc=file1.union(file2)
   
    //print the union data
    unionfunc.foreach(println)
       
  }
 
}