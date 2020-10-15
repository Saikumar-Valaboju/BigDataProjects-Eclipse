package com.wissen9.string

class StrInterp{
  var pi=3.14
  var s1="SaiKumar Valaboju"
  def show(){
    println("The value of pi-->"+pi)
    println(s"the value of pi-->$pi")
    println(s"My name is $s1")
  }
}

object StringInterpolation {
  def main(args:Array[String]){
    val st=new StrInterp()
    st.show()
  }    
}