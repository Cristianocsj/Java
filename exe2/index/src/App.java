import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado corretamente
        try (Scanner input = new Scanner(System.in)) {

            Taximetro t = new Taximetro();
            System.out.print("Digite a quilometragem desejada(Km): ");
            t.setQuilometragem(input.nextFloat());

            System.out.print("Digite a bandeira que será utilizada(1 ou 2): ");
            t.setBandeira(input.nextInt());

            System.out.printf("O total a pagar é %.2f%n", t.ValorCorrida());
            
        } // O Scanner será automaticamente fechado aqui
    }
}
