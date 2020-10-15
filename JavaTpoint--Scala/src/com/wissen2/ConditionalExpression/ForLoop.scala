package com.wissen2.ConditionalExpression

object ForLoop {
  def main(args:Array[String]){
    println("defining with to keyword")
    println("to is like--> less than or equal to")
    for(a <-1 to 10)
      println(a)
      
    println("defining with until keyword")
    println("until is like-->less than")
    for(a<-1 until 10)
      println(a)
      
    println("defining with for-loop filter condition")
    println("Even numbers from 2 to 10")
    for(a<-1 to 10 if a%2==0)
      println(a)
  }
}