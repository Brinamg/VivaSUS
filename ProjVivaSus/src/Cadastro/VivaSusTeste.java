package VivaSUS.ProjVivaSus.src.Cadastro;

import java.util.Scanner;

public class VivaSusTeste 
{
	public static void main(String[] args)
	{
		Scanner leia= new Scanner(System.in);
		
		//pedir primeiro informa��es obrigat�rias
		
		System.out.println("\t\t***Informa��es Obrigat�rias***");
		System.out.println("Nome Completo: ");
		String nome= leia.nextLine();
		
		int opcaoNome=0;
		boolean primeiro=true;
		int clinicoGeral=0,dentista=0,ginecologista=0;
		
		do//verificando se a pessoa coloca a op��o correta
		{
			if(primeiro==false)
			{
				System.out.println("Ops... Op��o inv�lida!\nTente 1 ou 2.\n\n");
		
			}
			System.out.println("Esse � o nome completo que est� no seu documento ou nome social?\n1- Nome igual ao documento.\n2-Nome Social");
			opcaoNome= Integer.parseInt(leia.nextLine());
			
			primeiro=false;//para caso a primeira inser��o esteja correta, n�o ocorra o loomping
			
		}while(opcaoNome!=1 && opcaoNome!=2);
			
		System.out.println("\nQuais s�o os seus pronomes (Caso n�o saiba responder essa pergunta responda '0')");
		String pronomes= leia.nextLine();

		System.out.println("\nN�mero do CPF (apenas os n�meros sem tra�os ou pontos): ");
		String cpf= leia.nextLine();
		
		System.out.println("\nData de Nascimento (dd/mm/aaaa): ");
		String dataNascimento=leia.nextLine();
		
		System.out.println("\nN�mero do Cart�o SUS (apenas os n�meros sem tra�os ou pontos): ");
		String numSus= leia.nextLine();
		
		System.out.println("\nEndere�o: ");
		String end=leia.nextLine();
		
		Paciente paciente= new Paciente(cpf,dataNascimento,end,numSus);
		if(opcaoNome==1)
		{
			paciente.setNomeCompleto(nome);
		}
		else if(opcaoNome==2)
		{
			paciente.setNomeSocial(nome);
		}
		else
		{
			System.out.println("Nome Completo: ");
		}
		if(!pronomes.equals("0"))
		{
			paciente.setPronome(pronomes);
			System.out.println(pronomes);
		}
		
		

		//Escolher especialidades:
		int opcaoEspecialidades=0;
		Especialidades especialista;
		System.out.println("\t\t***Especiliadades***");
		System.out.println("Escolha qual o tipo de m�dico que voc� precisa:"
				+ "\n1-Cl�nico Geral"
				+ "\n2-Dentista"
				+ "\n3-Ginecolista");
		opcaoEspecialidades= leia.nextInt();
		switch(opcaoEspecialidades)
		{
			case 1:
				System.out.println("\t\t***Cl�nico Geral***\n"
						+ "Escolha a Pessoa m�dica que te atende:\n"
						+ "1-Dra. Ana\t"
						+ "2-Dr. David");
				clinicoGeral=leia.nextInt();
				
				switch(clinicoGeral)
				{
					case 1:
						especialista = new ClinicoGeral("Dra. Ana");
						System.out.println("Dra. Ana");
						break;
					
					case 2:
						especialista = new ClinicoGeral("Dr. David");
						System.out.println("Dr. David");
						break;
				}break;
		
				
			case 2:
				System.out.println("\t\t***Dentista***\n"
						+ "Escolha a Pessoa Dentista que te atende:\n"
						+ "1-Dra. Maria\t"
						+ "2-Dr. Paulo");
				dentista=leia.nextInt();
				switch(dentista)
				{
					case 1:
						especialista = new Dentista("Dra. Maria");
						System.out.println("Dra. Maria");
						break;
					
					case 2:
						especialista = new Dentista("Dr. Paulo");
						System.out.println("Dr. Paulo");
						break;
				}break;
			
			case 3:
				System.out.println("\t\t***Ginecologista***\n"
						+ "Escolha a Pessoa Ginecologista que te atende:\n"
						+ "1-Dra. Sandra\t"
						+ "2-Dr. Samyra");
				ginecologista=leia.nextInt();
				switch(ginecologista)
				{
					case 1:
						especialista = new Ginecologista("Dra. Sandra");
						System.out.println("Dra. Sandra");
						break;
					
					case 2:
						especialista = new Ginecologista("Dr. Samyra");
						System.out.println("Dr. Samyra");
						break;
				}break;
		}
		
		
	}
	
	/*public void setPessoaMedica(String pessoaMedica) {
		System.out.println("\nEscolha a pessoa M�dica que te atende: "+"\n1-Ana\n2-David");
		int med= leia.nextInt();//resposta do usu�rio
		
		switch(med) {
		case 1:
			System.out.println("\nConsulta agendada com a Dr. Ana que atende na unidade de Sa�de Rua Bar�o do Duprat, 323");
			pessoaMedica= "Ana";
			endereco="Rua Bar�o do Duprat, 323";
			break;
		case 2:
			System.out.println("\nConsulta agendada com a Dr. David que atende na Rua Aracatu, 02");
			break;
			default:
			System.out.println("\nInvalido!!");
		}*/
}
