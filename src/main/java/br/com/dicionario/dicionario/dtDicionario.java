package br.com.dicionario.dicionario;

import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;  
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;
import br.com.dicionario.Funcoes.Funcoes;
import br.com.dicionario.Palavras.camposPalavras;

  
@ManagedBean(name = "dtdicionario")  
@RequestScoped 
public class dtDicionario {    
	Funcoes Funcoes = new Funcoes();
	
	public List<itemDicionario> dicionarioLista;  
	
	public List<itemDicionario> getdicionarioLista() {    
		dicionarioLista = new ArrayList<>();    
		
		try{
			try{					 
				 ResultSet rs = Funcoes.carregarRS("Select Codigo, Nome From Dicionario ORDER BY Nome ASC;"); 					 
					 
				 while(rs.next()) {						 
					 dicionarioLista.add(new itemDicionario(rs.getInt("Codigo"), rs.getString("Nome")));						 					 
				 } 					 				 
			 }catch(Exception e){					 
			 } 				 					 			 
		 
		}catch(Exception e){	 
		}
		
		camposPalavras.CodDicionario = "";
		
		return dicionarioLista;  
	}    
}  