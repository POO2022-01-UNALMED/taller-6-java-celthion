package vehiculos;

public class Camioneta extends Vehiculo{
	
	private Boolean volco;
	
	public Camioneta(String placa,int puertas, String nombre, double precio, double peso, Fabricante fabricante, int cantidadVehiculos, Boolean volco) {
		super( placa,  puertas,  90,  nombre,  precio,  peso,  "4X4",  fabricante,  cantidadVehiculos);
	    this.volco=volco;
	    cantidadCamionetas++;
	
	}
	
	public Boolean isVolco() {
		return volco;
	}
	
	public void setVolco(Boolean xd) {
		this.volco = xd;
	}
	


}
