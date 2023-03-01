package br.senai.sp.model;

public class triangulo {
	
	public double base;
	public double ladoB;
	public double ladoC;
	public double altura;
	public String nome;

	public void exibirDados() {	
	    System.out.println("----------------------------");
		System.out.println(nome);
		System.out.println("----------------------------");
		System.out.println("altura: " + altura);
		System.out.println("ladoB: " + ladoB);
		System.out.println("ladoC: " + ladoC);
		System.out.println("base: " + base);
		
	}
}
