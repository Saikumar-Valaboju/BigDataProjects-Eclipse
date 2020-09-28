package com.wissen.postgresql

import java.sql.Connection
import java.sql.ResultSet
import java.sql.DriverManager
import java.sql.PreparedStatement


object FetchDetails {
   def main(args:Array[String]){
     
     var connection:Connection=null
     var query:String="select * from employees"
     var res:ResultSet=null
     var ps:PreparedStatement=null
     var count:Int=0
     
    
     // Registering The JDbc Driver
		Class.forName("org.postgresql.Driver");
		
    println("\n \t ****Application Developed Through Maven****")
    /*Establis the connection*/
  	// connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:50908/postgres","postgres","saatwik");
	  //connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","saatwik");
	  connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","saatwik");
	     
    if(connection==null)
      println("Connection Not Established")
    else
			System.out.println("\n \t <===> FROM Postgresql <===> ");	
			System.out.println("\n \t CONNECTION IS Established");
		
		  //create Prepared Statement Object
	  if(connection!=null)
  	  ps=connection.prepareStatement(query)
  	  
  	 //execute the query
		 if(ps!= null)
		   res=ps.executeQuery();
		   
	  //Logic to Fetch records
		 while(res.next())
		 {
			 println(res.getInt(1)+" "+res.getString(2)+res.getString(3));
			 count=count+1
		 }/*while*/
		 
	  if(count == 0)
			 System.out.println("Records not found");
		 else
		   println(count+" rows effected")
	}
}