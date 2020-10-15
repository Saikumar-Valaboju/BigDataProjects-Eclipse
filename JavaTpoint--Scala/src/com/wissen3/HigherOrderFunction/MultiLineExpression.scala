package com.wissen3.HigherOrderFunction

object MultiLineExpression {
  def add2(a:Int,b:Int)={
    a+
    b
  }
  def add3(a:Int,b:Int)={
    (a
     +b)
  }
  def main(args:Array[String]){
    var result1=add2(10,10)
    var result2=add3(20,20)
    println(result1+"\t\t"+result2)
  }
}