package vehiculos;

public class Camioneta extends Vehiculo{
	
	private Boolean volco;
	
	public Camioneta(String placa,int puertas, String nombre, int precio, int peso, Fabricante fabricante, Boolean volco) {
		super( placa,  puertas,  90,  nombre,  precio,  peso,  "4X4",  fabricante);
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
