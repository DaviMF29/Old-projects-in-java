package clinica;

public class Pessoa {
	protected String nome;
	protected String CPF;
	protected String dataNascimento;
	protected String Telefone;
	
	public Pessoa(String nome, String CPF, String dataNascimento, String telefone) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.dataNascimento = dataNascimento;
		Telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
