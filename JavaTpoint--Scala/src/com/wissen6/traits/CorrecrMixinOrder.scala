package com.wissen6.traits

trait Printt{
  def print()
}
abstract class PrintAA{
  def printA4()
}
class A66 extends PrintAA with Print{    
  def print(){
    println("Methiod from Trait (print())")
  }
  def printA4(){
    println("Method from ABstract class")
  }
}

object CorrecrMixinOrder {
  def main(args:Array[String]){  
        var a = new A66()  
        a.print()  
        a.printA4()  
  }
}