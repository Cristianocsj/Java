import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 ---> Funcionário\n1 ---> Professor\n2 ---> Aluno\n");
        System.out.print("Digite um dos números: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // Consome a linha pendente após o nextInt()
        
        if(num == 0){
            //criando funcionário
            System.out.println("Digite os dados do Funcionário:");
            System.out.print("Nome: ");
            String nomeFuncionario = scanner.nextLine();
            System.out.print("Código: ");
            int codigoFuncionario = scanner.nextInt();
            scanner.nextLine();  // Consome a linha pendente após o nextInt()
            System.out.print("Endereço: ");
            String enderecoFuncionario = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            System.out.print("Salário: R$ ");
            float salarioFuncionario = Float.parseFloat(scanner.nextLine()); // Lê como string e converte para float
            
            Funcionário funcionario = new Funcionário(nomeFuncionario, codigoFuncionario, enderecoFuncionario, cargo, salarioFuncionario);
            funcionario.ExibeDados(); //instanciando o objeto funcionario
        } else if(num == 1){
            //criando professor
            System.out.println("\nDigite os dados do Professor:");
            System.out.print("Nome: ");
            String nomeProfessor = scanner.nextLine();
            System.out.print("Código: ");
            int codigoProfessor = scanner.nextInt();
            scanner.nextLine();  // Consome a linha pendente após o nextInt()
            System.out.print("Endereço: ");
            String enderecoProfessor = scanner.nextLine();
            System.out.print("Curso: ");
            String curso = scanner.nextLine();
            System.out.print("Salário: R$ ");
            float salarioProfessor = scanner.nextFloat(); // Lê como string e converte para float
            System.out.print("Titulação: ");
            String titulacao = scanner.nextLine();
            
            Professor professor = new Professor(nomeProfessor, codigoProfessor, enderecoProfessor, curso, salarioProfessor, titulacao);
            professor.ExibeDados(); //instanciando professor
        } else {
            //criando aluno
            System.out.println("\nDigite os dados do Aluno:");
            System.out.print("Nome: ");
            String nomeAluno = scanner.nextLine();
            System.out.print("Código: ");
            int codigoAluno = scanner.nextInt();
            scanner.nextLine();  // Consome a linha pendente após o nextInt()
            System.out.print("Endereço: ");
            String enderecoAluno = scanner.nextLine();
            System.out.print("Curso: ");
            String cursoAluno = scanner.nextLine();
            System.out.print("Período: ");
            String periodo = scanner.nextLine();
            System.out.print("Mensalidade: R$ ");
            float mensalidade = scanner.nextFloat(); // Lê como string e converte para float
            System.out.print("CR: ");
            float CR = scanner.nextFloat(); // Lê como string e converte para float
            
            Aluno aluno = new Aluno(nomeAluno, codigoAluno, enderecoAluno, cursoAluno, periodo, mensalidade, CR);
            aluno.ExibeDados(); //instanciando aluno
        }
        
        scanner.close();
    }
}
