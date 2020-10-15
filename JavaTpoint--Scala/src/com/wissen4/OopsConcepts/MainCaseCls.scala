package com.wissen4.OopsConcepts

object MainCaseCls {
  def main(args:Array[String]){
    var c=CaseClass(20,10)  //creating object of case class
    println("a-->"+c.a)
    println("b-->"+c.b)
    
  }
}
case class CaseClass(a:Int,b:Int)