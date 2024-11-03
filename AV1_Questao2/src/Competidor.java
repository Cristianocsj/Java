public class Competidor {
    private int numInscricao;
    private String nomeCompleto;
    private int somaTempo;

    //Construtor
    public Competidor() {
        this.somaTempo = 0;
    }

    //Getters
    public int getNumInscricao() {
        return numInscricao;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public int getSomaTempo() {
        return somaTempo;
    }
    //Setters
    public void setNumInscricao(int numInscricao) {
        if(numInscricao > 0){
            this.numInscricao = numInscricao;
        }else{
            throw new IllegalArgumentException("Número de inscrição inválido");
        }
    }
    public void setNomeCompleto(String nomeCompleto) {
        if(nomeCompleto.length() == 0){
            throw new IllegalArgumentException("Nome inválido");
        }else{
            this.nomeCompleto = nomeCompleto;
        }
    }
    public void adicionaTempo(int tempo){
        if(tempo > 0){
            this.somaTempo += tempo;
        }else{
            throw new IllegalArgumentException("Tempo deve ser positivo");
        }
    }
    
}
