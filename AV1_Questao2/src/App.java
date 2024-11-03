import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de competidores: ");
        int qtd = scan.nextInt();
        scan.nextLine();

        Competidor [] competidor = new Competidor[qtd];

        for(int i = 0; i < qtd; i++){  
            System.out.println("Competidor " + (i+1) + ": \n");

            competidor[i] = new Competidor();
            System.out.println("Número de inscrição: ");
            int numInscricao = scan.nextInt();
            competidor[i].setNumInscricao(numInscricao);
            scan.nextLine();

            System.out.println("Nome Completo: ");
            String nomeCompleto = scan.nextLine();
            competidor[i].setNomeCompleto(nomeCompleto);

            for(int etapa = 1; etapa <=5; etapa++){
                System.out.print("Informe o tempo na etapa " + etapa + ": ");
                int tempo = scan.nextInt();
                competidor[i].adicionaTempo(tempo);
            }
        }

        Arrays.sort(competidor, Comparator.comparingInt(Competidor::getSomaTempo));

        System.out.println("\nDados dos competidores:");
        for(int i = 0; i < qtd; i++){
            System.out.println((i+1) + " lugar" + competidor[i].getNomeCompleto() + "\nNúmero da inscrição: " + competidor[i].getNumInscricao() + "\n Soma dos tempos: " + competidor[i].getSomaTempo() + "mnutos");
        }
    }
}
