package com.wissen4.OopsConcepts

object FieldsOverride {
  def main(args:Array[String]){
    var b=new Bike2()
    b.show()
  }
}
class Vehicle2{  
     val speed:Int = 60  
  
}  
  
class Bike2 extends Vehicle2{  
   override val speed:Int = 100  
    def show(){  
        println(speed)  
    }  
}  