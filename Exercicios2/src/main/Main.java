package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		fatorial(5);
	}
	
	//1. Leia um valor inteiro. Assuma que este valor indica um mês do
	//ano; imprima o nome desse mês.
	private static void mesNum() {
		int mes = Integer.parseInt(JOptionPane.showInputDialog("digite um mês do ano"));
		switch(mes) {
		case 1:
			JOptionPane.showMessageDialog(null, "Janeiro");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Fevereiro");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Março");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Abril");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Maio");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Junho");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Julho");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "Agosto");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Setembro");
			break;
		case 10: 
			JOptionPane.showMessageDialog(null, "Outubro");
			break;
		case 11:
			JOptionPane.showMessageDialog(null, "Novembro");
			break;
		case 12:
			JOptionPane.showMessageDialog(null, "Dezembro");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Insira um mês válido");
			break;
		}
	}
	
	//2. Leia três valores inteiros. Assuma que estes valores indicam o
	//dia, mês e ano de uma mesma data; imprima a data do dia anterior e
	//a data do dia seguinte. Por exemplo, para as entradas 20 8 2003, o
	//programa imprime 19:8:2003 e 21:8:2003.
	private static void data() {
		String dia = JOptionPane.showInputDialog("Insira o dia");
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Insira o mes"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano"));
		
		String result ="";
		JOptionPane.showMessageDialog(null, result);
	}
	
	//3. Implemente um programa que converta um peso expresso em pounds
	//para kilograma (1 pound ~= 2.2 kilogramas). Como um peso não pode
	//ser representado por um valor negativo, seu programa deve informar
	//ao usuário que valores negativos são inválidos, caso o usuário
	//tente inserir tal valor.
	public static void toPounds() {
		String s = JOptionPane.showInputDialog("Insira o valor em KG (não serão aceitos valores negativos");
		if(isNumeric(s)) {
			int i = Integer.parseInt(s);
			if(i < 0) {
				JOptionPane.showMessageDialog(null, "Insira um valor maior ou igual a 0");
				toPounds();
				return;
			} else {
				double pound = i/2.2;
				JOptionPane.showMessageDialog(null, pound);
			}
		}
		
	}
	
	public static boolean isNumeric(String s) {
		
		return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
	} 
	
	//4. Solicite um valor numérico ao usuário e imprima “Você Ganhou”
	//caso o número digitado seja maior que 5 e esteja entre 8 e 12, ou
	//seja maior que 33.
	public static void voceGanhou() {
		String s = JOptionPane.showInputDialog("Insira um número");
		if(isNumeric(s)) {
			int i = Integer.parseInt(s);
			if (i > 5 && i >= 8 && i <= 12 || i > 33) {
				JOptionPane.showMessageDialog(null, "voce ganhou");
			} else {
				voceGanhou();
				return;
			}
		}
	}
	
	//5. Leia dois valores do usuário, apresente o maior número lido.
	public static void maior()
	{
		String s1 = JOptionPane.showInputDialog("Insira um valor:");
		String s2 = JOptionPane.showInputDialog("Insira outro valor:");
		
		if(isNumeric(s1) && isNumeric(s2)) {
			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);
			if(i1 == i2) {
				JOptionPane.showMessageDialog(null, "Valores iguais");
			} else if(i1 > i2) {
				JOptionPane.showMessageDialog(null, i1);
			} else 
				JOptionPane.showMessageDialog(null, i2);
	
		}
	}
	
	//6. O tradutor: Leia uma entrada do usuário que indique a língua em
	//que o usuário deseja ver a mensagem (ex.: “es”, “pt­br”, “en”). O
	//programa então deve imprimir a mensagem “Sou um tradutor!”, na
	//língua escolhida.
	public static void tradutor() {
		String linguagem = JOptionPane.showInputDialog("Selecione uma linguagem(ES,PT ou EN):");
		
		switch(linguagem) {
		case "ES":
			JOptionPane.showMessageDialog(null, "Soy un tradutor");
			break;
		case "PT":
			JOptionPane.showMessageDialog(null, "Sou um Tradutor");
			break;
		case "EN":
			JOptionPane.showMessageDialog(null, "I'm a Translator");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Insira uma linguagem correta");
			tradutor();
			break;
		}
	}
	
	//7. Leia do usuário o valor e a unidade de medida de uma
	//temperatura (celsius, kelvin e farenheight). E converta para outra
	//unidade de medida escolhida pelo usuário. Apresente o resultado na
	//tela.
	public static void temp() {
		String s1 = JOptionPane.showInputDialog("Insira a temperatura:");
		String s2 = JOptionPane.showInputDialog("Insira a unidade de temperatura(C,K,ou F):");
		String s3 = JOptionPane.showInputDialog("Insira a unidade de temperatura a ser transformada(C,K ou F):");

		if(isNumeric(s1)) {
			double i = Integer.parseInt(s1);
			switch(s2) {
			case "c":
				switch(s3) {
				case "c":
					JOptionPane.showMessageDialog(null, i);
					break;
				case "f":
					i = i*9/5+32;
					JOptionPane.showMessageDialog(null, i);
					break;
				case "k":
					i= i+273.15;
					JOptionPane.showMessageDialog(null, i);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Insira uma unidade de temperatura válida s3");
					break;
				}
				break;
			case "f":
				switch(s3) {
				case "c":
					i = (i-32)*5/9;
					JOptionPane.showMessageDialog(null, i);
					break;
				case "f":
					JOptionPane.showMessageDialog(null, i);
					break;
				case "k":
					i= (i+459.67)*5/9;
					JOptionPane.showMessageDialog(null, i);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Insira uma unidade de temperatura válida s3");
					break;
				}
				break;
			case "k":				
				switch(s3) {
				case "c":
					i = i-273.15;
					JOptionPane.showMessageDialog(null, i);
					break;
				case "f":
					i = i*9/5-459.67;
					JOptionPane.showMessageDialog(null, i);
					break;
				case "k":
					JOptionPane.showMessageDialog(null, i);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Insira uma unidade de temperatura válida s3");
					break;
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Insira uma unidade de temperatura válida s2");
				break;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Insira um valor de temperatura correto");
			temp();
			return;
		}
	}

	//8. Elabore um código que receba como parâmetro a idade e o sexo de
	//uma pessoa e retorne ‘VERDADEIRO’ ou ‘FALSO’, indicando se a
	//pessoa está na faixa de idade para alistamento somente se essa for
	//do sexo masculino.
	public static boolean alistamento(int idade, String sexo) {
		if(idade == 18 && sexo == "m") {
			return true;
		} else {
			return false;
		}
	}
	
	//9. Conceba um código que transforme notas numéricas em menções.
	public static void mencoes() {
		String s = JOptionPane.showInputDialog("Insira a nota");
		String result;
		if(isNumeric(s)) {
			double i = Integer.parseInt(s);
			if(i >= 0 && i < 3) {
				JOptionPane.showMessageDialog(null, "Sua menção é II");
			} else if(i >=2 && i < 5) {
				JOptionPane.showMessageDialog(null, "Sua menção é MI");				
			} else if(i >=5 && i < 7) {
				JOptionPane.showMessageDialog(null, "Sua menção é MM");
			} else if(i >= 7 && i < 9) {
				JOptionPane.showMessageDialog(null, "Sua menção é MS");
			} else if(i >= 9 && i <= 10) {
				JOptionPane.showMessageDialog(null, "Sua menção é SS");
			} else if(i < 0 || i > 10) {
				JOptionPane.showMessageDialog(null, "Insira uma menção válida");
			}
		} else {
			JOptionPane.showMessageDialog(null, "O valor digitado não é um número");
		}
	}
	
	//10. Crie um código que leia um valor do usuário e apresente a
	//sequência de Fibonacci até aquele valor.
	public static void fibonacci2() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite um numero: ");
		String s = scan.nextLine();
		if(isNumeric(s))
		{
			int a = Integer.parseInt(s);
			ArrayList array = new ArrayList();
			int fibo1 = 1, fibo2 = 0;
        
			array.add(fibo2);
        
			while(fibo1 <= a) {
				array.add(fibo1);
				fibo1 = fibo1+fibo2;
				fibo2 = fibo1-fibo2;
			}
			System.out.println(array);
		} else {
			System.out.println("Insira um numero válido");
		}
	}
	
	//16. Implemente um código que informe o valor do fatorial de um
	//número inserido pelo usuário.
	public static int fatorial(int i) {
		if(i>1)
		{
		i = i*fatorial(i-1);
		}
		System.out.println(i);
		return i;
	}
}
