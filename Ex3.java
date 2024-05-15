package estruturaPosCondicionada;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		String nome;
		int num = 1;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu Nome: ");
		nome = ler.nextLine();
		
		while (num <= 10) {
			num++;
			System.out.println(nome);
		}
		
		

	}

}
