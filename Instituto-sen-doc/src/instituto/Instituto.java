package instituto;
/**
 * 
 * @author a18pablogn
 * @version Beta 
 * @since 15/10/2019
 *
 */
public class Instituto {
	
	/**
	 * @author a18pablogn 
	 * @version Beta 
	 * @since 15/10/2019
	 * M�todo Main (principal) onde se executa o programa
	 * Descripci�n, creaci�n de 2 arrays con 2 obxetos de cada clase e logo se visualizan por pantalla.
	 */
	public static void main(String[] args) {
		Profesor[] profesores = new Profesor[2];
		Alumno[] alumnos = new Alumno[2];
		
		Profesor profe1 = new Profesor("Xiana P�rez", 36, 25000);
		Profesor profe2 = new Profesor("Ant�a Dom�nguez", 41, 30000);
		
		profesores[0] = profe1;
		profesores[1] = profe2;
		
		for (int i=0; i<profesores.length; i++) {
			System.out.println(profesores[i].toString());
		}
		
		Alumno alumno1 = new Alumno("Xurxo G�mez", 23);
		Alumno alumno2 = new Alumno("Aitor N��ez", 19);
		
		alumnos[0] = alumno1;
		alumnos[1] = alumno2;
		
		for (int i=0; i<alumnos.length; i++) {
			System.out.println(alumnos[i].toString());
		}
	}

}
