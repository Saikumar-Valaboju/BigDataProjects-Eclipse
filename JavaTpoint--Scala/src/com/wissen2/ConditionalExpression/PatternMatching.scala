package com.wissen2.ConditionalExpression

object PatternMatching {
  def main(args: Array[String]){
    var a=5
    a match{
      case 1 => println("One")
      case 2 => println("Two")
      case 3 => println("Three")
      case _ => println("No one")
    }
  }
}