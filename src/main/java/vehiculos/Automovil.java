package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos;
	
	
	public Automovil(String placa, String nombre, int precio, double peso, Fabricante fabricante,int puestos) {
		super( placa,  4,  100,  nombre,  precio,  peso,  "FWD",  fabricante);
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
