package exercicios;

import java.util.Scanner;

public class Exer20 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int ano = 0;
		System.out.println("Informe um ano para ver se ele � bissexto: ");
		ano = entrada.nextInt();
		
		if (ano % 400 == 0) {
			System.out.println("O ano � bissexto");
		} else if ((ano % 100 != 0) && (ano % 4 == 0)) {
			System.out.println("O ano � bissexto");
		} else {
			System.out.println("N�o � bissexto");
		}
		entrada.close();
	}
}
