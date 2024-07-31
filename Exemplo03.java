package Tratamento_de_exessão;

import java.util.ArrayList;

public class Exemplo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> nomes = new ArrayList<>();

try {
	nomes.add("Alice");
	nomes.add("Bob");
	nomes.add("Charlie");
	System.out.println("Nome:"+ nomes.get(2));
}
	catch (Exception erro) {
		System.out.println("INVÁLIDO! Digite novamente.");
		
	}
}
	}

