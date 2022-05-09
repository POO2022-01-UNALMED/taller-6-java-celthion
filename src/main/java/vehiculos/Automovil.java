package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos;
	
	
	public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante, int cantidadVehiculos, int puestos) {
		super( placa,  4,  100,  nombre,  precio,  peso,  "FWD",  fabricante,  cantidadVehiculos);
	    this.puestos=puestos;
	    cantidadAutomoviles++;
	
	}
	
	public int getPuestos() {
		return puestos;
	}
	
	public void setPuestos(int xd) {
		this.puestos = xd;
	}
	

}
