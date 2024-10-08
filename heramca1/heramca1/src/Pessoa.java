public abstract class Pessoa {
    private String nome;
    private int codigo;
    private String endereco;

    //Construtores
    public Pessoa(String nome, int codigo, String endereco) {
        setNome(nome);
        setCodigo(codigo);
        setEndereco(endereco);
    }
    public Pessoa(){}

    //Getters
    public String getNome() {
        return nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getEndereco() {
        return endereco;
    }
    
    //Setters
    public void setNome(String nome) {
        if(nome.length() == 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        if(codigo < 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.codigo = codigo;
    }

    public void setEndereco(String endereco) {
        if(endereco.length() == 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.endereco = endereco;
    }

    //Método para exibir dados
    public void ExibeDados(){
        System.out.println("\nDADOS DO " + getClass().getName().toUpperCase());
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Endereço: " + endereco);
    }
}
