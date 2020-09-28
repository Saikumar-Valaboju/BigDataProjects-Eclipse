package com.wissen.postgresql

import java.sql.Connection
import java.sql.DriverManager


object ConnTest {
   def main(args:Array[String]){
     
    println("\n \t ****Application Developed Through Maven****")
     
     var connection:Connection=null
     
     // Registering The JDbc Driver
		Class.forName("org.postgresql.Driver");
	  
    println("postgres Driver Class loaded")
		
    /*Establish the connection*/
	  //	connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:50908/postgres","postgres","saatwik");
	  //  connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","saatwik");
	  connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","saatwik");

			System.out.println("\n \t <===> FROM Postgresql <===> ");	
			System.out.println("\n \t CONNECTION IS DONE");
			System.out.println("\n \t Scala is Talking to PgAdmin");
	}
}