package Exjava01;

import java.util.Scanner;

public class Exjava07 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double a, b, c, d, j, f, x, y;
		
		System.out.println("Escreva o valor de A: ");
		a = entrada.nextInt();
		
		System.out.println("Escreva o valor de B: ");
		b = entrada.nextInt();
		
		System.out.println("Escreva o valor de C: ");
		c = entrada.nextInt();
		
		System.out.println("Escreva o valor de D: ");
		d = entrada.nextInt();

		System.out.println("Escreva o valor de J: ");
		j = entrada.nextInt();
		
		System.out.println("Escreva o valor de F: ");
		f = entrada.nextInt();

		x = ((c*j) - (b*f)) / ((a*j) - (b*d));
		y = ((a*f) - (c*d)) / ((a*j) - (b*d));
		
		System.out.println("O valor de X é: " + x);
		System.out.println("O valor de Y é: " + y);
		
		entrada.close();

	}

}


	
	