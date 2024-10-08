public class App {
    public static void main(String[] args) throws Exception {
       
        Pessoa p1 = new Pessoa();
        p1.print();
        p1.setDados("Rogerio", 123456);
        p1.print();

        Pessoa p2 = new Pessoa("Bruno Henrique", 234567);
        p2.print();

        Aluno a1 = new Aluno("Wesley", 111111, 22222);
        a1.setNotas(8, 5);
        a1.print();

        // Usando o construtor com 5 parâmetros que inicializa todos os atributos exceto as faltas
        Funcionario f1 = new Funcionario("Tite", 100000, 200000, 1000000, "Técnico");
        f1.setFaltas(2);
        f1.print();

        // Usando o construtor com 6 parametros que inicializa todos os atributos
        Funcionario f2 = new Funcionario("Gabigol", 1000, 02000, 1500000, "Enrolador", 20);
        f2.print();


        // Exemplo de como funciona o polimorfismo
        
        Pessoa p; // referencia vazia (null) para Pessoa
        p = new Pessoa(); // aqui realmente a área de memória é alocada (objeto é instanciado)
        p.print(); // vai ser chamado o print de Pessoa

        p = new Aluno("Eu", 9, 8);
        p.print(); // Polimofismo: vai ser chamado o print de Aluno();
    }
}
