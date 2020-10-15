package com.wissen3.Functions

object ParameterizedFunction {
  def main(args: Array[String]){
    println(functionExample(10,20))
    
  }
  def functionExample(a:Int,b:Int)={
    var c=a+b
    c
  }
}