package com.wissen5.abstraction

object MainObjective {
  def main(args:Array[String]){
    var h=new Hero()
    h.run()
  }
}
abstract class Bike11{
  def run()
}
class Hero extends Bike11{
  def run(){
    println("Running Fine...!!! Perfect...!!!")
  }
}