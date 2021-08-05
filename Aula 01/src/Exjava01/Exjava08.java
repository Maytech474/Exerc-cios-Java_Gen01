package Exjava01;

import java.util.Scanner;

import java.lang.Math;

public class Exjava08 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		double p1, p2;
		double d, r;
		
		System.out.println("Digite o valor de X do primeiro ponto: ");
		x1 = entrada.nextInt();
		
		System.out.println("Digite o valor de Y do primeiro ponto: ");
		y1 = entrada.nextInt();

		System.out.println("Digite o valor de X do segundo ponto: ");
		x2 = entrada.nextInt();
		
		System.out.println("Digite o valor de Y do segundo ponto: ");
		y2 = entrada.nextInt();
		
		p1 = Math.pow((x2-x1), 2.0);
		p2 = Math.pow((y2-y1), 2.0);
		d = p1 + p2;
				
		r = Math.sqrt(d);

		System.out.println("A distância entre os pontos é: "  + Math.round(r));
		
		entrada.close();
						

	}

}
	


