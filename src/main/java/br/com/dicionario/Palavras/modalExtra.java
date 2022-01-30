package br.com.dicionario.Palavras;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "modalextra")
@SessionScoped
public class modalExtra {

	public static String Texto = "";
	public static String Definicaoextra = "";

	public String getTexto() {
		return Texto;
	}

	public void setTexto(String Texto) {
		this.Texto = Texto;
	}

	public String getDefinicaoextra() {
		return Definicaoextra;
	}

	public void setDefinicaoextra(String Definicaoextra) {
		this.Definicaoextra = Definicaoextra;
	}

	
	public void execute(String texto, String definicao) {
		Texto = texto;
		Definicaoextra = definicao;
	}
}
