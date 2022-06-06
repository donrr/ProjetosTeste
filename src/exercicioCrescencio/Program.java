package exercicioCrescencio;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		Exception ExcecaoAcimaDeCem = new Exception();
		
		double media=0;
		double soma=0;
		
		System.out.println("Quantos número você deseja adicionar? ");
		int tamanhoDoArray = read.nextInt();
		
		
		
		try{
			int list [] = new int [tamanhoDoArray];
			
			System.out.println("Adicione os números");
			for (int i=0; i< tamanhoDoArray; i++) {
				list [i] = read.nextInt();
				soma += list[i];
				if (soma > 100) {
					throw ExcecaoAcimaDeCem;
				}
			}
			
			media = soma / tamanhoDoArray;
			System.out.println("A média é: " + media);
		}
		
		catch (Exception e) {
			System.out.println("A soma é maior que 100");
		}

	}

}
