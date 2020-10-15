package com.wissen3.HigherOrderFunction

object AnonymousFunction {
  def main(args:Array[String]){
    var result1=(a:Int,b:Int)=>a+b
    var result2=(_:Int)+(_:Int)
    println(result1(10,20))
    println(result2(10,20))
  }
}