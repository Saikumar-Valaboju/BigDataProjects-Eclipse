package com.wissen8.Arrays


class SingleDimExample{
  var arr=new Array[Int](5)
  def show(){
    for(a<-arr){
      println(a)
    }
    println("Elements before assignement-->"+arr(2))
    arr(2)=35
    println("Elements after assignment--->"+arr(2))
  }
}

object SingleDimensionalSecod {
   def main(args:Array[String]){  
        var a = new SingleDimExample()  
        a.show()  
    }  
}