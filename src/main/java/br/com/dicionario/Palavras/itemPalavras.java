package br.com.dicionario.Palavras;

public class itemPalavras{
	
	private final int codigotexto;    
	private final String texto;  
	private final String definicao;	
	private final String definicaoextra;
	    
	
	public itemPalavras(int codigotexto, String texto, String definicao, String definicaoextra) {    
		this.codigotexto = codigotexto;    
		this.texto = texto;
		this.definicao = definicao;	
		this.definicaoextra = definicaoextra;	
	}
	
	public int getcodigotexto() {  
		return codigotexto;  
	}
	
	public String gettexto() {  
		return texto;  
	}
	
	public String getdefinicao() {  
		return definicao;  
	}
		
	public String getdefinicaoextra() {  
		return definicaoextra;  
	}
}    