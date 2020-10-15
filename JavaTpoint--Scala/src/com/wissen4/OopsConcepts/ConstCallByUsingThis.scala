package com.wissen4.OopsConcepts

object ConstCallByUsingThis {
  def main(args:Array[String]){
    val s=new Example1(100,"Chitti")
  }
}
class Example1(name:String){
  def this(id:Int,name:String){
    this(name)
    println(id+"\t"+name)
  }
  
}