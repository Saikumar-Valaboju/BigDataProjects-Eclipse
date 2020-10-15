package com.wissen4.OopsConcepts

object CompanionObject {
  def main(args:Array[String]){
    new CompanionClass().hello()
    println("This is Companion Object")
  }
}
class CompanionClass{
  def hello(){
    println("Helloo..!!! This is Companion Class")
  }
}