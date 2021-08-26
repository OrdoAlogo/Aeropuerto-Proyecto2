package dominio;

import java.io.Serializable;

public class Vehiculo implements Serializable,ObjetoVolador{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String matricula;

	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	

}
