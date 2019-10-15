package instituto;
/**
 * 
 * @author a18pablogn
 * @version Beta 
 * @since 15/10/2019
 * Clase principal onde se establecen os atributos b�sicos de nome e idade
 * Declara os seus atributos como protected, para que soamente sexan accesibles dende esta clase, ou dende as clases fillas
 * 
 */
public class Persoa {
	protected String nome;
	protected int idade;
/**
 * M�todo Constructor, necesario para instanciar obxetos desta clase.
 * @param nome atributo tipo string para gardar o nome, necesario pasarlle este dato como par�metro do constructor.
 * @param idade atributo tipo enteiro para gardar o nome, necesario pasarlle este dato como par�metro do constructor.
 */
	public Persoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
/**
 * Descripci�n: M�todo Getter do atributo nome.
 * @return devolve (un string) co valor do atributo nome 
 */
	public String getNome() {
		return nome;
	}
/**
 * Descripci�n: M�todo Setter (modificador) do atributo nome. 
 * @param nome recibe como par�metro nome (un string) para asignarlle este valor o atributo nome.
 */
	public void setNome(String nome) {
		this.nome = nome;
	}
/**
 * Descripci�n: M�todo Getter do atributo idade.
 * @return devolve (un entero) o valor do atributo idade.
 */
	public int getIdade() {
		return idade;
	}
/**
 * Descripci�n: M�todo Setter (modificador) do atributo idade. 
 * @param idade recibe como par�metro nome (un entero) para asignarlle este valor o atributo idade
 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
/**
 * Descripci�n: M�todo toString 
 * Devuelve un string personalizado que se utiliza para mostrar la clase. Acepta o uso do Polimorfismo. 
 */
	public String toString() {
		return "Persoa [nome=" + nome + ", idade=" + idade + "]";
	}
}
