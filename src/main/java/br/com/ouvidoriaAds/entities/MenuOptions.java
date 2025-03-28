package br.com.ouvidoriaAds.entities;

import javax.swing.JOptionPane;

public class MenuOptions {
	
	
	public static int menu() {
		
		String[] menuOptions = { "1- Criar uma manifestação", "2- Listar manifestações existentes", 
				"3- Buscar manifestação por tipo", "4- Buscar manifestação por código", "5- Excluir manifestação", "6- Sair" };
		
		int opcao = JOptionPane.showOptionDialog(null, "selecione uma opção", "Menu", 0, JOptionPane.PLAIN_MESSAGE, null, menuOptions, null);
		
		return opcao;
	}

}

	
/*
 * 1- Criar uma manifestação 
 * 2- Listar manifestações existentes 
 * 3- Buscar manifestação por tipo
 * 4- Buscar manifestação por código
 * 5- Excluir manifestação
 * 6- Sair
 */