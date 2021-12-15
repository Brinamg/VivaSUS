package Cadastro;

public class Pessoa {
	
	private String nomeCompleto;
	private String nomeSocial;
	private String cpf;
	private String pronome;
	private String dataNascimento;
	private String endereco;
	private String genero;
	
	public Pessoa(String nomeCompleto,String nomeSocial,String cpf,String pronome,String dataNascimento,String endereco,String genero) 
	{
		//padr�o
		this.nomeCompleto = nomeCompleto;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.pronome = pronome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.genero = genero;
		
		
	}
	
	public void imprimirInfoPadrao() 
	{
		System.out.println("\nEssa pessoa � a"+nomeCompleto+" com o CPF "+
	cpf+". Esta pessoa utiliza o pronome "+pronome+" e o seu g�nero �: "+genero+
	". Sua data de nascimento �: "+dataNascimento+" e com o endere�o "+endereco);
	}
	
	public Pessoa(String nomeSocial,String cpf,String pronome,String dataNascimento,String endereco) 
	{
		//pessoa trans e n�o-bin�ria
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.pronome = pronome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}
	
	public void imprimirInfoPessoa() 
	{
		System.out.println("\nEssa pessoa � a"+nomeSocial+" com o CPF "+
		cpf+". Esta pessoa utiliza o pronome "+pronome+" e o seu g�nero �: "+genero+
		". Sua data de nascimento �: "+dataNascimento+" e com o endere�o "+endereco+".");
	}
	
	public void Pessoa(String nomeCompleto,String cpf,String dataNascimento,String endereco,String genero) 
	{
		//pessoa sem pronome e nomeSocial
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}
	
	public void imprimirInfoSem() 
	{
		System.out.println("\nEssa pessoa � a"+nomeCompleto+" com o CPF "+
		cpf+". Esta pessoa utiliza o g�nero: "+genero+". Sua data de nascimento"
		+ " �: "+dataNascimento+" e com o endere�o "+endereco);
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPronome() {
		return pronome;
	}

	public void setPronome(String pronome) {
		this.pronome = pronome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
		
}
