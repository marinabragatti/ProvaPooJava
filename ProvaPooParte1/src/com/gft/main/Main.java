package com.gft.main;

import java.util.ArrayList;
import java.util.List;

import com.gft.model.Pessoa;


public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("João", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("Jessica", 18);
		
		List <Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		
		int maiorIdade = p1.getIdade();
		String nome = p1.getNome();
		
		for(Pessoa index : pessoas)
		{
			if(index.getIdade() > maiorIdade) {
				maiorIdade = index.getIdade();
				nome = index.getNome();
			}
		}
		
		System.out.println("-------------------------Questão 1-------------------------");
		System.out.println("A pessoa mais velha é " + nome + " com " + maiorIdade + " anos.");
		
		System.out.println("\n-------------------------Questão 2-------------------------");
		System.out.println("Lista Antes:");
		
		for(Pessoa index : pessoas)
		{
			System.out.println("Nome: " + index.getNome() + " - Idade: " + index.getIdade());
		}
		
		pessoas.removeIf(x -> x.getIdade() < 18);
		
		System.out.println("\nLista Depois:");
		for(Pessoa index : pessoas)
		{
			System.out.println("Nome: " + index.getNome() + " - Idade: " + index.getIdade());
		}

		System.out.println("\n-------------------------Questão 3-------------------------");
		for(Pessoa index : pessoas)
		{
			if(index.getNome() == "Jessica") {
				System.out.println("Existe uma pessoa chamada " + index.getNome() + " na lista e sua idade é de " + index.getIdade() + " anos." );
			}
		}
	}

}
