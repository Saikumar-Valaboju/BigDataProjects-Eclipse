package com.wissen4.OopsConcepts

object Thrid {
  def main(args:Array[String]){
    println("Defining Ananymous Object")
    new Ananymous().add(20, 10)
  }
}
class Ananymous{
  def add(a:Int,b:Int){
    var add=a+b
    println("Addition of two Numbers-->"+add)
  }
}