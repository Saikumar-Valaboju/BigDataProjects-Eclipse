package com.wissen1.transformation

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object MapMethod {
  def main(args:Array[String]){
    
    //setup spark-configuration
    
    val conf=new SparkConf().setAppName("MapMethod").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc= new SparkContext(conf)
    
    val file=sc.textFile("C://SaiKumar V//Scala-File.txt")
    
    val fileLength = file.map(l=>l.length())
    
    fileLength.foreach(println)
    
    
  }
}