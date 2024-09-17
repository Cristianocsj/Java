public class AparelhoEletronico {
    //Atributos
    private String tipoAparelho;
    private float consumoMedio;
    private int voltagem;

    //Gets
    public String getTipoAparelho() {
        return tipoAparelho;
    }
    public float getConsumoMedio() {
        return consumoMedio;
    }
    public int getVoltagem() {
        return voltagem;
    }

    //Sets
    public void setTipoAparelho(String tipoAparelho) {
        if(tipoAparelho.length() == 0){
            throw new IllegalArgumentException("É preciso digitar o tipo do aparelho.");
        }
        this.tipoAparelho = tipoAparelho;
    }
    public void setConsumoMedio(float consumoMedio) {
        if(consumoMedio <= 0){
            throw new IllegalArgumentException("O consumo médio de um aparelho precisa ser superior a 0 kwatts.");
        }
        this.consumoMedio = consumoMedio;
    }
    public void setVoltagem(int voltagem) {
        if(voltagem != 110 && voltagem != 220){
            throw new IllegalArgumentException("A voltagem precisa ser 110 ou 220.");
        }
        this.voltagem = voltagem;
    }

    //Métodos
    public float ValorConsumidoReais(float quantidadeHoras, float kwatt){
        return quantidadeHoras * kwatt * consumoMedio;
    }

}
