package instituto;
/**
 * 
 * @author a18pablogn
 * @
 */
public class Profesor extends Persoa {
/**
 * @author a18pablogn
 */
	private int salario;

	public Profesor(String nome, int idade, int salario) {
		super(nome, idade);
		this.salario = salario;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String toString() {
		return "Profesor [salario=" + salario + ", nome=" + nome + ", idade=" + idade + "]";
	}
}
