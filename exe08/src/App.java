import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);

        System.out.print("Nome/Name: ");
        String nome = tec.nextLine();

        System.out.print("Endereço/Address: ");
        String endereco = tec.nextLine();

        System.out.print("CEP: ");
        int cep = tec.nextInt();
        tec.nextLine();  // consumir a quebra de linha

        System.out.print("País/Country: ");
        String pais = tec.nextLine();

        System.out.print("Estado/State: ");
        String estado = tec.nextLine();

        System.out.print("Email: ");
        String email = tec.nextLine();

        InfoCliente cliente = new InfoCliente(nome, endereco, cep, estado, pais, email);

        System.out.println(cliente.MensagemRetorno());
        tec.close();
    }
}
