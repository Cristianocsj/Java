import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas pessoas existem? ");
        int tamanho = entrada.nextInt();

        Pessoa[] lista = new Pessoa[tamanho];
        for (int i = 0; i < lista.length; i++)
        {
            System.out.print("Essa pessoa " + (i + 1) + " é Aluno(1) ou Funcionario(2)? ");
            int tipo = entrada.nextInt();

            System.out.print("Informe o nome: ");
            entrada.nextLine(); // Limpa o enter do buffer
            String nome = entrada.nextLine();

            System.out.print("Informe o identidade: ");
            long identidade = entrada.nextLong();

            if (tipo == 1) {
                // instanciar um Aluno
                // lista[i] = new Aluno(...);

                System.out.print("Informe a matricula: ");
                long matricula = entrada.nextLong();

                System.out.print("Informe a primeira nota: ");
                double nota1 = entrada.nextDouble();

                System.out.print("Informe a segunda nota: ");
                double nota2 = entrada.nextDouble();

                Aluno aluno = new Aluno(nome, identidade, matricula);
                aluno.setNotas(nota1, nota2);
                lista[i] = aluno;
            }
            else if (tipo == 2) {
                // instanciar um Funcionário
                // lista[i] = new Funcionario(...);

                System.out.print("Informe o registro: ");
                long registro = entrada.nextLong();

                System.out.print("Informe o salário base: ");
                double salarioBase = entrada.nextDouble();

                System.out.print("Informe o cargo: ");
                entrada.nextLine(); // Limpa o enter do buffer
                String cargo = entrada.nextLine();

                System.out.print("Informe a quantidade de faltas: ");
                int faltas = entrada.nextInt();

                lista[i] = new Funcionario(nome, identidade, registro, salarioBase, cargo, faltas);
            }
        }

        // diversas outras coisas sendo feitas...

        for (int i = 0; i < lista.length; i++)
        {
            // Polimorfismo
            // lista é um array de pessoas. Então cada posição do array é entendivel como uma Pessoa
            // Só se pode chamar métodos que tenham sido definidos na classe Pessoa (como o print)
            // Porém, o polimorfismo (que está relacionado com o conceito de herança), faz com que 
            // o print de Aluno seja chamado para as posições onde foi alocado um Aluno 
            // ou print de Funcionario seja chamado para as posições onde foi alocado um Funcionario
            lista[i].print();
        }

        entrada.close();
    }
}
