package exercicios;

import java.util.Scanner;

public class Exer26 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("informe um n�mero: ");
		int n = entrada.nextInt();

		if (n % 2 == 0) {
			System.out.println("o numero � par");
		} else {
			System.out.println("o numero � impar");
		}
		entrada.close();
	}
}
