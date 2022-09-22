package exercicios;

import java.util.Scanner;

public class SalarioCBonus {

	public static void main(String[] args) {
		
/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
 *  Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
 *  informar o total a receber no final do mês, com duas casas decimais. */

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual o nome o nome do vendedor?");
		String nome = entrada.next();
		
		System.out.println("Qual o salario fixo?");
		double salario = entrada.nextDouble();
		
		System.out.println("Qual o total de vendas no mes? (em dinheiro) ");
		 double vendas = entrada.nextDouble();
		
		double bonus = vendas * 0.15;
		
		System.out.printf("O valor que " + nome + " tem a receber no final do mes eh $%.2f", (bonus + salario));
		
		entrada.close();
	}

}
