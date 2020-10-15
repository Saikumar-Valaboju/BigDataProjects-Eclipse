package com.wissen10.ExceptionHandling

class SampleExcep{
  def divide(a:Int,b:Int){
    try{
      a/b
      var arey=Array(1,2)
      arey(10)
    }catch{
      case e:ArithmeticException=>println(e)
      case ex:Throwable=>println("Found Unknown Exception is--->"+ex)
    }
    println("executing Rest of code...!!!")
  }
}

object ExceptionExample {
  def main(args:Array[String]){
    var q=new SampleExcep()
    q.divide(100, 10)
  }
  
}