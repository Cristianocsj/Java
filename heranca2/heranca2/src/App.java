import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de produtos: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Produto[] produtos = new Produto[quantidade]; //criando a lista de produtos

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o tipo do produto (movel, eletronico, aparelho de ginastica): ");
            String tipo = scanner.nextLine();

            System.out.print("Digite as informações do produto: ");
            String info = scanner.nextLine();
            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            System.out.print("Digite os meses de garantia: ");
            int mesesGarantia = scanner.nextInt();

            switch (tipo.toLowerCase()) {
                case "movel":
                    System.out.print("Digite a cor do móvel: ");
                    String cor = scanner.next();
                    produtos[i] = new Movel(info, preco, mesesGarantia, cor);
                    break;
                case "eletronico":
                    System.out.print("Digite a voltagem do eletrônico: ");
                    int voltagem = scanner.nextInt();
                    produtos[i] = new Eletronico(info, preco, mesesGarantia, voltagem);
                    break;
                case "aparelho de ginastica":
                    System.out.print("Digite o peso máximo do aparelho de ginástica: ");
                    double pesoMaximo = scanner.nextDouble();
                    produtos[i] = new AparelhoGinastica(info, preco, mesesGarantia, pesoMaximo);
                    break;
                default:
                    System.out.println("Tipo de produto inválido.");
                    i--; // Repetir iteração para entrada válida
                    break;
            }
            scanner.nextLine();
        }
        for(Produto produto : produtos){ // o : é para fazer os loops sequencialmente até o final, é como um foreach!
            System.out.println(produto.Descricao());
        }
        scanner.close();
    }
}
