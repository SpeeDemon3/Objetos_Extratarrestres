package ejerciciosClases.actividadTema7;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Paquete implements OcupaEspacio{
	// Atributos de la clase
	private int espacio = 3;
	private String descripcion = "bulto";

	// Constructor vacio
	public Paquete() {}
	
	// Constructor con todos los atributos
	public Paquete(int espacio, String descripcion) {
		this.espacio = espacio;
		this.descripcion = descripcion;
	}
	
	// Setters y Getters
	public int getEspacio() {
		return espacio;
	}
	
	public void setEspacio(int espacio) {
		this.espacio = espacio;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * Metodo que implementa el metodo que hereda de la interface OcupadoEspacio
	 */
	@Override
	public int obtenerEspacio() {
		return this.espacio;
	}
	
	public String toString() {
		return "El paquete " + descripcion + " ocupa "  + espacio + ".";
	}
	
}
