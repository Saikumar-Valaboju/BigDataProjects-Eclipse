package com.wissen3.Actions

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Firstmethod {
  
  def main(args:Array[String]){
    
    //create Spark-configuration objet
    val conf=new SparkConf().setAppName("FirstMethod").setMaster("local")
    
    //create spark-context object
    val sc=new SparkContext(conf)
    
    val char=sc.parallelize(List("AAA","BBB","CCC","DDD","FFF","KKK","UUU","BBB"))
    
    println(char.first())
    
    val tex=sc.textFile("C://SaiKumar V//Scala-File.txt")
    
    val filData=tex.filter(x=>x.contains("Scala")) //based on text
    
    println(filData.first())
  }
  
}