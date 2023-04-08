package ejerciciosClases.actividadTema7;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class CabezaWordl {

	public static void main(String[] args) {

		// Creo 2 objetos de la clase Cabecines pasando como parametro
		// para la raza y espacioOcupado los atributos de la clase Cabecines
		Cabecines cabecines1 = new Cabecines("Spiderman", "rojo-azul", Cabecines.NOMBRE_RAZA, Cabecines.ESPACIO_OCUPADO); 
		Cabecines cabecines2 = new Cabecines("Capitán América", "rojo-azul-blanco", Cabecines.NOMBRE_RAZA, Cabecines.ESPACIO_OCUPADO); 

		// Creo 2 objetos de la clase Cabezones pasando como parametro
		// para la raza y espacioOcupado los atributos de la clase Cabecines
		Cabezones cabezones1 = new Cabezones("Venom", "negro", Cabezones.NOMBRE_RAZA, Cabezones.ESPACIO_OCUPADO);
		Cabezones cabezones2 = new Cabezones("Craneo Rojo", "negro-rojo", Cabezones.NOMBRE_RAZA, Cabezones.ESPACIO_OCUPADO);

		// Estreso un extratarrestre de cada raza
		cabecines1.estresar();
		cabezones2.estresar();
		
		// Muestro sus valores por consola con el metodo toString de cada objeto
		System.out.println(cabecines1.toString() + "\n");
		System.out.println(cabecines2.toString() + "\n");
		System.out.println(cabezones1.toString() + "\n");
		System.out.println(cabezones2.toString() + "\n");
	}

}
