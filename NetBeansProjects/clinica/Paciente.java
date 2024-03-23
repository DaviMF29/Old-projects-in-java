package clinica;

public class Paciente extends Pessoa {

	public Paciente(String nome, String CPF, String dataNascimento, String telefone) {
		super(nome, CPF, dataNascimento, telefone);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " / " + "CPF: " + CPF;
	}
}
