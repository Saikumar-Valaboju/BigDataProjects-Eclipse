package com.wissen9.string

class ExampleString{
  var s1= "Scala String Example"
  s1="This is "+s1
  def show(){
    println(s1)
  }
}
object immutableString {
  def main(args:Array[String]){
    val sq=new ExampleString()
    sq.show()
  }
}