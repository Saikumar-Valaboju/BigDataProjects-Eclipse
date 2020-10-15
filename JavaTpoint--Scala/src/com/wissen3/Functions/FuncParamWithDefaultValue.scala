package com.wissen3.Functions

object FuncParamWithDefaultValue {
  def main(args:Array[String]){
    var res1=functionExample(15,2)
    var res2=functionExample(15)
    var res3=functionExample()
    println(res1+"\t"+res2+"\t"+res3)
  }
  def functionExample(a:Int=0,b:Int=0):Int={
    a+b
  }
}