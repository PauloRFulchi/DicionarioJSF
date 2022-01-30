package br.com.dicionario.dicionario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "camposdicionario")
@SessionScoped
public class camposDicionario {
	
	public static int Codigo = 0;
	public static String Nome = null;	
	public static String CorBotao = "#000000"; 
	public static String CorbotaoFonte = "#FFFFFF";  
	public static String CorTitulo = "#FFFFFF"; 
	public static String CorIcone = "#FFFFFF"; 
		
	
	public static String Cadastrar = "Fechar";
	
	public int getCodigo() {
		return Codigo;
	}
		
	public void setCodigo(int Codigo){
		this.Codigo = Codigo;
	}
		
	public String getNome() {
		return Nome;
	}
		
	public void setNome(String Nome){
		this.Nome = Nome;
	}	
	
	public String getCorBotao() {
		return CorBotao;
	}

	public void setCorBotao(String CorBotao){
		this.CorBotao = CorBotao;
	}	
	
	public String getCorbotaoFonte() {
		return CorbotaoFonte;
	}

	public void setCorbotaoFonte(String CorbotaoFonte){
		this.CorbotaoFonte = CorbotaoFonte;
	}
	
	public String getCorTitulo() {
		return CorTitulo;
	}

	public void setCorTitulo(String CorTitulo){
		this.CorTitulo = CorTitulo;
	}
	
	public String getCorIcone() {
		return CorIcone;
	}
	
	public void setCorIcone(String CorIcone){
		this.CorIcone = CorIcone;
	}
	
	
	
	public  String getCadastrar() {
		return Cadastrar;
	}
	
	public void setCadastrar(String Cadastrar){
		this.Cadastrar = Cadastrar;
	}
}
