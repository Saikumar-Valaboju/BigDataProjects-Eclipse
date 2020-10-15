package com.wissen3.Actions

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Collect {
  
  def main(args:Array[String]){
    
    
    //create Spark-configuration objet
    val conf=new SparkConf().setAppName("MapValuesMethod").setMaster("local")
    
    //create spark-context object
    val sc=new SparkContext(conf)
    
    //create an RDD by using Parallelized Collection
    val num=sc.parallelize((1 to 10000).toList)
    
    val filterRdD=num.filter(x=>(x%10)==0)
    
    val filterRes=filterRdD.collect()
    
    filterRes.foreach(println)
  }
}