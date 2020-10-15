package com.wissen3.Functions

object RecursiveFunction {
  def main(args: Array[String]){
    println("DIdn't understood the logic")
    var result=functionExample(15,2)
    println(result)
  }
  def functionExample(a:Int,b:Int):Int={
    if(b==0)  //Base Funcion
      0
    else
      a+functionExample(a,b-1)
  }
}