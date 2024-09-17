import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            AparelhoEletronico dispositivo = new AparelhoEletronico();

            System.out.print("Digite qual o tipo do aparelho em que você deseja procurar: ");
            dispositivo.setTipoAparelho(input.nextLine());
            System.out.print("Digite o consumo médio do seu aparelho em kwatts por hora: ");
            dispositivo.setConsumoMedio(input.nextFloat());
            System.out.print("Digite a voltagem do seu aparelho: ");
            dispositivo.setVoltagem(input.nextInt());
            System.out.print("Digite a quantidade de horas de uso do aparelho desejado: ");
            float qtdHora = input.nextFloat();
            System.out.print("Digite quanto vale cada Kwatt: ");
            float precoKwatt = input.nextFloat();
            System.out.println();

            System.out.println("INFORMAÇÕES DO APARELHO:");
            System.out.println("Tipo: " + dispositivo.getTipoAparelho());
            System.out.println("Consumo médio: " + dispositivo.getConsumoMedio());
            System.out.println("Voltagem: " + dispositivo.getVoltagem());
            System.out.printf("Preço ao utilizar o aparelho por %.2f horas, sabendo que o preço do Kwatt é R$%.2f: R$%.2f%n", qtdHora, precoKwatt, dispositivo.ValorConsumidoReais(qtdHora, precoKwatt));

        } 
    }
}
