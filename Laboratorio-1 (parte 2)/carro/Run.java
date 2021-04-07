package carro;

import Maquinaria.IMaquinaria;
import moto.Ducati;
import moto.Moto;
import moto.Ninja;

public class Run {

	public static void main(String[] args) {
		new Carretera(createCarFactory(CarType.SEDAN)).runMaquinaria(); 
		new Carretera(createCarFactory(CarType.PICKUP)).runMaquinaria();
		new Carretera(createMotoFactory(MotoType.NINJA)).runMaquinaria();
		new Carretera(createMotoFactory(MotoType.DUCATI)).runMaquinaria();
		//agregar ducat
	}
	
	
	private enum CarType {
		SEDAN,
		PICKUP
	}
	private enum MotoType {
		NINJA,
		DUCATI
	}
	
	private static Carro createCarFactory(CarType type) {
	  if (type.equals(CarType.SEDAN)) {
		  return new Sedan();
	  }
	  return new Pickup(); 
	}
	
	private static Moto createMotoFactory(MotoType type) {
		  if (type.equals(MotoType.NINJA)) {
			  return new Ninja();
		  }
	   return new Ducati(); 
	}
	
}
