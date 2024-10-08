public class Professor extends Pessoa{
    private String curso;
    private float salario;
    private String titulacao;

    //Construtores
    public Professor(String nome, int codigo, String endereco, String curso, float salario, String titulacao) {
        super(nome, codigo, endereco);
        setCurso(curso);
        setSalario(salario);
        setTitulacao(titulacao);
    }
    public Professor(){}

    //Getters
    public String getCurso() {
        return curso;
    }

    public float getSalario() {
        return salario;
    }

    public String getTitulacao() {
        return titulacao;
    }

    //Setters
    public void setCurso(String curso) {
        if(curso.length() == 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.curso = curso;
    }

    public void setSalario(float salario) {
        if(salario < 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.salario = salario;
    }

    public void setTitulacao(String titulacao) {
        if(titulacao.length() == 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.titulacao = titulacao;
    }

    //Método para exibir dados
    public void ExibeDados(){
        super.ExibeDados();
        System.out.println("Curso: " + curso);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
        System.out.println("Titulação: " + titulacao);
    }
}