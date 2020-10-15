package com.wissen8.Arrays

class ArrayExample1{
  def show(arr:Array[Int]){
    for(a<-arr)
      println(a)
      
    println("Third Element--->"+arr(2))
  }
}

object ArrayIntoFunction {
  def main(args:Array[String]){
    val arr=Array(1,2,3,4,5,6,7,8,9)  // create single dimensional array
    val a=new ArrayExample1()
    a.show(arr)
  }
}