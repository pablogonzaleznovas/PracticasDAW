package instituto;
/**
 * 
 * @author a18pablogn
 * @version Beta
 * @serial 1.0
 * Clase que pertence o paquete Instituto, e ademáis é unha clase filla de Persoa.
 * 
 */
public class Alumno extends Persoa{
	static int numExpedienteActual = 0;  /** Inicializamos o contador en 0 */ 
	private int numExpediente;
/**
 * Método Constructor, necesario para instanciar obxetos desta clase.
 * @param nome atributo que procede da clase Pai e que fai falla pasarllo como argumento o constructor da clase Alumno. 
 * @param idade atributo que procede da clase Pai e que fai falla pasarllo como argumento o constructor da clase Alumno. 
 * numExpedienteActual e atributo estático (sempre ten o mesmo valor común en todos os fillos), utilizase para contabilizar os obxetos creados da clase Alumno
 * numExpediente e un atributo individual de cada obxecto, no momento da creación desa instancia (obxeto) almacena o valor.
 * 
 */
	public Alumno(String nome, int idade) {
		super(nome, idade);
		Alumno.numExpedienteActual++; /** aumentamos o contador no momento da creación*/ 
		this.numExpediente = Alumno.numExpedienteActual; /** asignamos o contador o número de expediente */
	}
/**
 * Método Getter
 * @return  devolve o número de expediente deste Obxeto, valor único de cada instancia
 */
	public int getNumExpediente() {
		return numExpediente;
	}
	/**Método toString() 
	 * @return devolve un String personalizado para visualizar cada instancia da clase Alumno. Acepta o uso do Polimorfismo. 
	 */
	public String toString() {
		return "Alumno [numExpediente=" + numExpediente + ", nome=" + nome + ", idade=" + idade + "]";
	}
}
