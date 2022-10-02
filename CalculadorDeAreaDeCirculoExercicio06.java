package ListaDeExerc�cios;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 
 * @author Renner Este � um programa que recebe um valor de raio inserido pelo
 *         usu�rio e imprime na tela o valor da �rea de um c�rculo com o valor
 *         do raio informado.
 */
public class CalculadorDeAreaDeCirculoExercicio06 {

	public static void main(String[] args) {

		float raio = 0.0f;
		float operacao = 0.0f;
		int numeroCorreto = 0;

		System.out.println("Insira o valor do raio do c�rculo: ");

		while (numeroCorreto != 1) {
			Scanner scanner = new Scanner(System.in);
			try {

				raio = scanner.nextFloat();
				numeroCorreto++;

			} catch (InputMismatchException ex) {
				System.out.println();
				System.out.println("Erro! Insira um valor v�lido: ");
				System.out.println("Obs: Se o n�mero possuir casas decimais,"
						+ " fa�a a separa��o com v�rgula.");
			}

		}
		
		System.out.println();

		operacao = (float) (Math.PI * raio * raio);

		System.out.println("O valor da �rea desse c�rculo �: ");
		System.out.println(operacao);

	}
}
