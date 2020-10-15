package com.wissen3.HigherOrderFunction

object NestedFunction {
  def main(args:Array[String]){
    println("didn't understand the Logic")
    var result=add(10,10,10)
    println(result)
  }
  def add(a:Int,b:Int,c:Int)={
    def add(a:Int,b:Int)={
      a+b
    }
    add(a,add(b,c))
  }
}