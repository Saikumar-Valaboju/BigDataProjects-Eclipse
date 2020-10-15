package com.wissen2.ConditionalExpression

import scala.util.control.Breaks._ 

object Break {
  def main(args: Array[String]){
    breakable{
      for(a <- 2 to 10 by 2){
        if (a==8)
          break
        else
          println(a)
      }
    }
  }
}