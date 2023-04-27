package view;

import java.util.Scanner;

import controller.Recursiva01;

public class Principal {
	public static void main(String[] args) {
		
		new Recursiva01();
		
            try (Scanner leia = new Scanner(System.in)) {
				int n;
				System.out.println("digite um número: ");
				n =leia.nextInt();
				int resultado = Recursiva01.somatorioNaturais(n);
				System.out.println("O somatório dos " + n + " primeiros números naturais é " + resultado);
			}
		}
	  }


