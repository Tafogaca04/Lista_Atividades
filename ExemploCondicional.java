package Tratamento_de_exessão;

import java.util.Scanner;

public class ExemploCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		double x;
		try {
		System.out.print("Digite uma nota:");
		x=ler.nextDouble();
		if (x>=6)
			System.out.println("Você está aprovado");

		else if (x<6 && x>=4)
			System.out.println("Reprovado");

		else
			System.out.println("Aprovado");
		ler.close();
		}
		catch(Exception erro) {
		System.out.println("INCORRETO! Digite outro valor.");
	}
	}
}
