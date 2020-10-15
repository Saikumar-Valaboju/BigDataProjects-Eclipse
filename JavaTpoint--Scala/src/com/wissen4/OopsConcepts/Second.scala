package com.wissen4.OopsConcepts

class Second(id:Int,name:String) {
  def show(){
    println(id+"\t"+name)
  }
}
object ScalaAnother{
  def main(args:Array[String]){
    println("Another way of creating scala class")
    val s=new Second(100,"SaiKumar")
    s.show()
  }
}