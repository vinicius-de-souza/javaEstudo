package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v1, v2, v3;
		float media;
		System.out.println("Informe o valor 1: ");
		v1 = teclado.nextInt();
		System.out.println("Informe o valor 2: ");
		v2 =  teclado.nextInt();
		System.out.println("Informe o valor 3: ");
		v3 =  teclado.nextInt();
		media = (v1+v2+v3)/3;
		System.out.println("Media: " + media);
		teclado.close();
	}
}
