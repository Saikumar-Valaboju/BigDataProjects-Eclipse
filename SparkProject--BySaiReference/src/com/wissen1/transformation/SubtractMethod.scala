package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object SubtractMethod {
  
  def main(args:Array[String]){
    
    //setup spark-configuration projetc
    val config=new SparkConf().setAppName("SubtractMethod").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc=new SparkContext(config)
    
    //File1 info   
     val file1=sc.textFile("C://SaiKumar V//File1.txt")
    
    // File2 Info
      val file2=sc.textFile("C://SaiKumar V//File3.txt")
  
    //Apply union function and pass expression to perform required action
    val inters=file1.subtract(file2)
   
    //print the union data
    inters.foreach(println)
    
    val tech = sc.parallelize(List("Spark","Scala","Java"))
    
    val technew = sc.parallelize(List("Perl","Scala","Phython"))
    
    val interTech = tech.subtract(technew)
    
    interTech.foreach(println)

  } 
}