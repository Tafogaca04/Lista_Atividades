package Tratamento_de_exessão;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner ler = new Scanner (System.in);
		try{
		System.out.print("Informe o primeiro valor:");
		a = ler.nextInt();
		System.out.print("Informe o segundo valor:");
		b= ler.nextInt();
		
		System.out.println("Resultados");
		System.out.println("Soma:"+ (a+b));
		System.out.println("Subtração:"+(a-b));
		System.out.println("Multiplicação:"+(a*b));
		System.out.println("Divisão inteira:"+(a%b));
		System.out.println("Divisão exata:"+(double)a/b);
	}
		catch(Exception erro) {
			System.out.println("Informe um valor do tipo inteiro");
		}
		ler.close();
	}
}

