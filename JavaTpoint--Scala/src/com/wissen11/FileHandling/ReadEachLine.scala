package com.wissen11.FileHandling

import scala.io._

object ReadEachLine {
  def main(args:Array[String]){
    val fileName="C://SaiKumar V//Scala-File.txt"
    val fileSource=Source.fromFile(fileName)
    println("reading EachLine from The file")
    for(line<-fileSource.getLines()){
      println(line)
    }
    fileSource.close()
  }
}