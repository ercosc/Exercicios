package main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//funciona();
		//multiplica(5, 10);
		//subtrai();
		//hipotenusa();
		//impar();
		sair10();
	}
	
	//1. Implemente um código que apresente na tela o texto "Funciona ou morre!"
	private static void funciona() {
		JOptionPane.showMessageDialog(null, "Funciona ou morre!");
	}
	
	//2. Implemente um código que realiza a multiplicação de dois valores e imprima o resultado na tela.
	private static void multiplica(int a, int b) {
		int result = a*b;
		JOptionPane.showMessageDialog(null, result);
	}
	
	//3. Implemente um código que solicite ao usuário dois valores, realize a subtração e imprima o resultado na tela.
	private static void subtrai() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
		int result = a-b;
		JOptionPane.showMessageDialog(null, result);
	}
	
	//4. Implemente um código que solicite o valor de dois catetos para o usuário, realize o cálculo e imprima o valor da hipotenusa.
	private static void hipotenusa() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("insira o Cateto Oposto"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o cateto adjacente"));
		double result = Math.sqrt((a*a)+(b*b));
		JOptionPane.showMessageDialog(null, result);
	}
	
	//Implemente um código que solicite do usuário um número e
	//imprima na tela a sequência de números ímpares limitado pelo valor
	//do usuário. Por exemplo, caso o usuário informe o valor 10, o
	//programa deve imprimir 1,3,5,7,9.
	private static void impar() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("insira um valor"));
		String result = "";
		for(int i=1;i>=a;i++) {
			if(i%2 == 1) {
				result += i + " ";
			}
		}
		JOptionPane.showMessageDialog(null, result);
	}
	
	//6. Implemente um código que só permita que o usuário saia do
	//programa, caso ele digite o número 10.
	private static void sair10() {
		while(true) {
			if(Integer.parseInt(JOptionPane.showInputDialog("digite 10 para sair")) == 10) {
				return;
			}
		}
	}
	
}
