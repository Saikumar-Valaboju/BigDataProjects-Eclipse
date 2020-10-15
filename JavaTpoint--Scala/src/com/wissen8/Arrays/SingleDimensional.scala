package com.wissen8.Arrays

class ArrayExample{
  var arr=Array(1,2,3,4,5,6,7,8,9)
  def show(){
    for(a<-arr)
      println(a)
    println("Fifth Element is--->"+arr(4))
  }
}

object SingleDimensional {
  def main(args:Array[String]){  
        var a = new ArrayExample()  
        a.show()  
    }  
}