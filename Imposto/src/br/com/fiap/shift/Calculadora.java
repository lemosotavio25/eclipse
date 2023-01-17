package br.com.fiap.shift;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		double salario = sc.nextFloat();
		double imposto = 0;
		double renda;
		
		if (salario < 1903.98) {
			imposto = 0;
			}
		else if (salario > 1903.98 & salario < 2826.65) {
			imposto = salario*0.075 - 142.80;
			}
		else if (salario > 2826.66 & salario < 3751.05) {
			imposto = salario*0.15 - 354.80;
		}
		else if (salario > 3751.06 & salario < 4664.68) {
			imposto = salario*0.225 - 636.13;
		}
		else if (salario > 4664.68) {
			imposto = salario*0.275 - 869.36;
		}
		
		renda = salario - imposto;
		
		System.out.println("O imposto calculado foi de: " + Math.round(imposto));
		System.out.println("A renda líquida é: " + Math.round(renda));
	
	}

}
