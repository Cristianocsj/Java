import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta a quantidade de imóveis
        System.out.print("Quantos imóveis deseja cadastrar? ");
        int qtdImoveis = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha

        Imovel[] imoveis = new Imovel[qtdImoveis];

        // Leitura dos dados de cada imóvel
        for (int i = 0; i < qtdImoveis; i++) {
            System.out.print("O imóvel é um Apartamento ou uma Casa? ");
            String tipo = scanner.nextLine();

            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();

            System.out.print("Número de quartos: ");
            int numQuartos = scanner.nextInt();

            System.out.print("Número de banheiros: ");
            int numBanheiros = scanner.nextInt();

            System.out.print("Área do imóvel: ");
            double area = scanner.nextDouble();
            
            if (tipo.equalsIgnoreCase("Apartamento")) {
                imoveis[i] = new Apartamento(endereco, numQuartos, numBanheiros, area);
            } else if (tipo.equalsIgnoreCase("Casa")) {
                System.out.print("Área do terreno: ");
                double areaTerreno = scanner.nextDouble();
                imoveis[i] = new Casa(endereco, numQuartos, numBanheiros, area, areaTerreno);
            }
            scanner.nextLine();  // Consumir a quebra de linha
        }

        // Exibe o valor do aluguel de cada imóvel
        for (Imovel imovel : imoveis) {
            System.out.println("Imóvel no endereço " + imovel.getEndereco() + " tem aluguel de: R$" + imovel.calculaAluguel());
        }

        scanner.close();
    }
}
