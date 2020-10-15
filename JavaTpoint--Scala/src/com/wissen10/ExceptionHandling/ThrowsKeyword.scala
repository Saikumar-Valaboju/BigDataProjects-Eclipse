package com.wissen10.ExceptionHandling

class SampleException4{
  @throws(classOf[NumberFormatException])
  def validate(){
    "abc".toInt
  }
}

object ThrowsKeyword {
  def main(args:Array[String]){
    var sl=new SampleException4()
    try{
      sl.validate()
    }catch{
      case ex:NumberFormatException=>println("Exception handled here...")
    }
    println("Rest of code executing here....")
  }
}