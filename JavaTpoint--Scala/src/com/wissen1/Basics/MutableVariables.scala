package com.wissen1.Basics

object MutableVariables {
  def main(args:Array[String]){
    var data=100
    data=101
    println("data-->"+data)
    
    var d1:Int=100
    d1=102
    println("d1-->"+d1)
    
    var d2=100  // if you want to change the content at runtime then e should go for var keyword
    d2=102    // if you not instrtsd to cgange the content then we should go for val keuyword
  }
}