package br.com.dicionario.Palavras;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "campospalavras")
@SessionScoped
public class camposPalavras {

	public static int CodigoTexto = 0;		
	public static String CodDicionario = "";
	public static String NomeDicionario = "";
	public static String Texto = ""; 		
	public static String Definicao = "";
	public static String Definicaoextra = "";
	
	public static String Cadastrar = "Fechar";
	
	public int getCodigoTexto() {
		return CodigoTexto;
	}		
	
	public void setCodigoTexto(int CodigoTexto){
		this.CodigoTexto = CodigoTexto;
	}
	
	
	public String getCodDicionario() {
		return CodDicionario;
	}		
	
	public void setCodDicionario(String CodDicionario){
		this.CodDicionario = CodDicionario;
	}
	
	public String getnomeDicionario() {
		return NomeDicionario;
	}		
	
	public void setnomeDicionario(String NomeDicionario){
		this.NomeDicionario = NomeDicionario;
	}
	
	
	public String getTexto() {
		return Texto;
	}
		
	public void setTexto(String Texto){
		this.Texto = Texto;
	}
	
	public String getDefinicao() {
		return Definicao;
	}
		
	public void setDefinicao(String Definicao){
		this.Definicao = Definicao;
	}
	
	public String getDefinicaoextra() {
		return Definicaoextra;
	}
		
	public void setDefinicaoextra(String Definicaoextra){
		this.Definicaoextra = Definicaoextra;
	}
	
	
	
	public String getCadastrar() {
		return Cadastrar;
	}
	
	public void setCadastrar(String Cadastrar){
		this.Cadastrar = Cadastrar;
	}
}
