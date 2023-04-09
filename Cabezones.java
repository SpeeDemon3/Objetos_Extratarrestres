package ejerciciosClases.actividadTema7;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Cabezones extends Extratarrestre implements OcupaEspacio{
	
	// Variables finales constantes que no podran ser modificadas una vez inicializadas
	public static final String NOMBRE_RAZA = "Cabezones";
	public static final int ESPACIO_OCUPADO = 2;
	private String tercerOjo = "rojo";
	
	// Constructor vacio
	Cabezones(){}
	
	// Constructor 
	Cabezones(String nombre, String colorPiel, String tercerOjo) {
		super(nombre, colorPiel); // Atributos heredados de la clase padre
		setTercerOjo(tercerOjo); // Con el metodo tercerOjo() varifico el color del tercer ojo
	}
	
	// Constructor con todos sus atributos, estableciendo su raza y espacio con los valores finales
	Cabezones(String nombre, String colorPiel, String raza, int espacioOcupado, String tercerOjo) {
		super(nombre, colorPiel, NOMBRE_RAZA, ESPACIO_OCUPADO);
		setTercerOjo(tercerOjo);
	}
	
	// Setters y Getters
	public String getTercerOjo() {
		return tercerOjo;
	}
	
	public void setTercerOjo(String tercerOjo) {
		// Con el metodo equalsIgnoreCase() comparo si el valor de tercerOjo es igual a marron o negro
		if (tercerOjo.equalsIgnoreCase("marron") || tercerOjo.equalsIgnoreCase("negro")) {
			this.tercerOjo = tercerOjo; // De ser asi asigno el color
		} else {
			// Si esta dentro del rango de colores se añade el color del ojo por defecto del atributo de la propia clase
			System.out.println("El color de los ojos solo puede ser marron, negro o rojo.");
		}
		
	}
	
	// Metodo toString sobrescrito
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " - Color de piel: " + getColorPiel() + " - Raza: " + getRaza()
				+ " - Espacio ocupado " + getEspacioOcupado() + " - Color tercer ojo: " + tercerOjo;
	}
		
	/**
	 * Metodo sobrescrito para cambiar el color de piel cuando el objeto estresa
	 */
	@Override
	public void estresar() {
		setColorPiel("azul");
	}
	
	/**
	 * Metodo que implementa el metodo que hereda de la interface OcupadoEspacio
	 */
	@Override
	public int obtenerEspacio() {
		return this.ESPACIO_OCUPADO;
	}

}
