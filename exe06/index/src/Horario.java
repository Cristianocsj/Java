public class Horario {

    private int horas;
    private int minutos;
    private int segundos;

    public Horario() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Horario(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    // Setters
    public void setHoras(int horas) {
        if (horas < 0 || horas >= 24) {
            throw new IllegalArgumentException("Erro na digitação das horas.");
        }
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos >= 60) {
            throw new IllegalArgumentException("Erro na digitação dos minutos.");
        }
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Erro na digitação dos segundos.");
        }
        this.segundos = segundos;
    }

    // Método para retornar horário no formato 24 horas
    public String Formato24Horas() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    // Método para retornar horário no formato 12 horas
    public String Formato12Horas() {
        int horas12 = horas % 12;
        String periodo;
        
        if (horas == 0) {
            return String.format("12:%02d:%02d am", minutos, segundos);
        } 
        if (horas == 12) {
            return String.format("12:%02d:%02d pm", minutos, segundos);
        } 
        if (horas >= 1 && horas < 12) {
            periodo = "am";
        } else {
            periodo = "pm";
        }
        
        return String.format("%d:%02d:%02d %s", (horas12 == 0 ? 12 : horas12), minutos, segundos, periodo);
    }
}
