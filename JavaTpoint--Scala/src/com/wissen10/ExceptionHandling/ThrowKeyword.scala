package com.wissen10.ExceptionHandling

class ExampleThrow{
  def validate(age:Int){
    if(age>=18)
      println("You are eligible to Vote")
    else
      throw new ArithmeticException("You are not Eligible to Vote")
        
  }
}

object ThrowKeyword {
  def main(args:Array[String]){
    var ss=new ExampleThrow()
    ss.validate(10)
  }
}