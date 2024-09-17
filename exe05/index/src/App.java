import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas do projeto: ");
        int qtdPessoas = teclado.nextInt();

        System.out.print("Informe a media salarial dos colaboradores: ");
        float mediaSalarial = teclado.nextFloat();

        System.out.print("Informe o custo mensal de peças do projeto: ");
        float custoMensalPecas = teclado.nextFloat();

        Projeto projeto = new Projeto(qtdPessoas, mediaSalarial, custoMensalPecas);
        System.out.printf("O custo mensal desse projeto é de R$ %.2f\n", projeto.calculaCustoMensal());
        System.out.println("O custo mensal desse projeto é de R$ " + String.format(java.util.Locale.US, "%.2f", projeto.calculaCustoMensal())); //Especifica que o formato de números deve seguir o padrão dos Estados Unidos.

        teclado.close();
    }
}
