package com.wissen3.Actions

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Count {
  
   def main(args:Array[String]){
     
    //create Spark-configuration objet
    val conf=new SparkConf().setAppName("CountMethod").setMaster("local")
    
    //create spark-context object
    val sc=new SparkContext(conf)
    
    //create an RDD by using Parallelized Collection
    val num=sc.parallelize((1 to 10000).toList)
    
    System.out.println(num.count())  
    
    val char=sc.parallelize(List("AAA","BBB","CCC","DDD","FFF"))
   
    println(char.count())
    
    val tex=sc.textFile("C://SaiKumar V//Scala-File.txt")
    
    val filData=tex.filter(x=>x.contains("Scala")) //transformed RDD
    
    println(filData.count())
   }
}