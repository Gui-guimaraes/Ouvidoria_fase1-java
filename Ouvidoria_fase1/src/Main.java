import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        int tamanhoArray = 5;
	        String [] tiposManifestacoes = new String[tamanhoArray];
	        String [] descricaoManifestacoes = new String[tamanhoArray];
	        int contadorManifestacoes = 0;

	        Scanner sc = new Scanner(System.in);

	        int opcao;

	        do {
	        System.out.println("---- Menu ----");
            System.out.println("1 - Cadastrar Manifestação");
            System.out.println("2 - Listar Manifestação");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: 
                if (contadorManifestacoes == tamanhoArray) {
                    System.out.println("Limite de manifestações atingido!");
                } else{
                    sc.nextLine();
                    System.out.println("Digite o tipo da manifestação: ");
                    tiposManifestacoes[contadorManifestacoes] = sc.nextLine();

                    System.out.println("Digite a descrição da manifestação: ");
                    descricaoManifestacoes[contadorManifestacoes] = sc.nextLine();

                    contadorManifestacoes++;

                    System.out.println("Manifestação cadastrada com sucesso!");
                }
                break;
                
                case 2:
                if (contadorManifestacoes == 0 ) {
                    System.out.println("Nenhuma manifestação cadastrada!");
                } else {
                    for (int i = 0; i < contadorManifestacoes; i++) {
                        System.out.println("Manifestação " + (i + 1) + ": ");
                        System.out.println("Tipo: " + tiposManifestacoes[i]);
                        System.out.println("Descrição: " + descricaoManifestacoes[i]);
                        System.out.println("-------------------------------");
                    }
                }
                break;

                case 3:
                System.out.println("Saindo...");
                break;

                default:
                System.out.println("Opção inválida!");
	                break;
	            }
	        } while (opcao != 3);
	        sc.close();
	    }
}
