package com.wissen4.OopsConcepts

object SingletonObject {
  def hello(){
    println("Helloo...!!! This is an Singleton Object")
  }
}
object mainMatheod{
  def main(args:Array[String]){
    SingletonObject.hello()
  }
}