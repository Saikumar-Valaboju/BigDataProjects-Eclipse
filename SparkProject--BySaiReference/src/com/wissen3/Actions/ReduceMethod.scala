package com.wissen3.Actions

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object ReduceMethod {
  
  def main(args:Array[String]){
    
    //create Spark-configuration objet
    val conf=new SparkConf().setAppName("ReduceMethod").setMaster("local")
    
    //create spark-context object
    val sc=new SparkContext(conf)
    
    val char=sc.parallelize(List(10,20,30,40,50))
    
    val add=char.reduce((x,y)=>(x+y))
    
    println(add)
    
    val mul=char.reduce((x,y)=>(x*y))
   
    println(mul)
   
  }  
}