package com.wissen9.string

class SubString{
  val s1="SaiKumar Valaboju"
  def show(){
    println(s1.substring(0, 10))
  }
}
object SubStringExmple {
  def main(args:Array[String]){
    val sb=new SubString()
    sb.show()
  }
}