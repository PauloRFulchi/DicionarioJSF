package br.com.dicionario.Palavras;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.com.dicionario.Funcoes.Funcoes;


@ManagedBean(name = "salvarpalavras")
@RequestScoped
public class salvarPalavras {
	Funcoes Funcoes = new Funcoes();

	public void salvar(String str) {
		camposPalavras.Cadastrar = str;
	}

	public void limpar() {
		camposPalavras.Cadastrar = "Fechar";

		camposPalavras.Texto = "";
		camposPalavras.Definicao = "";
		camposPalavras.Definicaoextra = "";
	}

	public void execute() {
		if (camposPalavras.Cadastrar.equals("Salvar") == true) {

			String CodDicionario = "";
			String txtTexto = "";
			String txtDefinicao = "";
			String txtDefinicaoExtra = "";

			try {
				if (camposPalavras.Texto == null || camposPalavras.Texto.equals("")) {
					return;
				} else {
					CodDicionario = camposPalavras.CodDicionario;

					txtTexto = camposPalavras.Texto;
					txtDefinicao = camposPalavras.Definicao;
					txtDefinicaoExtra = camposPalavras.Definicaoextra;
				}
			} catch (Exception e) {
			}

			if (Funcoes.Verificar(txtTexto, "DicionarioTexto", "Texto") == 0) {

				try {
					Funcoes.Inserir("Insert Into DicionarioTexto (Cod_Dicionario, Texto, Definicao, Definicao_Extra) " +
					" Values(" + CodDicionario + ",'" + txtTexto + "','" + txtDefinicao + "','" + txtDefinicaoExtra + "');");

				} catch (Exception e) {
				}

			}
		}

		limpar();
	}
}
