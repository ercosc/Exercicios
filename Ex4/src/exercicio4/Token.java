/*
 * - Função1: Leia a entrada do código fonte de uma expressão de três operando e no máximo dois operadores alem do de atribuição.
 *
 * - Função2: Reconheça os caracteres encontrados no código fonte na sintaxe da expressão (variáveis, operadores, números, delimitadores, etc.).
 *
 * - Função3: mostre na tela a execução da identificação dos tokens (lexemas) e tipos de tokens. Exemplo: ENTRADA: x = k + n * 2;
 */
package exercicio4;

import java.util.ArrayList;

public class Token{
	
    public void lexema(String texto) {
        String texto_final = "";
        ArrayList linhas = new ArrayList();
        ArrayList letras = new ArrayList();
        int contadorId = 0;
        int contop = 0;
        char e, i, o;
        int controletter = 0;
        linhas.add("Lexema" + "  |   Tokens");
        linhas.add("        |                      ");
        for (int x = 0; x < texto.length(); x++) {
            //char c : texto.toCharArray()
            char c = texto.charAt(x);
            //Identifica o que é numero
            if (Character.isDigit(c)) {
                String num = "";
                int y = x;
                while (Character.isDigit(texto.charAt(y))) {
                    num = num + texto.charAt(y);
                    x++;
                    y++;
                }
                x--;
                contop++;
                linhas.add(num + "\t|   Número");
                linhas.add("        |                      ");
            } else if (Character.isLetter(c)) {   //Identifica o que é letra
                String letter = "";
                int z = x;
                while (Character.isLetter(texto.charAt(z))) {
                    letter = letter + texto.charAt(z);
                    z++;
                    x++;
                }
                if (letras.contains(letter)) {
                    //do nothing
                } else {
                    letras.add(letter);
                }   
                x--;
                contop++;
                for (int r = 0; r < letras.size(); r++) {
                    if (letter.equals(letras.get(r))) {
                        linhas.add(letter + "\t|   Indentificador " + r);
                        linhas.add("        |                      ");
                        controletter = 1;
                        break;
                    }
                }
                if (controletter == 0) {
                    linhas.add(letter + "\t|   Indentificador " + contadorId);
                    linhas.add("        |                      ");
                }
            } else if (c == '*' || c == '+' || c == '-' || c == '/') {  //Identifica operadores
                if (c == '*') {
                    linhas.add(c + "\t|   Operador aritmético MULT");
                    linhas.add("        |                      ");
                } else if (c == '+') {
                    linhas.add(c + "\t|   Operador aritmético ADD");
                    linhas.add("        |                      ");
                } else if (c == '-') {
                    linhas.add(c + "\t|   Operador aritmético SUB");
                    linhas.add("        |                      ");
                } else if (c == '/') {
                    linhas.add(c + "\t|   Operador aritmético DIV");
                    linhas.add("        |                      ");
                }
            } else if (c == '=') {
                linhas.add(c + "\t|   Operador de atribuição");
                linhas.add("        |                      ");
            } else if (c == ';') {
                linhas.add(c + "\t|   Delimitador");
                linhas.add("        |                      ");
            }

            if (contop > 4) {
                System.out.println("Quantidade de operandos inválida!");
                break;
            }
        }
        if (contop <= 4) {
            for (int u = 0; u < linhas.size(); u++) {
                System.out.println(linhas.get(u));
            }
        }
    }
}

