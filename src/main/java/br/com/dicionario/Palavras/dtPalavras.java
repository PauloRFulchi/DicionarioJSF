package br.com.dicionario.Palavras;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.com.dicionario.Funcoes.Funcoes;



@ManagedBean(name = "dtpalavras")
@RequestScoped
public class dtPalavras {
	Funcoes Funcoes = new Funcoes();

	public List<itemPalavras> palavrasLista;

	public List<itemPalavras> getpalavrasLista() {
		palavrasLista = new ArrayList<>();

		try {
			try {
				ResultSet rs = Funcoes.carregarRS("Select Codigo, Texto, Definicao, Definicao_Extra " +
				"From DicionarioTexto Where Cod_Dicionario='" + camposPalavras.CodDicionario + "' ORDER BY Texto ASC;");

				while (rs.next()) {
					palavrasLista.add(new itemPalavras(rs.getInt("Codigo"), rs.getString("Texto"), 
							rs.getString("Definicao"), rs.getString("Definicao_Extra")));
				}
			} catch (Exception e) {
			}

		} catch (Exception e) {
		}

		return palavrasLista;
	}
}
