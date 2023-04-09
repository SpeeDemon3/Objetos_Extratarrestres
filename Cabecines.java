package ejerciciosClases.actividadTema7;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 * Clase hija de la clase Extratarrestre
 *
 */
public class Cabecines extends Extratarrestre implements OcupaEspacio{
	// Variables finales constantes que no podran ser modificadas una vez inicializadas
	public static final String NOMBRE_RAZA = "Cabecines";
	public static final int ESPACIO_OCUPADO = 1;

	// Constructo vacio
	public Cabecines() {}
	
	// Constructor con los atributos nombre y colorPiel de la clase padre
	public Cabecines(String nombre, String colorPiel) {
		super(nombre, colorPiel); // Atributos heredados de la super clase
	}
	
	// Constructor con todos sus atributos, estableciendo su raza y espacio con los valores finales
	public Cabecines(String nombre, String colorPiel, String raza, int espacioOcupado) {
		super(nombre, colorPiel, NOMBRE_RAZA, ESPACIO_OCUPADO);
	}
	
	// Metodo toString sobrescrito
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " - Color de piel: " + getColorPiel() + " - Raza: " + getRaza()
				+ " - Espacio ocupado " + getEspacioOcupado();
	}
	
	/**
	 * Metodo sobrescrito para cambiar el color de piel cuando el objeto estresa
	 */
	@Override
	public void estresar() {
		setColorPiel("rojo");
	}
	
	/**
	 * Metodo que implementa el metodo que hereda de la interface OcupadoEspacio
	 */
	@Override
	public int obtenerEspacio() {
		return this.ESPACIO_OCUPADO;
	}
}
