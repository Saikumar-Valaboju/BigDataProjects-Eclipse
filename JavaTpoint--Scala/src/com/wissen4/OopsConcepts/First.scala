package com.wissen4.OopsConcepts

class SampleExampleClass {
  var id:Int=100
  var name:String="SaiKumar"
}
object MainMethod{
  def main(args:Array[String]){
    println("Scala Sample Example of Class")
    var s=new SampleExampleClass()
    println(s.id+"\t\t"+s.name)
  }
}