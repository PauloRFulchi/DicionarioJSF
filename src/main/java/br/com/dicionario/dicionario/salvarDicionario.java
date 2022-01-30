package br.com.dicionario.dicionario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.com.dicionario.Funcoes.Funcoes;



@ManagedBean(name = "myBean")
@RequestScoped
public class salvarDicionario {
	camposDicionario Cores = new camposDicionario();	
	Funcoes Funcoes = new Funcoes();
	
	public void salvar(String str) {
		camposDicionario.Cadastrar = str;
	}	
	
	public void limpar() {
		camposDicionario.Nome = "";
		camposDicionario.Cadastrar = "Fechar";
	       
		camposDicionario.CorBotao = "#000000"; 
		camposDicionario.CorbotaoFonte = "#FFFFFF";  
		camposDicionario.CorTitulo = "#FFFFFF";  
		camposDicionario.CorIcone = "#FFFFFF";  			
	}

	public void execute() {
       if(camposDicionario.Cadastrar.equals("Salvar") == true) {
    	   
    	   String txtNome = "";
    	   String CorBotao = "";
    	   String CorbotaoFonte = "";
    	   String CorTitulo = "";
    	   String CorIcone = "";
    	   
    	   try{			
    		   if(camposDicionario.Nome == null || camposDicionario.Nome.equals("")){				
    			   return;     			   
    		   }else{
    			   txtNome = camposDicionario.Nome;  
    			   
    			   CorBotao = camposDicionario.CorBotao; 
    	    	   CorbotaoFonte = camposDicionario.CorbotaoFonte; 
    	    	   CorTitulo = camposDicionario.CorTitulo; 
    	    	   CorIcone = camposDicionario.CorIcone; 
    		   }				
    	   }catch(Exception e){    		   
    	   }
        
           
    	   if(Funcoes.Verificar(txtNome, "Dicionario", "Nome") == 0) {        	
    		   try{    			
    			   
    			   Funcoes.Inserir("Insert Into Dicionario (Nome, Cor_Botao, Cor_Botao_Fonte, Cor_Titulo, Cor_Icone) " +
    			   " Values('" + txtNome + "','" + CorBotao + "','" + CorbotaoFonte + "','" + CorTitulo + "','" + CorIcone + "');");   			    	    			
    		
    		   }catch(Exception e) {			            
    		   }
    		   
    	   }        
       }
        
       limpar();
    }	
}
