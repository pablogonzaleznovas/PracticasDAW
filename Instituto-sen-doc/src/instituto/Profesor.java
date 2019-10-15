package instituto;
/**
 * 
 * @author a18pablogn
 * @version Beta 
 * @since 15/10/2019
 * Clase que pertence o paquete Instituto, e adem�is � unha clase filla de Persoa.
 */
public class Profesor extends Persoa {
/**
 * @author a18pablogn
 */
	private int salario;
/**
 * M�todo Constructor da clase Profesor, necesario para instanciar obxetos desta clase.
 * @param nome atributo tipo string que se utiliza para chamar o constructor super (da clase Persoa), e que fai falla pasarllo como argumento o constructor da clase Profesor. Almacena o valor deste obexto.
 * @param idade atributo tipo enteiro que se utiliza para chamar o constructor super (da clase Persoa), e que fai falla pasarllo como argumento o constructor da clase Profesor. Almacena o valor deste obexto.
 * @param salario atributo tipo enteiro que almacena o valor deste atributo, adem�is e necesario pasarllo como par�metro o constructo deste clase.
 */
	public Profesor(String nome, int idade, int salario) {
		super(nome, idade); 
		this.salario = salario;
	}
/**
 * M�todo Getter do atributo Salario
 * @return devolve un enteiro co valor do atributo Salario do obxeto que o executa
 */
	public int getSalario() {
		return salario;
	}
/**
 * Descripci�n: M�todo Setter (modificador) do atributo salario. 
 * @param salario recibe como par�metro salario (un enteiro) para asignarlle este valor o atributo Salario.
 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
/**M�todo toString() 
* @return devolve un String personalizado para visualizar cada instancia da clase Profesor. Acepta o uso do Polimorfismo. 
*/
	public String toString() {
		return "Profesor [salario=" + salario + ", nome=" + nome + ", idade=" + idade + "]";
	}
}
