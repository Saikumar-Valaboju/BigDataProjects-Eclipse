package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object FlatMapMethod {
  
   def main(args:Array[String]){
    
    //setup spark-configuration projetc
    val config=new SparkConf().setAppName("FlatMapMethod").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc=new SparkContext(config)
   
    val file=sc.textFile("C://SaiKumar V//Scala-File.txt")
    
    //apply flatMap function and pass the expression required to perform
    val filewords=file.flatMap(l=>l.split(" "))
    
    //display the data
    filewords.foreach(println)
    println(filewords.collect().mkString("\t"))
    
    println(filewords.collect().mkString("...."))
    
   }
}