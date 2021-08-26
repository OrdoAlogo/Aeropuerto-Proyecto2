package dominio;

interface ObjetoVolador {
	
	public default String despegar() {
		return "Despegando";
		
	}
	
	public default String aterrizar() {
		return "Aterrizando";
	}
	
	public default String volar() {
		return "Volando";
	}

}
