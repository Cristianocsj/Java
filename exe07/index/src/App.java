import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite quantas horas você trabalhou nessa semana: ");
        int HorasSemana = teclado.nextInt();

        System.out.print("Qual o valor do seu valor-hora: ");
        float horaAula = teclado.nextFloat();

        Empregado pessoa = new Empregado(HorasSemana, horaAula);
        System.out.println("O valor do seu salário ao final dessa semana foi: " + pessoa.RetornoSalarioSemanal());

        teclado.close();  // Fechando o Scanner
    }
}