package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;

		do {
			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = ler.nextInt();

				System.out.println("Digite o Dividendo: ");
				divisor = ler.nextInt();

				divide(dividendo, divisor);
			} catch (InputMismatchException e) {
				System.err.println("\nExceção" + e);
				ler.nextLine();
				System.out.println("\nDigite valores inteiros! ");

			} catch (ArithmeticException e) {
				System.err.println("\nExceção" + e);
				ler.nextLine();
				System.out.println("\nDivisão invalida! ");
			}

		} while (loop);
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
