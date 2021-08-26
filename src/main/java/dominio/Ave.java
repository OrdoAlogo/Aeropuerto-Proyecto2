package dominio;

import java.io.Serializable;

public class Ave extends Animal implements ObjetoVolador,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Ave(String nombre) {
		super(nombre);
		
	}
	public void  ponerHuevos() {
		System.out.println("Soy Oviparo"); 
	}
	public void  construirNido() {
		System.out.println("Construimos nidos");
	}

	@Override
	public String comer() {
		
		return super.comer() + " Dieta animal";
	}
	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return ObjetoVolador.super.despegar() + " A lo pájaro";
	}
	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return ObjetoVolador.super.aterrizar() + " A lo pájaro";
	}
	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return ObjetoVolador.super.volar() + " A lo pájaro";
	}
	
	
	
	

	
	

}
