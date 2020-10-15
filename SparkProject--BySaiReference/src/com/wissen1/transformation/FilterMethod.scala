package com.wissen1.transformation


import org.apache.spark.SparkConf
import org.apache.spark.SparkContext


object FilterMethod {
   def main(args:Array[String]){
    
    //setup spark-configuration projetc
    val config=new SparkConf().setAppName("FilterMethod").setMaster("local")
    
    //create spark context object and pass conf objet as a parameter
    val sc=new SparkContext(config)
   
    val file=sc.textFile("C://SaiKumar V//Scala-File.txt")
        
    //Apply filter function and pass the expression required to perform.
    val filelength=file.filter(l=>l.length()>=53)
    
    //display the data
    filelength.foreach(println)
    
    println("--------------------------------------------------------------------")
    
    //changed the condition
    val filelengt=file.filter(l=>l.length()==53)
    
    //display the data
    filelengt.foreach(println)
    
    println("--------------------------------------------------------------------")
    
    //changed the condition
    val fileleng=file.filter(l=>l.contains("discuss"))
    
    //display the data
    fileleng.foreach(println)
    
   }
}