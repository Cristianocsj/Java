//CRISTIANO CORRÊA DA SILVA JÚNIOR, 231011
public class Equipe extends Competidor {
    private String tecnico;
    private int numCompetidores;
    
    //Construtor
    public Equipe(String modalidade, String tecnico, int numCompetidores) {
        super(modalidade);
        setTecnico(tecnico);
        setNumCompetidores(numCompetidores);
    }
    public Equipe(){}

    //Get
    public String getTecnico() {
        return tecnico;
    }
    public int getNumCompetidores() {
        return numCompetidores;
    }

    //Set
    public void setTecnico(String tecnico) {
        if(tecnico.length() == 0){
            throw new IllegalArgumentException("É preciso preencher o nome do técnico");
        }
        this.tecnico = tecnico;
    }
    public void setNumCompetidores(int numCompetidores) {
        if(numCompetidores <= 1){
            throw new IllegalArgumentException("Valor inválido para competidores de uma equipe");
        }
        this.numCompetidores = numCompetidores;
    }

    @Override
    public String descricao(){
        return"Modalidade: " + getModalidade() + ", Técnico: " + tecnico + ", Número de competidores: " + numCompetidores;
    }

}
