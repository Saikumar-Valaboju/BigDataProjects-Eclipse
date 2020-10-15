package com.wissen5.abstraction

object MainObject1 {
  def main(args:Array[String]){
    
    println("Scala Constructor ,Variables & abstract methods ")
    
    var cn=new Heroo(10)
    cn.performance()
    cn.run()
    
  }
}
abstract class Vech(a:Int){     //creating constrcutor
  var b:Int=30
  var c:Int=40
  def run()
  def performance(){
    println("Well Performance...!!!")
  }
}
class Heroo(a:Int) extends Vech(a){
  c=45
  def run(){
    println("Running Perfect...!!!")
    println("a-->"+a)
    println("b-->"+b)
    println("c-->"+c)    // First check in subclass if not available then it will goto super class or parent class
  }
}