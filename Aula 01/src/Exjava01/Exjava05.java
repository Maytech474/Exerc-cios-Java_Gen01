package Exjava01;

import java.util.Scanner;

public class Exjava05 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, nota3, mediafinal;
		
		System.out.println("Digite a nota1: ");
		nota1 = entrada.nextInt();
		
		System.out.println("Digite a nota2: ");
		nota2 = entrada.nextInt();
		
		System.out.println("Digite a nota3: ");
		nota3 = entrada.nextInt();
		
		mediafinal = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;
		
		System.out.println("A média final é: " + mediafinal);
		
		entrada.close();

	}

}