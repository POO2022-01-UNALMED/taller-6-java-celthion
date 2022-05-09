package vehiculos;

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

}
