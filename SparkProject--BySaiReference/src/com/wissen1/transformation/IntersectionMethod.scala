package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object IntersectionMethod {
  
  def main(args:Array[String]){
    
    //setup spark-configuration projetc
    val config=new SparkConf().setAppName("IntersectionMethod").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc=new SparkContext(config)
    
    //File1 info   
     val file1=sc.textFile("C://SaiKumar V//File1.txt")
    
    // File2 Info
      val file2=sc.textFile("C://SaiKumar V//File3.txt")
  
    //Apply union function and pass expression to perform required action
    val unionfunc=file1.intersection(file2)
   
    //print the union data
    unionfunc.foreach(println)
    
    //File1 info   
     val file3=sc.parallelize(List("Spark","Scala","Java"))
    
    // File4 Info
    val file4=sc.parallelize(List("Spring","Java","Hadoop"))   // It is Case sensitive
    
    //Apply union function and pass expression to perform required action
    val unionfun=file3.intersection(file4)
  
    unionfun.foreach(println)
  }
 
}