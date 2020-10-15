package com.wissen4.OopsConcepts

object MethodOverriding {
  def main(args:Array[String]){
    val b=new Bike()
    b.run()
  }
}
class Vechile{
  def run(){
    println("Vechile is running")
  }
}
class Bike extends Vechile{
 override def run(){
    println("Bike is running....")
  }
}