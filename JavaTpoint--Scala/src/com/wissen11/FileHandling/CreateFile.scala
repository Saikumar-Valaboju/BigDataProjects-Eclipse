package com.wissen11.FileHandling

import java.io._

object CreateFile {
  def main(args:Array[String]){
    val fileObjetc=new File("C://SaiKumar V//Scala-File.txt") //create file
    val printWriter=new PrintWriter(fileObjetc)    // passing file to the printwriter refernce Object
    printWriter.write("This Is Scala ---Data recieved from Writing")   //// Writing data to the file
    println("Data written to the file successfully....!!!!!")
    printWriter.close()  //closing printWriter
  }
}