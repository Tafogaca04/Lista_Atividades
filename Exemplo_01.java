package Tratamento_de_exessão;
import java.util.Scanner;

public class Exemplo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
	int a,b,c;

		a=10;
		System.out.println("Digite um número:");
		
		b= ler.nextInt();
		try {
			c = a/b;
			System.out.println("Valor de C:"+c);
		}
		catch (Exception erro) {
			System.out.println("Não existe divisão por zero");
		}
	}

}
