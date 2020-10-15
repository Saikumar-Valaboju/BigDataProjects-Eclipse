package com.wissen4.OopsConcepts

object FieldsOverriding {
  def main(args:Array[String]){
    println("here imp concept is -->val & var keyword")
    var bb=new Bike1()
    bb.show()
  }
}
class Vechile1{
  val speed:Int=60

}

class Bike1 extends Vechile1{
 override val speed:Int = 100 // Imp is val keyword //var speed needs override modifier or keyword
  def show(){
    println("Bike speed iss -->"+speed)
  }
}