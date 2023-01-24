package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float tLargura, tComprimento, cComprimento, cLargura, tArea, cArea, livre;
		
		System.out.println("Informe a largura do terreno: ");
		tLargura = teclado.nextFloat();
		System.out.println("Informe o comprimento do terreno: ");
		tComprimento = teclado.nextFloat();
		tArea = tLargura * tComprimento;
		
		System.out.println("Informe a largura da casa: ");
		cLargura = teclado.nextFloat();
		System.out.println("Informe o comprimento da casa: ");
		cComprimento = teclado.nextFloat();
		cArea = cLargura * cComprimento;
		
		livre = (tArea - cArea)/tArea * 100;
		
		System.out.println("Porcentagem de area livre: " + livre + "%");
		
		teclado.close();
	}	

}
