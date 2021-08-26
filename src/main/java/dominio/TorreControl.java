package dominio;

public class TorreControl {
	
	public void permisoDespegue(Avion[] aviones) {
		System.out.println("Próximas salidas");
		for(Avion avion:aviones) {
			System.out.println("Avion: "+avion.getModelo()+" "+avion.despegar());
			
		}
	}
	
	public void permisoAterrizaje(Avion[] aviones) {
		System.out.println("Próximas llegadas");
		for(Avion avion:aviones) {
			System.out.println("Avion: "+avion.getModelo()+" "+avion.despegar());
			
		}
	}

}
