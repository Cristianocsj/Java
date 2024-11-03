//CRISTIANO CORRÊA DA SILVA JÚNIOR, 231011
public class Agendamento {
    private String data;
    private Competidor competidor;


    //Construtor
    public Agendamento(Competidor competidor, String data) {
        setData(data);
        this.competidor = competidor;
    }
    public Agendamento(){}

    //Get
    public String getData() {
        return data;
    }
    public Competidor getCompetidor() {
        return competidor;
    }
    //Set
    public void setData(String data) {
        if (data == null || data.isEmpty()) {
            if (competidor == null) {
                this.data = null; // Permite data nula se for desistência
            } else {
                throw new IllegalArgumentException("É preciso preencher a data");
            }
        } else {
            this.data = data;
        }
    }
    public void setCompetidor(Competidor competidor) {
        this.competidor = competidor;
    }

    public void anuncia(){
        if(competidor == null){
            System.out.println("Desistência");
        }
        else{
            System.out.println("\nCompetidor/Equipe --> " + competidor.descricao() + ", Data: " + data);
        }
    }
}


