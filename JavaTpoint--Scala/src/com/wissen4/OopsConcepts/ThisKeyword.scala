package com.wissen4.OopsConcepts

object ThisKeyword {
  def main(args:Array[String]){
    val s=new Example(100,"SaiKUmar")
    s.showDetails()
  }
}
class Example{
  var id:Int=0
  var name:String=""
  def this(id:Int,name:String){
    this()
    this.id=id
    this.name=name
  }
  def showDetails(){
    println(id+"\t"+name)
  }
}