package vehiculos;

import java.util.HashMap;

public class Pais {
	
	private String nombre;
	
	public Pais(String nombre) {
		
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String xd) {
		this.nombre = xd;
	}
	
	public static Pais paisMasVendedor() {
		
		
		
		HashMap<Pais, Integer> mapa = new HashMap<>();
		
		for (int x = 0; x < Vehiculo.paises.size(); x++) {
			Pais paises = Vehiculo.paises.get(x);
			if (mapa.containsKey(paises)) {
				mapa.put(paises, mapa.get(paises) + 1);
			} else {
				mapa.put(paises, 1);
			}
		}
		Pais moda = null;
		int mayor = 0;
		for (HashMap.Entry<Pais, Integer> entry : mapa.entrySet()) {
			if (entry.getValue() > mayor) {
				mayor = entry.getValue();
				moda = entry.getKey();
			}
		}
		
		return moda;
	}
	

}
