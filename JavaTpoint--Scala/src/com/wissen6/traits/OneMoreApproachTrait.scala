package com.wissen6.traits

trait Printti{
  def printt()
}
abstract class PrintA2A{
  def printA4()
}
class AB extends PrintA2A {    
  def printt(){
    println("Methiod from Trait (print())")
  }
  def printA4(){
    println("Method from ABstract class")
  }
}

object OneMoreApproachTrait {
    def main(args:Array[String]){  
       var a1 = new AB() with Printti             // You can also extend trait during object creation  
        a1.printt()  
       a1.printA4()  
       println("Always Make sure that if we are extending any abstarct class or implementing any trait(interface)....")
       println("That methods must and should be overriden in subclass")
    }  
}