package br.com.dicionario.Funcoes;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import br.com.dicionario.Palavras.camposPalavras;


@ManagedBean(name = "pagina")  
@RequestScoped
public class Pagina {
	
	public void navegar(String codigo, String nome, String pagina) throws IOException {	    
		camposPalavras.CodDicionario = codigo;
		camposPalavras.NomeDicionario = nome;
		
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
	    externalContext.redirect(pagina);	    
	}	
}
