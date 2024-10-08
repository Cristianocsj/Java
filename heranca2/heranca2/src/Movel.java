public class Movel extends Produto{
    private String cor;

    //Get
    public String getCor() {
        return cor;
    }

    //Set
    public void setCor(String cor) {
        if(cor.length() == 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.cor = cor;
    }

    

    public Movel(String info, double preco, int mesesGarantia, String cor) {
        super(info, preco, mesesGarantia);
        setCor(cor);
    }

    public String Descricao(){
        return super.Descricao() + "\nCor: " + cor;
    }
}
