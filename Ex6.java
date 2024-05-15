package estruturaPosCondicionada;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		String nome;
		
		int numero, i = 1;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu nome Completo: ");
		nome = ler.nextLine();
		
		System.out.println("Digite o número de vezes que você quer que o seu nome apareça: ");
		numero = ler.nextInt();
		
		while (i <= numero) {
			System.out.println(nome);
			i++;
		}
        ler.close();
	}

}
