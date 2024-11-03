//CRISTIANO CORRÊA DA SILVA JÚNIOR, 231011
public abstract class Competidor {
    private String modalidade;


    //Construtores
    public Competidor(String modalidade) {
        setModalidade(modalidade);
    }
    public Competidor(){}

    //Get
    public String getModalidade() {
        return modalidade;
    }

    //Set
    public void setModalidade(String modalidade) {
        if(modalidade.length() == 0){
            throw new IllegalArgumentException("É preciso preencher a modalidade");
        }
        this.modalidade = modalidade;
    }

    public abstract String descricao();
    }
