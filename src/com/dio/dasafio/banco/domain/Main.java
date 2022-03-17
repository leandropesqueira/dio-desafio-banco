package com.dio.dasafio.banco.domain;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente();
		Cliente cli2 = new Cliente();
		
		cli1.setNome("Cliente1");
		cli2.setNome("Cliente2");
		
		Conta cc1 = new ContaCorrente(cli1);
		Conta cp1 = new ContaPoupanca(cli1);	
		Conta cc2 = new ContaCorrente(cli2);
		Conta cp2 = new ContaPoupanca(cli2);
				
		cc1.depositar(1000);		
		cc1.realizarTransferencia(100, cp1);
		
		cc2.depositar(3000);		
		cc2.realizarTransferencia(10000, cp2);
		
		Banco banco = new Banco();		
		banco.setContas(Arrays.asList(cc1,cp1,cc2,cp2));		
		
		cc1.imprimirExtrato();	
		cp1.imprimirExtrato();		
		System.out.println("");
		cc2.imprimirExtrato();	
		cp2.imprimirExtrato();	
		
		System.out.println("");
		System.out.println(" *** Lista de Clientes do Banco ***");			
		banco.imprimirClientes();
		
	}		

}
