package VivaSUS.ProjVivaSus.src.Cadastro;

public abstract class Especialidades {
	
	//atributos
	private String especialidade;//nome da especialidades: Cl�nico Geral, Ginecologista e Dentista.
	private String pessoaMedica;// nome da pessoa m�dica que ir� realizar o atendimento.
	private String endereco;//endere�o da unidade de sa�de em que a consulta acontecer�
	
	//construtor
	public Especialidades(String especialidade, String pessoaMedica) {
		this.especialidade = especialidade;
		this.pessoaMedica = pessoaMedica;
	}
	//gets e sets
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getPessoaMedica() {
		return pessoaMedica;
	}
	public void setPessoaMedica(String pessoaMedica) {
		this.pessoaMedica = pessoaMedica;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
