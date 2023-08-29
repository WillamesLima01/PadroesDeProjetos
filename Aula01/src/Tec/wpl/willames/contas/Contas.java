package Tec.wpl.willames.contas;

import java.util.Random;

public class Contas {

	private String nome;
	private int numero;
	private double saldo;
	private double limite;
	
	public Contas(String nome, int numero, double saldo, double limite) {
		this.nome=nome;
		this.numero=numero;
		this.saldo=saldo;
		this.limite=limite;
	}
	
		
	

	public Contas(String nome) {
		super();
		this.nome = nome;
		this.numero = 1212;
		this.saldo = 2000;
		this.limite = 5000;
	}




	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Contas [nome=" + nome + ", numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + "]";
	}
	
	
}
