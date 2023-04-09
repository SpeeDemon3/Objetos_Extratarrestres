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
		Cabezones cabezones1 = new Cabezones("Venom", "negro", Cabezones.NOMBRE_RAZA, Cabezones.ESPACIO_OCUPADO, "rosa");
		Cabezones cabezones2 = new Cabezones("Craneo Rojo", "negro-rojo", Cabezones.NOMBRE_RAZA, Cabezones.ESPACIO_OCUPADO, "violeta");

		// Estreso un extratarrestre de cada raza
		cabecines1.estresar();
		cabezones2.estresar();
		
		// Muestro sus valores por consola con el metodo toString de cada objeto
		System.out.println(cabecines1.toString() + "\n");
		System.out.println(cabecines2.toString() + "\n");
		System.out.println(cabezones1.toString() + "\n");
		System.out.println(cabezones2.toString() + "\n");
		
		// Creo 2 objetos de la clase Cabezones
		Cabezones cabezones3 = new Cabezones("Punisher", "negro-blanco", "gris");
		Cabezones cabezones4 = new Cabezones("Iron-Man", "rojo-amarillo", "marron");
		
		// Creo 2 objetos de la clase Cabecines
		Cabecines cabecines3 = new Cabecines("Black Widow", "negro");
		Cabecines cabecines4 = new Cabecines("Kraven", "blanco");
		
		// Estreso un extratarrestre de cada raza
		cabezones4.estresar();
		cabecines3.estresar();
		
		// Muestro sus valores por consola con el metodo toString de cada objeto
		System.out.println(cabecines3.toString() + "\n");
		System.out.println(cabecines4.toString() + "\n");
		System.out.println(cabezones3.toString() + "\n");
		System.out.println(cabezones4.toString() + "\n");
	
				
		// Array de habitantes
		Extratarrestre[] habitantes = new Extratarrestre[] {
			// Objetos de las clases Cabecines y Cabezones	
			new Cabecines("Matanza", "rojo-sangre", Cabecines.NOMBRE_RAZA, Cabecines.ESPACIO_OCUPADO),
			new Cabecines("Thor", "gris-azul-rojo", Cabecines.NOMBRE_RAZA, Cabecines.ESPACIO_OCUPADO),
			new Cabezones("Rocket", "marron", Cabezones.NOMBRE_RAZA, Cabezones.ESPACIO_OCUPADO, "rosa"),
			new Cabezones("Hulk", "verde", Cabezones.NOMBRE_RAZA, Cabezones.ESPACIO_OCUPADO, "violeta")
			
		};
		
		// Imprimo la informacion de los habitantes
		for (Extratarrestre alien : habitantes) {
			// Imprimo la informacion de los objetos con el metodo toString()
			System.out.println(alien.toString());
		}
		
		System.out.println("##########################");
	
		
		// Array autobus 
		OcupaEspacio[] autobus = new OcupaEspacio[3];
		// Añado objetos al array
		autobus[0] = new Cabecines();
		autobus[1] = cabezones2;
		autobus[2] = new Paquete();
		
		// Variable para recoger el espacio total de los pasajeros del array autobus
		int totalEspacio = 0;
		
		// Recorro el array autobus
		for(int i = 0; i < autobus.length; i++) {
			totalEspacio += autobus[i].obtenerEspacio(); // Sumo el espacio de cada ocupante en cada iteracion y lo acumulo en la variable
			System.out.println(autobus[i].toString());
		}
		
		// Imprimo el espacio total ocupado de los pasajeros
		System.out.println("\nEl espacio total ocupado es " + totalEspacio);
		
	
	}
	

}
