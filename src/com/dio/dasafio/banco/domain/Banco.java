package com.dio.dasafio.banco.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco{
	
	private String nome;
	private List<Conta> contas;		
	
	public void imprimirClientes() {		
		for(Conta c : contas) {
			System.out.println("Titular: " + c.getCliente().getNome() + " - Conta Número: " + c.getNumero());
		}				
	}	
	
}
