//CRISTIANO CORRÊA DA SILVA JÚNIOR, 231011
public class Individual extends Competidor {
    private String nome;



    //Construtor
    public Individual(String modalidade, String nome) {
        super(modalidade);
        setNome(nome);
    }
    public Individual(){}
    
    //Get
    public String getNome() {
        return nome;
    }
    //Set
    public void setNome(String nome) {
        if(nome.length() == 0){
            throw new IllegalArgumentException("É preciso preencher o nome");
        }
        this.nome = nome;
    }

    @Override
    public String descricao(){
        return"Modalidade: " + getModalidade() + ", Nome: " + nome;
    }

}
