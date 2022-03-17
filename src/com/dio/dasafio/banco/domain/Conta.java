package com.dio.dasafio.banco.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Conta {
	
	private static final int AGENCIA_PADRAO = 1;	
	private static int SEQUENCIAL = 1;
	
	private int agencia;
	private int numero;
	private double saldo;		
	private Cliente cliente;	
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;		
		this.cliente = cliente;
	}	
	
	public void sacar(double valor) {		
		saldo -= valor;
	}
	
	public void depositar(double valor) {		
		saldo += valor;
	}
	
	public boolean realizarTransferencia(double valor, Conta contaDestino) {	
		if((saldo-valor) >= 0) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			return true;
		}	
		System.out.println("Saldo insuficiente para transferir da Conta Corrente número " + this.numero +" para Conta Poupança.");
		System.out.println(" ");
		return false;
	}		
	
	public void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}
	
	
}
