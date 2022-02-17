package com.firetech.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor inteiro: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		b = scan.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("Soma" + soma);
		System.out.println("Subtracao" + subtracao);
		System.out.println("Multiplicacao" + multiplicacao);
		System.out.println("Divisao" + divisao);
		
		
	}
	
	public static double soma(int a, int b) {
		return a + b;
	}
	
	public static double subtracao(int a, int b) {
		return a - b;
	}
	public static double multiplicacao(int a, int b) {
		return a * b;
	}
	
	public static double divisao(int a, int b) {
		return a / b;
	}
	
}
