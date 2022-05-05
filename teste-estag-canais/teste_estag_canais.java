import java.util.Scanner;

public class teste_estag_canais {

	public static void main(String[] args) {
		
		// Declara��o de vari�veis
		Scanner leia = new Scanner(System.in);
		int id_transferencia = 0, agencia_emissor, conta_emissor, agencia_receptor, conta_receptor, tipo_transferencia;
		float valor_transferencia;
		String nome_emissor, nome_receptor, cpf_emissor, cpf_receptor;
		float saldo_emissor = 0, saldo_receptor = 0;
		
		// Obtendo nome e CPF do emissor
		System.out.println("\nInsira o nome do emissor:");
		nome_emissor = leia.nextLine();
		System.out.println("\nInsira o CPF do emissor no formato XXX.XXX.XXX-XX:");
		cpf_emissor = leia.nextLine();
		
				// Informando erro caso insira menos de 14 d�gitos no CPF do emissor
				if (cpf_emissor.length() <= 13) { 
						System.out.println("\nDesculpe, n�o foi poss�vel seguir com sua solicita��o pois o CPF informado possui menos de 14 d�gitos." + "\nPara tentar novamente, reinicie a aplica��o.");
						System.exit(0);
					}
				// Informando erro caso insira mais de 14 d�gitos no CPF do emissor
				if (cpf_emissor.length() >= 15) { 
						System.out.println("\nDesculpe, n�o foi poss�vel seguir com sua solicita��o pois o CPF informado possui mais de 14 d�gitos." + "\nPara tentar novamente, reinicie a aplica��o.");
						System.exit(0);
					}
				
		// Obtendo nome e CPF do receptor
		System.out.println("\nInsira o nome do receptor:");
		nome_receptor = leia.nextLine();
		System.out.println("\nInsira o CPF do receptor no formato XXX.XXX.XXX-XX:");
		cpf_receptor = leia.nextLine();
				
				// Informando erro caso insira menos de 14 d�gitos no CPF do receptor
				if (cpf_receptor.length() <= 13) { 
						System.out.println("\nDesculpe, n�o foi poss�vel seguir com sua solicita��o pois o CPF informado possui menos de 14 d�gitos." + "\nPara tentar novamente, reinicie a aplica��o.");
						System.exit(0);
					}
				// Informando erro caso insira mais de 14 d�gitos no CPF do receptor
				if (cpf_receptor.length() >= 15) { 
						System.out.println("\nDesculpe, n�o foi poss�vel seguir com sua solicita��o pois o CPF informado possui mais de 14 d�gitos." + "\nPara tentar novamente, reinicie a aplica��o.");
						System.exit(0);
					}
		
		// Obtendo dados da conta do emissor
		System.out.println("\nInsira os tr�s n�meros da ag�ncia do emissor:");
		agencia_emissor = leia.nextInt();
		System.out.println("\nInsira os quatro n�meros da conta do emissor:");
		conta_emissor = leia.nextInt();
		
		// Obtendo dados banc�rios do receptor
		System.out.println("\nInsira os tr�s n�meros da ag�ncia do receptor:");
		agencia_receptor = leia.nextInt();
		System.out.println("\nInsira os quatro n�meros da conta do receptor:");
		conta_receptor = leia.nextInt();
		
				// Informando erro caso tente transferir para a mesma conta
				if((conta_receptor == conta_emissor) || (agencia_receptor == agencia_emissor)) {
						System.out.println("\nDesculpe, n�o foi poss�vel seguir com a transfer�ncia pois os n�meros das ag�ncias ou das contas s�o iguais.");
						System.exit(0);
					}
		// Obtendo o tipo de transfer�ncia		
		System.out.println("\nEscolha o tipo de transfer�ncia: \n1. PIX \n2. TED \n3. DOC");
		tipo_transferencia = leia.nextInt();
				
		// Obtendo o valor da transfer�ncia		
		System.out.println("\nInsira o valor da transfer�ncia sem ponto ou v�rgula:");
		valor_transferencia = leia.nextFloat();
		
				// Conferindo se a transfer�ncia via PIX respeita a regra e informando erro caso a resposta seja negativa
				if((tipo_transferencia == 1) && (valor_transferencia > 5000)) {
					System.out.println("\nDesculpe, n�o foi poss�vel seguir com a transfer�ncia."+"\nO limite para transfer�ncias via PIX � de R$5000 e voc� tentou transferir R$"+valor_transferencia+".");
					System.exit(0);
					}
				
				// Conferindo se a transfer�ncia via TED respeita a regra e informando erro caso a resposta seja negativa
				else if((tipo_transferencia == 2) && (valor_transferencia < 5000 || valor_transferencia > 10000)) {
					System.out.println("\nDesculpe, n�o foi poss�vel seguir com a transfer�ncia."+"\nTransfer�ncias via TED s�o permitidas entre R$5000 e R$10000, voc� tentou transferir R$"+valor_transferencia+".");
					System.exit(0);
					}
				
				// Conferindo se a transfer�ncia via DOC respeita a regra e informando erro caso a resposta seja negativa
				else if((tipo_transferencia == 3) && (valor_transferencia > 10000)) {
						System.out.println("\nDesculpe, n�o foi poss�vel seguir com a transfer�ncia."+"\nO valor min�mo para transfer�ncias via DOC � de R$10000 e voc� tentou transferir R$"+valor_transferencia+".");
						System.exit(0);
						}
					
				else{	
						// Definindo o saldo do emissor ap�s a transfer�ncia sem impeditivos
						saldo_emissor = saldo_emissor - valor_transferencia;
						// Definindo o saldo do receptor ap�s a transfer�ncia sem impeditivos
						saldo_receptor = saldo_receptor + valor_transferencia;
						// Aumentando o ID ap�s a transfer�ncia sem impeditivos
						id_transferencia = id_transferencia++;
						// Mensagem de sucesso e informa��es dos saldos nas duas contas, emissor e receptor
						System.out.println("\nSua transfer�ncia foi realizada com sucesso! \nSaldo do emissor: R$"+saldo_emissor+"."+"\nSaldo do receptor: R$"+saldo_receptor+".");
					}
				
				
				
}
}
