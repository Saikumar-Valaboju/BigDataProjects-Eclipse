package com.wissen8.Arrays

class FOrEcach{
  var arr1=Array(9,8,7,6,5,4,3,2,1)   //single dimensional array
  arr1.foreach((element:Int)=>println(element))
}

object UsingForEachLoop {
  def main(args:Array[String]){
    new FOrEcach()
  }
}