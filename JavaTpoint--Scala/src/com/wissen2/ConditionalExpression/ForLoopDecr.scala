package com.wissen2.ConditionalExpression

object ForLoopDecr {
  def main(args: Array[String]){
    println("defingi with to keywrod")
    for(a <- 10 to (1,-1)){
      println(a)
    }
    println("define with until keyword")
    for(a <- 10 until (1,-1)){
      println(a)
    }
    println("another way to print")
    for(i <- 10 to 0 by -1){
      println(i)
    }
  }
}