package Tec.wpl.willames.App;

import Tec.wpl.willames.contas.Contas;

public class App {
	public static void main(String[] args) {
		
		Contas contas = new Contas("willames", 1234, 1000, 2000);
		
		Contas contas2 = new Contas("João");
		
		System.out.println(contas);
		System.out.println(contas2);
	}
	
}
