package br.com.ouvidoriaAds;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

import br.com.ouvidoriaAds.entities.DeleteManifestacao;
import br.com.ouvidoriaAds.entities.InsertManifestacao;
import br.com.ouvidoriaAds.entities.JDBCUtils;
import br.com.ouvidoriaAds.entities.MenuOptions;
import br.com.ouvidoriaAds.entities.SelectManifestacao;

public class Main {

	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ouvidoria-java2";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASSWORD = "sua-senha";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {


			int opcaoEscolhida;

			do {

				opcaoEscolhida = MenuOptions.menu();
				
//				1- Criar uma manifestação
				if (opcaoEscolhida == 0) {
					
					InsertManifestacao.insertManifestacao(conn);

//				2- Listar manifestações existentes 
				} else if (opcaoEscolhida == 1) {
					
					SelectManifestacao.ListAll(conn);

//				3- Buscar manifestação por tipo
				} else if (opcaoEscolhida == 2) {
					
					SelectManifestacao.ListByType(conn);
					
//				4- Buscar manifestação por código
				} else if (opcaoEscolhida == 3) {

					SelectManifestacao.ListById(conn);
					
//				5- Excluir manifestação
				} else if (opcaoEscolhida == 4) {

					DeleteManifestacao.excluirManifestacao(conn);

//				6- Sair
				} else if (opcaoEscolhida == -1) {
					opcaoEscolhida = 5;
				}

				else if (opcaoEscolhida != 5) {
					JOptionPane.showMessageDialog(null, "Opção Inválida!");

				}


			} while (opcaoEscolhida != 5);

			JOptionPane.showMessageDialog(null,
					"Agradecemos por sua manifestação. Estaremos a disposição para te ajudar!");
			JDBCUtils.encerrarConexao(conn);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}