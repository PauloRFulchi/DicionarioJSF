package br.com.dicionario.dicionario;


public class itemDicionario {
	
	private final int codigo;    
	private final String nome;    
	    
	
	public itemDicionario(int codigo, String nome) {    
		this.codigo = codigo;    
		this.nome = nome;		 
	}
	
	public int getCodigo() {  
		return codigo;  
	}
	
	public String getNome() {  
		return nome;  
	} 
}    