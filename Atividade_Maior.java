package Tratamento_de_exessão;

import java.util.Scanner;

public class Atividade_Maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		double v1=0,v2=0,v3=0;
		try {
			System.out.print("Informe o valor 1:");
			v1= ler.nextDouble();

			System.out.print("Digite o valor 2:");
			v2= ler.nextDouble();

			System.out.print("Informe o valor 3:");
			v3=ler.nextDouble();

			if (v1 ==v2 && v1 ==v3)
				System.out.print("Todos são iguais");
			else if (v1> v2 && v1>v3)
				System.out.print("O valor 1 é maior"+v1);
			else if (v2>v3)
				System.out.print("O valor 2 é maior"+v2);
			else
				System.out.print("O valor 3 é maior"+v3);
			ler.close();
		}
		catch (Exception Erro) {
			System.out.print("Erro!");

		}
	}

}
