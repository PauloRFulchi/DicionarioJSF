package br.com.dicionario.Funcoes;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.PreparedStatement;


public class Conexao {	
	
	public static Connection conn;	 
	public static PreparedStatement pstmt;	
	
	
	public Connection getConnection(){ 		 
		try{  	            			
			Class.forName("com.mysql.jdbc.Driver");    	            			 
			String db_url ="jdbc:mysql://localhost:3306/dbdicionario", db_userName = "sa", db_password = "pf3660";	          			 
			conn = DriverManager.getConnection(db_url,db_userName,db_password);  	       		 
		} catch(Exception sqlException) {  	            			 
			sqlException.printStackTrace();	        		 
		}  
		 
		return conn;	    	 
	}
	
}
