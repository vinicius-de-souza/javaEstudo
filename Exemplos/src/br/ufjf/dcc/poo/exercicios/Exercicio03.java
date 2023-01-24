package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float a, b, c, delta;
		double x1, x2;
		
		System.out.println("Informe o valor a: ");
		a = teclado.nextInt();
		System.out.println("Informe o valor b: ");
		b =  teclado.nextInt();
		System.out.println("Informe o valor c: ");
		c =  teclado.nextInt();
		
		delta = (b * b) + (-4 * (a * c)); 
		
		x1 = (-b + Math.sqrt(delta)) / 2*a;
		x2 = (-b - Math.sqrt(delta)) / 2*a;
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		
		teclado.close();
		
	}

}
