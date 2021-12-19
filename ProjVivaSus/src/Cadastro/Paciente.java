package VivaSUS.ProjVivaSus.src.Cadastro;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Collections.Produto;

public class Paciente{
	//atributos que paciente pode ter
	private String nomeCompleto;// nome completo que est� nos documentos oficiais
	private String nomeSocial;//nome social em que a pessoa escolhe ser chamade
	private String cpf;//n�mero de documento oficial
	private String pronome;// pronome a qual o indiv�duo quer ser chamade
	private String dataNascimento; //data do nascimento que est� em documentos oficiais
	private String endereco;// endere�o de resid�ncia (pessoas desabrigadas?)
	private String genero;//genero que est� em documentos oficiais (por�m n�o sei se � necess�rio)
	private String numSus;//N�mero do cart�o sus que � um documento importante para o atendimento no SUS
	private String contatoEmerg;//em caso de emerg�ncia ter um contato
	private String regiao;//para saber qual unidade de sa�de vai ser atendide
	private List <Consulta> listaConsultas;//lista com os registro das consultas da pessoa paciente
	
	public Paciente() 
	{
		
	}

	//construtor
	public Paciente(String cpf,String dataNascimento,String endereco, String numSus) 
	{
		//infos obrigat�rias para qualquer paciente
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.numSus = numSus;
		//iniciando uma lista para quando precisarmos mostrar consultas, � s� chamar
		this.listaConsultas= new ArrayList<Consulta>();
	}
	
	//m�todos:
	//mostrar informa��es
	public void imprimirInfos () throws IllegalAccessException
	{
		
		//informa��es obrigat�rias para qualquer paciente
		String infos = "\nO n�mero do seu CPF � "+
		cpf+".\nSua data de nascimento �: "+dataNascimento+"\ne o seu endere�o � "+endereco+"\n";
		
		//informa��es adicionais
		for (Field f : getClass().getDeclaredFields())
	        if (f.get(this) != null)
	        {
	        	infos+=f.getName()+": "+ f.get(this)+"\n";
	        } 
		System.out.print(infos);	
	}
	//marcar consulta
	public void marcarConsulta (Date dataHorario, Especialidades especialidade, String endereco)
	{
		Consulta consulta = new Consulta(dataHorario, especialidade, endereco);
		this.listaConsultas.add(consulta);
		System.out.print("Consulta marcada com sucesso!");
	}
	
	//Remover consulta da list;
		public Consulta removerConsulta(Date dataHorario)
		{
			int i;
			
			for(i=0;i<listaConsultas.size();i++)
			{
				
				if(listaConsultas.get(i).getDataHorario().equals(dataHorario))
				{
					return listaConsultas.remove(i);	
				}
			}
			return null;
			
		}
		
		//Atualizar dados da list.
		public Consulta atualizarConsultas(Date dataHorario)
		{
			int i;
			
			for(i=0;i<listaConsultas.size();i++)
			{
				
				if(listaConsultas.get(i).getDataHorario().equals(dataHorario))
				{
					Consulta consulta= listaConsultas.get(i);
					consulta.setDataHorario(dataHorario);
					return consulta;
				}
			}
			
			return null;
		}
		
		//Apresentar todas as consultas da list.
		public void apresentarConsultas()
		{
			for(Consulta consulta:listaConsultas)
			{
				System.out.println("Data e hor�rio: "+consulta.getDataHorario()+"\tEspecialidade: "+consulta.getEspecialidade()/*+"\tPessoa M�dica atendente: "+produto.getQuantidade()+*/+"\tUnidade de Sa�de: "+consulta.getEndereco());
			}
		}
	
	//gets e Sets
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

	public String getNumSus() {
		return numSus;
	}

	public void setNumSus(String numSus) {
		this.numSus = numSus;
	}

	public String getContatoEmerg() {
		return contatoEmerg;
	}

	public void setContatoEmerg(String contatoEmerg) {
		this.contatoEmerg = contatoEmerg;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public String marcarConsulta() {
		// TODO Auto-generated method stub
		
		return null;
	}

	/*@Override
	public void dia() {
		
		System.out.println("\n------------------------------");
		System.out.println("\nPor gentileza, selecione algum n�mero a seguir para marcar a consulta: ");
		System.out.println("\n(1) Segunda-feira");
		System.out.println("\n(2) Ter�a-feira");
		System.out.println("\n(3) Quarta-feira");
		System.out.println("\n(4) Quinta-feira");
		System.out.println("\n(5) Sexta-feira");
		// TODO Auto-generated method stub
		switch(dia) {
		case 1:
			System.out.println("\nA consulta foi agendada para Segunda-feira");
			break;
		case 2: 
			System.out.println("\nA consulta foi agendada para Ter�a-feira");
			break;
		case 3: 
			System.out.println("\nA consulta foi agendada para Quarta-feira");
			break;
		case 4: 
			System.out.println("\nA consulta foi agendada para Quinta-feira");
			break;
		case 5:
			System.out.println("\nA consulta foi agendada para Sexta-feira");
			break;
			default:
				System.out.println("\nO dia digitado foi inv�lido! Por favor, digite um n�mero de 1 at� 5.");
		}
	}

	@Override
	public void horario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void medico() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEspecialidade() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEspecialidade() {
		// TODO Auto-generated method stub
		
	}
	*/
		
}
