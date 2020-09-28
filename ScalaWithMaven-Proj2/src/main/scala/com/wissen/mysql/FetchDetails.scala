package com.wissen.mysql

import java.sql.Connection
import java.sql.ResultSet
import java.sql.DriverManager
import java.sql.PreparedStatement


object FetchDetails {
   def main(args:Array[String]){
     
     var connection:Connection=null
     var query:String="select * from student"
     var res:ResultSet=null
     var ps:PreparedStatement=null
     var count:Int=0
     
          println("\n \t ****Application Developed Through Maven****")
     
     // Registering The JDbc Driver
		Class.forName("org.gjt.mm.mysql.Driver");
		
    /*Establish the connection*/
	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chary","root","root");
	     
    if(connection==null)
      println("Connection Not Established")
    else
			System.out.println("\n \t <===> FROM Mysql <===> ");	
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
			 println(res.getInt(1)+" "+res.getString(2)+res.getString(3)+"\t"+res.getInt(4));
			 count=count+1
		 }/*while*/
		 
	  if(count == 0)
			 System.out.println("Records not found");
		 else
		   println(count+" rows effected")
	}
}