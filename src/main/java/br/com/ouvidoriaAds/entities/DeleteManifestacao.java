package br.com.ouvidoriaAds.entities;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DeleteManifestacao {
	
	public static void excluirManifestacao(Connection conn) {
	
		try {
			
			SelectManifestacao.ListAll(conn);
			
			String idSelecionado = JOptionPane.showInputDialog("Digite o código da manifestação:");
			String deleteSql = "DELETE FROM manifestacao WHERE id = ?";
			
			int linhasAlteradas = JDBCUtils.realizarDelete(conn, deleteSql, idSelecionado);
			
			if(linhasAlteradas > 0) {
				JOptionPane.showMessageDialog(null, "Manifestação excluída com sucesso");
			};
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		
	};

}
