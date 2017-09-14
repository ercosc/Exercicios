package main;

import javax.swing.JOptionPane;

import exercicio4.Token;

public class Main {

	public static void main(String[] args) {
		Token token = new Token();
		
		token.lexema(JOptionPane.showInputDialog("Escreva sua expressão aqui:"));
	}
}
