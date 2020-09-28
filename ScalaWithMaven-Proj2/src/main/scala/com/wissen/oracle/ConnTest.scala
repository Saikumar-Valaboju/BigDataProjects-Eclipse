package com.wissen.oracle

import java.sql.Connection
import java.sql.DriverManager

object ConnTest {
  
   def main(args:Array[String]){
        
   println("\n \t ****Application Developed Through Maven****")
    //declaring connection object
      var connection:Connection=null
      
     // Loading Oracle jdbc driver class
    Class.forName("oracle.jdbc.driver.OracleDriver");
    println("Jdbc Driver Class loaded")
    
    //Establishing connection
    connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager")
    
    if(connection==null)
      println("Connection Not Established")
    else
      System.out.println("\n \t FROM TYPE-4 DRIVER");	
	  	System.out.println("\n \t TO ORACLE DATABASE CONNECTION IS ESTABLISHED");
  }
}