package com.wissen10.ExceptionHandling

class InvalidAgeException(s:String) extends Exception(s){
  
}
class ExceptionExa{
  @throws(classOf[InvalidAgeException])
  def validate(age:Int){
    if(age>=18)
      println("You are eligible to Vote")
    else
      throw new InvalidAgeException("You are not eligible to vote ")
  }
}

object CustomException {
  def main(args:Array[String]){
    var ee=new ExceptionExa()
    try{
      ee.validate(10)
    }catch {
       case e: Exception => println("Exception Occurred--->"+e)
    }
  }
}