public class Aluno extends Pessoa {
    private String curso;
    private String periodo;
    private float mensalidade;
    private float CR;
    
    //Construtores
    public Aluno(String nome, int codigo, String endereco, String curso, String periodo, float mensalidade, float cR) {
        super(nome, codigo, endereco);
        setCurso(curso);
        setPeriodo(periodo);
        setMensalidade(mensalidade);
        setCR(cR);
    }
    public Aluno(){}

    //Getters
    public String getCurso() {
        return curso;
    }
    public String getPeriodo() {
        return periodo;
    }
    public float getMensalidade() {
        return mensalidade;
    }
    public float getCR() {
        return CR;
    }

    //Setters
    public void setCurso(String curso) {
        if(curso.length() == 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.curso = curso;
    }
    public void setPeriodo(String periodo) {
        if(periodo.length() == 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.periodo = periodo;
    }
    public void setMensalidade(float mensalidade) {
        if(mensalidade < 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.mensalidade = mensalidade;
    }
    public void setCR(float cR) {
        if(CR < 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.CR = cR;
    }

    //Método para exibir dados
    public void ExibeDados(){
        super.ExibeDados();
        System.out.println("Curso: " + curso);
        System.out.println("Período: " + periodo);
        System.out.println("Mensalidade: R$ " + String.format("%.2f", mensalidade));
        System.out.println("CR: " + String.format("%.2f", CR));
    }
}
