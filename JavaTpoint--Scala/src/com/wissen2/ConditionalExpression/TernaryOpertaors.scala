package com.wissen2.ConditionalExpression

object TernaryOpertaors {
  def main(args:Array[String]){
    val result=checkIt(-10)
    print(result)
  }
  def checkIt(a:Int)=if(a>=0)1 else -1
}