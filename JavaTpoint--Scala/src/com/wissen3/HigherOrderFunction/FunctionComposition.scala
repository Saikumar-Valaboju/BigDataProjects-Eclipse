package com.wissen3.HigherOrderFunction

object FunctionComposition {
  def main(args: Array[String]){
    var result=multiplyBy2(add2(10))
      println(result)
  }
  def add2(a:Int):Int={
    a*3
  }
  def multiplyBy2(a:Int):Int={
    a*4
  }
}