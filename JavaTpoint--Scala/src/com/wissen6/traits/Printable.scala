package com.wissen6.traits

trait Printable {
  def print()
}
class A4 extends Printable{
  def print(){
    println("Helloo...!!!")
  }
}
object MainObject{  
    def main(args:Array[String]){  
        var a = new A4()  
        a.print()  
    }  
}  