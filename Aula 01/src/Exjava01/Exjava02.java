package Exjava01;

import java.util.Scanner;

public class Exjava02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int anos, meses, totaldedias, resto, resto2;
		
		System.out.println("Digite sua idade em dias: ");
		totaldedias = entrada.nextInt();
		
		anos = totaldedias / 365;
		resto = totaldedias % 365;
		meses = resto / 30;
		resto2 = resto % 30;
		
		System.out.println("Você tem: " +  anos + " anos, " + meses + " meses e " + resto2 + " dias.");
		
		entrada.close();

	}

}