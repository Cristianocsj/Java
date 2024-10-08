public class Eletronico extends Produto{
    private int voltagem;

    //Get
    public int getVoltagem() {
        return voltagem;
    }

    //Set
    public void setVoltagem(int voltagem) {
        if(voltagem < 0){
            throw new IllegalArgumentException("ERRO!");
        }
        setVoltagem(voltagem);
    }

    public Eletronico(String info, double preco, int mesesGarantia, int voltagem) {
        super(info, preco, mesesGarantia);
        this.voltagem = voltagem;
    }

    public String Descricao(){
        return super.Descricao() + "\nVoltagem: " + voltagem + "V";
    }

}
