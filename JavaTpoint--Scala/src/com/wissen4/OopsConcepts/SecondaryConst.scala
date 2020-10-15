package com.wissen4.OopsConcepts

object SecondaryConst {
  def main(args:Array[String]){
    val st=new Student(100,"SaiKumar",25)
    st.showDetails()
  }
}
class Student(id:Int,name:String){
  var age:Int=0
  def showDetails(){
    println(id+"\t"+name+"\t"+age)
  }
  def this(id:Int,name:String,age:Int){
    this(id,name)     //calling primary constructor, and its first line
    this.age=age
  }
}