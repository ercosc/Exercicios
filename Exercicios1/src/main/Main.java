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
	
	//1. Implemente um c�digo que apresente na tela o texto "Funciona ou morre!"
	private static void funciona() {
		JOptionPane.showMessageDialog(null, "Funciona ou morre!");
	}
	
	//2. Implemente um c�digo que realiza a multiplica��o de dois valores e imprima o resultado na tela.
	private static void multiplica(int a, int b) {
		int result = a*b;
		JOptionPane.showMessageDialog(null, result);
	}
	
	//3. Implemente um c�digo que solicite ao usu�rio dois valores, realize a subtra��o e imprima o resultado na tela.
	private static void subtrai() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
		int result = a-b;
		JOptionPane.showMessageDialog(null, result);
	}
	
	//4. Implemente um c�digo que solicite o valor de dois catetos para o usu�rio, realize o c�lculo e imprima o valor da hipotenusa.
	private static void hipotenusa() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("insira o Cateto Oposto"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o cateto adjacente"));
		double result = Math.sqrt((a*a)+(b*b));
		JOptionPane.showMessageDialog(null, result);
	}
	
	//Implemente um c�digo que solicite do usu�rio um n�mero e
	//imprima na tela a sequ�ncia de n�meros �mpares limitado pelo valor
	//do usu�rio. Por exemplo, caso o usu�rio informe o valor 10, o
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
	
	//6. Implemente um c�digo que s� permita que o usu�rio saia do
	//programa, caso ele digite o n�mero 10.
	private static void sair10() {
		while(true) {
			if(Integer.parseInt(JOptionPane.showInputDialog("digite 10 para sair")) == 10) {
				return;
			}
		}
	}
	
}
