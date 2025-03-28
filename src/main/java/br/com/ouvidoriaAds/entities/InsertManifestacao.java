package br.com.ouvidoriaAds.entities;

import java.sql.Connection;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import lombok.Data;

@Data
public class InsertManifestacao {

	public static void insertManifestacao(Connection conn) {

		String autor = JOptionPane.showInputDialog("Digite o seu nome:");
		String ouvidor = JOptionPane.showInputDialog("Digite o nome do ouvidor:");
		String descricao = JOptionPane.showInputDialog("Digite sua manifestação:");

		String[] tipos = { "elogio", "reclamação", "sugestão" };
		String tipo = (String) JOptionPane.showInputDialog(null, "Selecione o tipo da manifestação", "tipos",
				JOptionPane.PLAIN_MESSAGE, null, tipos, tipos);

		String insertSql = "INSERT INTO manifestacao (autor, ouvidor, descricao, tipo) VALUES (?, ?, ?, ?)";


		  int linhasAlteradas;
		try {
			linhasAlteradas = JDBCUtils.realizarInsert(conn, insertSql, autor,
			  ouvidor, descricao, tipo);
			
			if (linhasAlteradas > 0) { JOptionPane.showMessageDialog(null, "Manifestação enviada!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		  
		 
		 

	}
}