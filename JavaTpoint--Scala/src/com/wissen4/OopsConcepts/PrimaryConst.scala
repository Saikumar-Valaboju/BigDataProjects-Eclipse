package com.wissen4.OopsConcepts

object PrimaryConst {
  def main(args:Array[String]){
    val s=new StudentCons(100,"SaiKumar")
    s.showDetails()
  }
}
class StudentCons(id:Int,name:String){
  def showDetails(){
    println(id+"\t"+name)
  }
}