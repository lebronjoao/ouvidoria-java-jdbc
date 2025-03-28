package br.com.ouvidoriaAds.entities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class SelectManifestacao {

	public static void ListAll (Connection conn) throws SQLException {
		
		
		String listAll = "SELECT id, autor, ouvidor, descricao, tipo from manifestacao";
		ResultSet listaManifestacao = JDBCUtils.realizarSelect(conn, listAll);
		
		System.out.println("LISTA DE MANIFESTAÇÕES");
		while(listaManifestacao.next()) {
			int id = listaManifestacao.getInt("id");
			String autor = listaManifestacao.getString("autor");
			String ouvidor = listaManifestacao.getString("ouvidor");
			String descricao = listaManifestacao.getString("descricao");
			String tipo = listaManifestacao.getString("tipo");
			
			System.out.println(id + " | " + autor + " | " + ouvidor + " | " + descricao + " | " + tipo);
			
		}
		
		listaManifestacao.close();
		
	};
	
	public static void ListById (Connection conn) throws SQLException {
		
		String idDigitado = JOptionPane.showInputDialog("Digite o código da manifestação:");
		String listById = "SELECT id, autor, ouvidor, descricao, tipo from manifestacao where id = ?";
		ResultSet listaManifestacao = JDBCUtils.realizarSelect(conn, listById, idDigitado);
		
		System.out.println("MANIFESTAÇÃO COM ID = " + idDigitado);
		
		while(listaManifestacao.next()) {
			int id = listaManifestacao.getInt("id");
			String autor = listaManifestacao.getString("autor");
			String ouvidor = listaManifestacao.getString("ouvidor");
			String descricao = listaManifestacao.getString("descricao");
			String tipo = listaManifestacao.getString("tipo");
			
			System.out.println(id + " | " + autor + " | " + ouvidor + " | " + descricao + " | " + tipo);
			
		}
		
		listaManifestacao.close();
		
	};
	
	public static void ListByType (Connection conn) throws SQLException {
		
		String[] tipos = { "elogio", "reclamação", "sugestão" };
		String tipoSelecionado = (String) JOptionPane.showInputDialog(null, "Selecione o tipo da manifestação", "tipos",
				JOptionPane.PLAIN_MESSAGE, null, tipos, tipos);
		String listByType = "SELECT id, autor, ouvidor, descricao, tipo from manifestacao where tipo = ?";
		ResultSet listaManifestacao = JDBCUtils.realizarSelect(conn, listByType, tipoSelecionado);
		
		System.out.println("LISTA DE MANIFESTAÇÕES DO TIPO " + tipoSelecionado);
		while(listaManifestacao.next()) {
			int id = listaManifestacao.getInt("id");
			String autor = listaManifestacao.getString("autor");
			String ouvidor = listaManifestacao.getString("ouvidor");
			String descricao = listaManifestacao.getString("descricao");
			String tipo = listaManifestacao.getString("tipo");
			
			System.out.println(id + " | " + autor + " | " + ouvidor + " | " + descricao + " | " + tipo);
			
		}
		
		listaManifestacao.close();
		
	};
}

	
