package com.wissen7.accessmodifier

class AccessE{
  private var p:Int=10
  def show(){
    println("Example on private variable--->"+p)
  }
}
object AccessExm {
  def main(args:Array[String]){
    var ae=new AccessE()
   // ae.p=123;   //error: variable p in class AccessE cannot be accessed in AccessE
    ae.show()
  }
}