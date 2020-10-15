package com.wissen5.programs

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object WordCount {
  
  def main(args:Array[String]){
    
    val conf=new SparkConf().setAppName("WordCount").setMaster("local")
    
    val sc=new SparkContext(conf)
    
   val file=sc.textFile("C://SaiKumar V//WordCount.txt")
   
   val splitfile=file.flatMap(line=>line.split(" "))
   
   val mapdata=splitfile.map(word=>(word,1))
   
   // Now perform reduce operation
   val reducedata=mapdata.reduceByKey(_+_)
   
   reducedata.foreach(println)
  }
}