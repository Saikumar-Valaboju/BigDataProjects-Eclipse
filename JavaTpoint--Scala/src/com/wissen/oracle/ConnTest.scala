package com.wissen.oracle

object ConnTest {
  def main(args: Array[String]){
    Class.forName("oracle.jdbc.driver.OracleDriver")
    println("Jdbc Driver Class Loaded")
  }
}