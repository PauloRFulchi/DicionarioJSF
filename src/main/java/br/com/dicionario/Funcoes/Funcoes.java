package br.com.dicionario.Funcoes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Funcoes {
	Conexao Conexao = new Conexao();
	
	public int Verificar(String strTexto, String strTabela, String strColuna) {
		int intPassou = 0;
		
		try{
 		   try{
 			   ResultSet rs = carregarRS("Select Count(*) as 'Result' From " + strTabela + " Where " + strColuna + " = '" + strTexto + "';"); 			 					 
				
 			   while(rs.next()) {					 					
 				   intPassou = rs.getInt("Result");				 
 			   } 					 				 			 
 		   }catch(Exception e){	 			 
 		   } 				 				 			 		 		
 	  
		}catch(Exception e){	 		 	   
		}
		
		return intPassou;		
	}
	
	public ResultSet carregarRS(String Query) {			
		ResultSet rs = null;		
		
		try{
			Statement stmt = Conexao.getConnection().createStatement(); 
			rs = stmt.executeQuery(Query); 
			
			return rs;		        
		 } catch(Exception e) {			 	       
		 } 
		        
		 return rs;		 	
	 }	
	
	public String Inserir(String Query){
		Connection conn = Conexao.getConnection();

        if(conn != null){        	
        	try {       	
        		Statement statement = conn.createStatement();        	
        		statement.executeUpdate(Query);
        		
        		conn.close();        	
        	}catch(SQLException e){
        		return e.toString();
        	}
        }        	
        
        return "OK";
	}
	
}
