package vehiculos;

public class Vehiculo {
	
	private String placa;
	private int puertas;
	private double velocidadMaxima;
	private String nombre;
	private int precio;
	private double peso;
	private String traccion;
	private Fabricante fabricante;
	
	protected static int cantidadVehiculos;
	protected static int cantidadCamionetas;
	protected static int cantidadCamiones;
	protected static int cantidadAutomoviles;
	
	
	public Vehiculo(String placa, int puertas, double velocidadMaxima, String nombre, int precio, double peso, String traccion, Fabricante fabricante) {
		
		this.placa = placa;
		this.puertas= puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre = nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		this.cantidadVehiculos=cantidadVehiculos;
		cantidadVehiculos++;
		
		
	}
	
	public String vehiculosPorTipo() {
		
		String cant = "Automoviles: " + this.cantidadAutomoviles+"\n" + 
				"Camionetas: "+this.cantidadCamionetas+"\n" + 
				"Camiones: "+this.cantidadCamiones;
		return(cant);
		
	}
	
	

	

	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String xd) {
		this.placa = xd;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public void setPuertas(int xd) {
		this.puertas = xd;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setVelocidadMaxima(double xd) {
		this.velocidadMaxima = xd;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String xd) {
		this.nombre = xd;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int xd) {
		this.precio = xd;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double xd) {
		this.peso = xd;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public void setTraccion(String xd) {
		this.traccion = xd;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(Fabricante xd) {
		this.fabricante = xd;
	}
	
		
	public static int getCantidadVehiculos() {
		return Vehiculo.cantidadVehiculos;
	}
	
	public static void setCantidadVehiculos(int xd) {
		Vehiculo.cantidadVehiculos = xd;
	
	}
	
	
}
