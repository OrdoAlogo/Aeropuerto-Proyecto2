package com.curso.Aeropuerto_Proyecto;

import dominio.Animal;
import dominio.Ave;
import dominio.Avion;
import dominio.Kriptoniano;
import dominio.SuperMan;
import dominio.TorreControl;
import dominio.Vehiculo;

public class Application
{
	public static void main( String[] args )
	{
		Animal sp = new SuperMan("Super Man");
		System.out.println(sp.comer());
		Animal ave = new Ave("Avestruz");
		Ave ave2 = new Ave("Cigueña");
		System.out.println(ave2.aterrizar());
		System.out.println(ave.getNombre());
		
		Avion [] aviones = new Avion[3];
		aviones[0] =  new Avion("0045","Boing570");
		aviones[1] = new Avion("A777","Boing777");
		aviones[2] = new Avion("0604","AirForceOne");
		 
		 TorreControl t = new TorreControl();
		 t.permisoAterrizaje(aviones);
		 
		
	}
}