package main;

import java.util.Locale;
import java.util.Scanner;
import Entities.People;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		 String[] nomes = new String[n];
		People[] vect = new People[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();

			System.out.println("Digite o nome: ");
			String name = sc.next();
			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.println("Digite a altura: ");
			double altura = sc.nextDouble();
			vect[i] = new People(name, idade, altura);
		}

		double soma = 0; // calcular a media de altura
		for (int i = 0; i < n; i++) {
			soma += vect[i].getAltura();
		}
		double media = soma / n;
		System.out.printf("A media de altura é: %.2f%n", media);

		double menorIdade = 0; // calcular a porcentagem de pessoas com menos de 16 anos
		//String nomes = "";
		for (int i = 0; i < n; i++) {

			if (vect[i].getIdade() < 16) {
				menorIdade++;
				//nomes += vect[i].getName();
				System.out.printf("%s\n", vect[i].getName());

			}
		}

		double porcentagem = (menorIdade / n) * 100;
		System.out.println("Porcentagem de pessoas com menos de 16 anos: " + porcentagem + "%");
		//System.out.println("Nome das pessoas que tem menos de 16:"+ nomes);

		sc.close();

	}

}
