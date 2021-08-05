
/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/



package Exjava01;

import java.util.Scanner;

public class Exjava01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int anos, meses, dias, tda, tdm, totaldedias;
		
		System.out.println("Digite sua idade: ");
		anos = entrada.nextInt();
		
		System.out.println("Digite quantos mases: ");
		meses = entrada.nextInt();
		
		System.out.println("Digite quantos dias: ");
		dias = entrada.nextInt();
		
		tda = anos * 365;
		
		tdm = meses * 30;
		
		totaldedias = tda + tdm + dias;
		
		System.out.println("Sua idade em dias é: " + totaldedias);
		
		entrada.close();


	}
	
}
