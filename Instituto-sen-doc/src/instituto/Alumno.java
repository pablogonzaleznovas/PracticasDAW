package instituto;
/**
 * 
 * @author a18pablogn
 * @version Beta
 * @serial 1.0
 * 
 */
public class Alumno extends Persoa{
	static int numExpedienteActual = 0;
	private int numExpediente;
	/**
	 * 
	 * @param nome onde gardamos o valor do atributo nome da Clase
	 * @param idade
	 */
	public Alumno(String nome, int idade) {
		super(nome, idade);
		Alumno.numExpedienteActual++;
		this.numExpediente = Alumno.numExpedienteActual;
	}
/**
 * 
 * @return sdfasd
 */
	public int getNumExpediente() {
		return numExpediente;
	}
	public String toString() {
		return "Alumno [numExpediente=" + numExpediente + ", nome=" + nome + ", idade=" + idade + "]";
	}
}
