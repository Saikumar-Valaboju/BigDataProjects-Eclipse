package com.wissen2.ConditionalExpression

object PatternMatchingAny {
  def main(args: Array[String]){
    var res=Search("case_sensitive_approach")
    println(res)
  }
  def Search(a:Any):Any= a match{
    case 1 =>println("Selected one")
    case 2 =>println("Selected Two")
    
    case "Hello" =>println("Good Monring Chitti")
    case "case_sensitive_approach" => println("It is case sensitive")
    case _ =>println("No Option")
  }
}