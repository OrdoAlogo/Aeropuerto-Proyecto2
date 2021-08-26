package dominio;

public class Avion extends Vehiculo implements ObjetoVolador  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String modelo;
	public Avion(String matricula, String modelo) {
		super(matricula);
		this.modelo = modelo;
		
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String despegar() {
		// TODO Auto-generated method stub
		return super.despegar() + " Tomando pista de despegue";
	}
	@Override
	public String aterrizar() {
		// TODO Auto-generated method stub
		return super.aterrizar()+ " Como avion";
	}
	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return super.volar()+ " Como avion";
	}
	
	
	
	
	

}
