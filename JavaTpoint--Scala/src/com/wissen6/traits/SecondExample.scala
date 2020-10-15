package com.wissen6.traits

trait SecondExample {
  def run()
}
trait OneMore{
  def onemorerun()
}
trait Third{
  def thirdone()
}
class A6 extends SecondExample with OneMore{
  def run(){
    println("Second Example Running...!!!! fine")
  }
  def onemorerun(){
    println("OneMore Example..FIne..!!!")  
  }
}
object MainObj{  
    def main(args:Array[String]){  
        var a = new A6()  
        a.run()
        a.onemorerun()
    }  
}  