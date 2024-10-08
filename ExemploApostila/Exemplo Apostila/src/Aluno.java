public class Aluno extends Pessoa {
    private long matricula;
    private double a1, a2;

    public long getMatricula() {
        return matricula;
    }
    public void setMatricula(long matricula) {
        if (matricula <= 0) {
            throw new IllegalArgumentException("Matricula inválida");
        }
        this.matricula = matricula;
    }
    public double getA1() {
        return a1;
    }
    public void setA1(double a1) {
        if (a1 < 0 || a1 > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10, inclusive");
        }
        this.a1 = a1;
    }
    public double getA2() {
        return a2;
    }
    public void setA2(double a2) {
        if (a2 < 0 || a2 > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10, inclusive");
        }
        this.a2 = a2;
    }

    public Aluno(String nome, long identidade, long matricula) {
        // Se a classe base tiver um construtor sem parâmetros, não é necessário usar o super (nesse caso será
        // automaticamente chamado esse construtor sem parâmetros). 
        
        // PORÉM, você pode usar o super para chamar um outro construtor que tenha parâmetros. 
        
        // AGORA, se a classe base não possuir um construtor sem parâmetros, É OBRIGATÓRIO, usar o super 
        // passando os parâmetros para o construtor desejado da classe base.
        super(nome, identidade);
        setMatricula(matricula);
    }

    public void setNotas(double a1, double a2) {
        setA1(a1);
        setA2(a2);
    }

    public double media() {
        return (a1 + a2) / 2;
    }
    
    public void print() {
        // Chama o método print da classe base
        super.print();
        System.out.println("Matricula: " + matricula);
        System.out.println("A1: " + a1);
        System.out.println("A2: " + a2); 
        System.out.println("Média: " + media());
    }
}
