package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// INSTANCIAÇÃO

		// Criando os objetos e método adicionarSaldo
		Passageiro passageiro1 = new Passageiro("Ana Silva", "111.111.111-11");
		System.out.println("Recarga do passageiro " + passageiro1.nome + ".");
		passageiro1.adicionarSaldo(100.0);
				
		Passageiro passageiro2 = new Passageiro("Carlos Souza", "111.111.111-12");
		System.out.println("Recarga do passageiro " + passageiro2.nome + ".");
		passageiro2.adicionarSaldo(50.0);
		
		// Printando dados dos passageiros
		System.out.println("- - - Sistema FiapRide - - -");
		System.out.println("Passageiro: " + passageiro1.nome + " | CPF: " + passageiro1.cpf + " | Saldo: R$" + passageiro1.saldo + " |");
		System.out.println("Passageiro : " + passageiro2.nome + " | CPF: " + passageiro2.cpf + " | Saldo: R$" + passageiro2.saldo + " |");
		System.out.println();

		// Método de pagarViagem
		System.out.println("Pagando viagem do passageiro " + passageiro1.nome + "...");
		passageiro1.pagarViagem(20);
		
		System.out.println("Pagando viagem do passageiro " + passageiro2.nome + "...");
		passageiro2.pagarViagem(20);
		
		// Printando dados dos passageiros atualizados pós pagamento de viagem 
		System.out.println("- - - Sistema FiapRide - - -");
		System.out.println("Passageiro: " + passageiro1.nome + " | CPF: " + passageiro1.cpf + " | Saldo: R$" + passageiro1.saldo + " |");
		System.out.println("Passageiro : " + passageiro2.nome + " | CPF: " + passageiro2.cpf + " | Saldo: R$" + passageiro2.saldo + " |");
		System.out.println();
		
	}

}
