package ejerciciosClases.actividadTema7;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 * 
 * Clase que contiene los atributos comunes de un extratarrestre
 *
 */
public abstract class Extratarrestre {

	// Atributos comunes
	private String nombre;
	private String colorPiel;
	private String raza = "extraterrestre";
	private int espacioOcupado = 1;
	
	// Constructor vacio
	public Extratarrestre() {}
	
	// Constructor con los atributos nombre y colorPiel
	public Extratarrestre(String nombre, String colorPiel) {
		this.nombre = nombre;
		this.colorPiel = colorPiel;
	}
	
	// Constructor con todos los atributos de la clase
	public Extratarrestre(String nombre, String colorPiel, String raza, int espacioOcupado) {
		this.nombre = nombre;
		this.colorPiel = colorPiel;
		this.raza = raza;
		this.espacioOcupado = espacioOcupado;
	}
	
	// Setters y getters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public int getEspacioOcupado() {
		return espacioOcupado;
	}
	
	public void setEspacioOcupado(int espacioOcupado) {
		this.espacioOcupado = espacioOcupado;
	}
	
	/**
	 * Metodo para estresar que tendran que implementar las subclases
	 */
	public abstract void estresar();
	
	
}
