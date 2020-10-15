package com.wissen7.accessmodifier

class AccessExample{  
     var a:Int = 10  
     def show(){  
         println(" a = "+a)  
     }  
}  
  
object NoAccessModifier {
   def main(args:Array[String]){  
        var b = new AccessExample()  
       b.show() 
        b.a=30
        println("main class object a-->"+b.a)
         
    }  
}