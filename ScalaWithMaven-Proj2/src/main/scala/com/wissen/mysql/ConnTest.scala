package com.wissen.mysql

import java.sql.Connection;
import java.sql.DriverManager;

object ConnTest {
   def main(args:Array[String]){
     
     println("\n \t ****Application Developed Through Maven****")
     
    //declaring connection object
    var connection:Connection=null
     
    // Loading Mysql jdbc driver class
    Class.forName("org.gjt.mm.mysql.Driver");
   // Class.forName("com.mysql.cj.jdbc.Driver");
    
    //Establishing connection
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chary","root","root");
    
    if(connection==null)
      println("Connection Not Established")
    else
  		System.out.println("\n \t TO Mysql DATABASE CONNECTION IS ESTABLISHED");
  }
}