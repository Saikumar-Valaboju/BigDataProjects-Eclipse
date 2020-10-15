package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object MapPartitions {
  
   def main(args:Array[String]){
    
    //setup spark-configuration projetc
    val config=new SparkConf().setAppName("MapPartitions").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc=new SparkContext(config)
    
       
    val file=sc.textFile("C://SaiKumar V//Scala-File.txt")
    
    //Apply mappartition function and pass the expression to perform required action
    val filemappar=file.mapPartitions(l=>l.map(k=>k.length()))
    
    filemappar.foreach(println)
    
   }
}