package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;
	public Camion(String placa, String nombre, double precio, double peso, Fabricante fabricante, int cantidadVehiculos, int ejes) {
		super( placa,  2,  80,  nombre,  precio,  peso,  "4X2",  fabricante,  cantidadVehiculos);
	    this.ejes=ejes;
	
	}
	
	public int getEjes() {
		return ejes;
	}
	
	public void setEjes(int xd) {
		this.ejes = xd;
	}

}
