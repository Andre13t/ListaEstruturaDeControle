package exercicios;

import java.util.Scanner;

public class Exer19 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int delta = 0;
		System.out.println("informe o valor de a: ");
		int a = entrada.nextInt();
		System.out.println("informe o valor de b: ");
		int b = entrada.nextInt();
		System.out.println("infome o valor de c: ");
		int c = entrada.nextInt();

		if (a == 0) {
			System.out.println("nao � uma equa�ao do segundo grau");
		} else {
			delta = ((b * b) - 4 * (a * c));
		}
		if (delta < 0) {
			System.out.println("a equa��o n�o possui raizes reais");
		}
		if (delta == 0) {
			System.out.println("a unica raiz existente �: " + (((-b) + Math.sqrt(delta)) / (2 * a)));
		}
		if (delta > 0) {
			double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
			System.out.println("raiz 1 = " + x1 + "\n" + "raiz 2 = " + x2);
		}
		entrada.close();
	}

}
