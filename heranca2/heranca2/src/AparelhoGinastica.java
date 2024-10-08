public class AparelhoGinastica extends Produto{
    private double pesoMaximo;

    //Get
    public double getPesoMaximo() {
        return pesoMaximo;
    }

    //Set
    public void setPesoMaximo(double pesoMaximo) {
        if(pesoMaximo <= 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.pesoMaximo = pesoMaximo;
    }

    public AparelhoGinastica(String info, double preco, int mesesGarantia, double pesoMaximo) {
        super(info, preco, mesesGarantia);
        setPesoMaximo(pesoMaximo);
    }

    public String Descricao(){
        return super.Descricao() + "\nPeso Máximo: " + pesoMaximo + "kg";
    }
}
