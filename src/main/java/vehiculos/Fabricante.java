package vehiculos;

import java.util.HashMap;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String xd) {
		this.nombre = xd;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais xd) {
		this.pais = xd;
	}
	
	public static Fabricante fabricaMayorVentas() {
		
		HashMap<Fabricante, Integer> mapa = new HashMap<>();
		
		for (int x = 0; x < Vehiculo.fabricantes.size(); x++) {
			Fabricante fabricante = Vehiculo.fabricantes.get(x);
			if (mapa.containsKey(fabricante)) {
				mapa.put(fabricante, mapa.get(fabricante) + 1);
			} else {
				mapa.put(fabricante, 1);
			}
		}
		Fabricante moda = null;
		int mayor = 0;
		for (HashMap.Entry<Fabricante, Integer> entry : mapa.entrySet()) {
			if (entry.getValue() > mayor) {
				mayor = entry.getValue();
				moda = entry.getKey();
			}
		}
	
	
		return moda;
	}

}
