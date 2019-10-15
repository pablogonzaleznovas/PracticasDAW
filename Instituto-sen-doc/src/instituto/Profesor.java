package instituto;
/**
 * 
 * @author a18pablogn
 * @version Beta 
 * @since 15/10/2019
 * Clase que pertence o paquete Instituto, e ademáis é unha clase filla de Persoa.
 */
public class Profesor extends Persoa {
/**
 * @author a18pablogn
 */
	private int salario;
/**
 * Método Constructor da clase Profesor, necesario para instanciar obxetos desta clase.
 * @param nome atributo tipo string que se utiliza para chamar o constructor super (da clase Persoa), e que fai falla pasarllo como argumento o constructor da clase Profesor. Almacena o valor deste obexto.
 * @param idade atributo tipo enteiro que se utiliza para chamar o constructor super (da clase Persoa), e que fai falla pasarllo como argumento o constructor da clase Profesor. Almacena o valor deste obexto.
 * @param salario atributo tipo enteiro que almacena o valor deste atributo, ademáis e necesario pasarllo como parámetro o constructo deste clase.
 */
	public Profesor(String nome, int idade, int salario) {
		super(nome, idade); 
		this.salario = salario;
	}
/**
 * Método Getter do atributo Salario
 * @return devolve un enteiro co valor do atributo Salario do obxeto que o executa
 */
	public int getSalario() {
		return salario;
	}
/**
 * Descripción: Método Setter (modificador) do atributo salario. 
 * @param salario recibe como parámetro salario (un enteiro) para asignarlle este valor o atributo Salario.
 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
/**Método toString() 
* @return devolve un String personalizado para visualizar cada instancia da clase Profesor. Acepta o uso do Polimorfismo. 
*/
	public String toString() {
		return "Profesor [salario=" + salario + ", nome=" + nome + ", idade=" + idade + "]";
	}
}
