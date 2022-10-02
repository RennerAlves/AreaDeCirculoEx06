package ListaDeExercícios;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 
 * @author Renner Este é um programa que recebe um valor de raio inserido pelo
 *         usuário e imprime na tela o valor da área de um círculo com o valor
 *         do raio informado.
 */
public class CalculadorDeAreaDeCirculoExercicio06 {

	public static void main(String[] args) {

		float raio = 0.0f;
		float operacao = 0.0f;
		int numeroCorreto = 0;

		System.out.println("Insira o valor do raio do círculo: ");

		while (numeroCorreto != 1) {
			Scanner scanner = new Scanner(System.in);
			try {

				raio = scanner.nextFloat();
				numeroCorreto++;

			} catch (InputMismatchException ex) {
				System.out.println();
				System.out.println("Erro! Insira um valor válido: ");
				System.out.println("Obs: Se o número possuir casas decimais,"
						+ " faça a separação com vírgula.");
			}

		}
		
		System.out.println();

		operacao = (float) (Math.PI * raio * raio);

		System.out.println("O valor da área desse círculo é: ");
		System.out.println(operacao);

	}
}
