package com.wissen11.FileHandling

import scala.io._

object ReadEachCharacter {
  def main(args:Array[String]){
    val filename="C://SaiKumar V//Scala-File.txt"
    val fileSource=Source.fromFile(filename)
    println("data from the file is--->")
    while(fileSource.hasNext){
      print(fileSource.next())
    }
    fileSource.close()
  }
}