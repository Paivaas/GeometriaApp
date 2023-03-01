package br.senai.sp;

import br.senai.sp.model.triangulo;

public class GeometriaApp {

	public static void main(String[] args) {
	
		System.out.println("Criando Triângulos...");
		//Criando dois triângulos
		triangulo t1 = new triangulo();
		triangulo t2 = new triangulo();
		
		//Definindo as propriedades do triângulos
		t1.altura = 20;
		t1.ladoB = 10;
		t1.ladoC = 9;
		t1.base = 11;
		t1.nome = "triângulo001";
		
		t2.altura = 12;
		t2.ladoB = 5;
		t2.ladoC = 9;
		t2.base = 10;
		t2.nome = "triângulo002";
				
				//Exibir dados dos triangulos
		t1.exibirDados();
		t2.exibirDados();

						
	}

}
