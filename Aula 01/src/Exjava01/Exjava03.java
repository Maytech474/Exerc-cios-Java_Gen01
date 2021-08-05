package Exjava01;


	import java.util.Scanner;

	public class Exjava03 {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			int horas, minutos, segundos, resto1, resto2;
			
			System.out.println("Digite a duração do evento em segundos: ");
			segundos = entrada.nextInt();
			
			horas = segundos / 3600;
			resto1 = segundos % 3600;
	    	minutos = resto1 / 60;
	    	resto2 = resto1 % 60;
	      	
	    	System.out.println("A duração do evento foi de " + horas + " horas, " + minutos + " minutos e " + resto2 + " segundos.");
			
			entrada.close();

		}

	}
	