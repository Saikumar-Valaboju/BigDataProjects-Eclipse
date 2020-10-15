package com.wissen6.traits

trait Print{
  def print()
}
abstract class PrintA{
  def printA4()
}
/*class A66 extends Print with PrintA{    // here order missing..(error: class PrintA4 needs to be a trait to be mixed in)
  def print(){
    
  }
  def printA4(){
    
  }
}*/
object MixinTraits {
  
}