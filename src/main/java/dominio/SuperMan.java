package dominio;

public class SuperMan extends Kriptoniano implements ObjetoVolador {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SuperMan(String nombre) {
		super(nombre);

	}

	@Override
	public String comer() {
		return super.comer()+" Tengo dieta de Super Heroe";
	}
	public String saltarEdificio() {
		return " Voy saltando edificios";
	}
	public String detenerBalas() {
		return " Soy a prueba de balas";
	}

	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return ObjetoVolador.super.despegar() + " a lo Super Man";
	}

	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return ObjetoVolador.super.aterrizar() + " a lo Super Man";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return ObjetoVolador.super.volar() + " a lo Super Man";
	}


	
	
	

}
