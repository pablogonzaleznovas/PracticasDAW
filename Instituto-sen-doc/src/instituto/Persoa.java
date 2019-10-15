package instituto;
/**
 * 
 * @author a18pablogn
 * @version Beta 
 * @since 15/10/2019
 * @descripcion Clase principal onde se establecen os atributos básicos de nome e idade
 * 
 */
public class Persoa {
	protected String nome;
	protected int idade;
/**
 * 
 * @param nome un campo string para almacenar o nome
 * @param idade un campo entero para almacenar a idade
 */
	public Persoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
/**
 * Descripción: Método Getter do atributo nome.
 * @return devolve (un string) o valor do atributo nome 
 */
	public String getNome() {
		return nome;
	}
/**
 * Descripción: Método Setter do atributo nome. 
 * @param nome recibe como parámetro nome (un string) para asignarlle o valor o atributo nome
 */
	public void setNome(String nome) {
		this.nome = nome;
	}
/**
 * Descripción: Método Getter do atributo idade.
 * @return devolve (un entero) o valor do atributo idade
 */
	public int getIdade() {
		return idade;
	}
/**
 * Descripción: Método Setter do atributo idade. 
 * @param nome recibe como parámetro nome (un entero) para asignarlle o valor o atributo idade
 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
/**
 * Descripción: Método toString 
 * Devuelve un string personalizado que se utiliza para mostrar la clase
 */
	public String toString() {
		return "Persoa [nome=" + nome + ", idade=" + idade + "]";
	}
}
