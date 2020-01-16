package com.gft.main;

import com.gft.model.Gerente;
import com.gft.model.Supervisor;
import com.gft.model.Vendedor;

public class Main {

	public static void main(String[] args) {

		Gerente pessoa1 = new Gerente("Clóvis", 45, 10000);
		Supervisor pessoa2 = new Supervisor("Arnaldo", 35, 8000);
		Vendedor pessoa3 = new Vendedor("Lucia", 30, 5000);
		
		System.out.printf("Nome: %s - Idade: %d - Salário + Bonificação: R$ %.2f", pessoa1.getNome(), pessoa1.getIdade(), pessoa1.bonificacao());
		System.out.printf("\nNome: %s - Idade: %d - Salário + Bonificação: R$ %.2f", pessoa2.getNome(), pessoa2.getIdade(), pessoa2.bonificacao());
		System.out.printf("\nNome: %s - Idade: %d - Salário + Bonificação: R$ %.2f", pessoa3.getNome(), pessoa3.getIdade(), pessoa3.bonificacao());
	}

}
