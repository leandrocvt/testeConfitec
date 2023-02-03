package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor total: ");
		double total = sc.nextDouble();

		System.out.print("Informe a quantidade de parcelas: ");
		int parcela = sc.nextInt();
		
		if(parcela <= 5) {
			System.out.printf("Valor com desconto: %.2f", desconto(total, parcela));
		}else {
			System.out.println("Sem desconto!");
		}

	}

	public static double desconto(double valor, int parcela) {

		double desconto = 0.0;

		switch (parcela) {
		case 1:
			desconto = valor * 0.10;
			return valor - desconto;
		case 2: 
			desconto = valor * 0.08;
			return valor - desconto;
		case 3:
			desconto = valor * 0.06;
			return valor - desconto;
		case 4:
			desconto = valor * 0.04;
			return valor - desconto;
		case 5:
			desconto = valor * 0.02;
			return valor - desconto;
			
		default:
			return valor;
		}
		
	}

}
