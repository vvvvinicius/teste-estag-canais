import java.util.Scanner;

public class teste_estag_canais {

	public static void main(String[] args) {
		
		// Declaração de variáveis
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
		
				// Informando erro caso insira menos de 14 dígitos no CPF do emissor
				if (cpf_emissor.length() <= 13) { 
						System.out.println("\nDesculpe, não foi possível seguir com sua solicitação pois o CPF informado possui menos de 14 dígitos." + "\nPara tentar novamente, reinicie a aplicação.");
						System.exit(0);
					}
				// Informando erro caso insira mais de 14 dígitos no CPF do emissor
				if (cpf_emissor.length() >= 15) { 
						System.out.println("\nDesculpe, não foi possível seguir com sua solicitação pois o CPF informado possui mais de 14 dígitos." + "\nPara tentar novamente, reinicie a aplicação.");
						System.exit(0);
					}
				
		// Obtendo nome e CPF do receptor
		System.out.println("\nInsira o nome do receptor:");
		nome_receptor = leia.nextLine();
		System.out.println("\nInsira o CPF do receptor no formato XXX.XXX.XXX-XX:");
		cpf_receptor = leia.nextLine();
				
				// Informando erro caso insira menos de 14 dígitos no CPF do receptor
				if (cpf_receptor.length() <= 13) { 
						System.out.println("\nDesculpe, não foi possível seguir com sua solicitação pois o CPF informado possui menos de 14 dígitos." + "\nPara tentar novamente, reinicie a aplicação.");
						System.exit(0);
					}
				// Informando erro caso insira mais de 14 dígitos no CPF do receptor
				if (cpf_receptor.length() >= 15) { 
						System.out.println("\nDesculpe, não foi possível seguir com sua solicitação pois o CPF informado possui mais de 14 dígitos." + "\nPara tentar novamente, reinicie a aplicação.");
						System.exit(0);
					}
		
		// Obtendo dados da conta do emissor
		System.out.println("\nInsira os três números da agência do emissor:");
		agencia_emissor = leia.nextInt();
		System.out.println("\nInsira os quatro números da conta do emissor:");
		conta_emissor = leia.nextInt();
		
		// Obtendo dados bancários do receptor
		System.out.println("\nInsira os três números da agência do receptor:");
		agencia_receptor = leia.nextInt();
		System.out.println("\nInsira os quatro números da conta do receptor:");
		conta_receptor = leia.nextInt();
		
				// Informando erro caso tente transferir para a mesma conta
				if((conta_receptor == conta_emissor) || (agencia_receptor == agencia_emissor)) {
						System.out.println("\nDesculpe, não foi possível seguir com a transferência pois os números das agências ou das contas são iguais.");
						System.exit(0);
					}
		// Obtendo o tipo de transferência		
		System.out.println("\nEscolha o tipo de transferência: \n1. PIX \n2. TED \n3. DOC");
		tipo_transferencia = leia.nextInt();
				
		// Obtendo o valor da transferência		
		System.out.println("\nInsira o valor da transferência sem ponto ou vírgula:");
		valor_transferencia = leia.nextFloat();
		
				// Conferindo se a transferência via PIX respeita a regra e informando erro caso a resposta seja negativa
				if((tipo_transferencia == 1) && (valor_transferencia > 5000)) {
					System.out.println("\nDesculpe, não foi possível seguir com a transferência."+"\nO limite para transferências via PIX é de R$5000 e você tentou transferir R$"+valor_transferencia+".");
					System.exit(0);
					}
				
				// Conferindo se a transferência via TED respeita a regra e informando erro caso a resposta seja negativa
				else if((tipo_transferencia == 2) && (valor_transferencia < 5000 || valor_transferencia > 10000)) {
					System.out.println("\nDesculpe, não foi possível seguir com a transferência."+"\nTransferências via TED são permitidas entre R$5000 e R$10000, você tentou transferir R$"+valor_transferencia+".");
					System.exit(0);
					}
				
				// Conferindo se a transferência via DOC respeita a regra e informando erro caso a resposta seja negativa
				else if((tipo_transferencia == 3) && (valor_transferencia > 10000)) {
						System.out.println("\nDesculpe, não foi possível seguir com a transferência."+"\nO valor minímo para transferências via DOC é de R$10000 e você tentou transferir R$"+valor_transferencia+".");
						System.exit(0);
						}
					
				else{	
						// Definindo o saldo do emissor após a transferência sem impeditivos
						saldo_emissor = saldo_emissor - valor_transferencia;
						// Definindo o saldo do receptor após a transferência sem impeditivos
						saldo_receptor = saldo_receptor + valor_transferencia;
						// Aumentando o ID após a transferência sem impeditivos
						id_transferencia = id_transferencia++;
						// Mensagem de sucesso e informações dos saldos nas duas contas, emissor e receptor
						System.out.println("\nSua transferência foi realizada com sucesso! \nSaldo do emissor: R$"+saldo_emissor+"."+"\nSaldo do receptor: R$"+saldo_receptor+".");
					}
				
				
				
}
}
