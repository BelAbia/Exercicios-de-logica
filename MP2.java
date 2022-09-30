package exercicios;

import java.util.Scanner;

public class MP2 {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a nota 1: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		double nota3 = entrada.nextDouble();
		
		double A = 2;
		double B = 3;
		double C = 5;
		
		double mp = ((nota1 * A) + (nota2 * B) + (nota3 * C)) / ( A + B + C);
		
		System.out.printf("A media é : %.1f", mp);
		
		entrada.close();
		
	}

}
