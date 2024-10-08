public abstract class Produto {
    private String info;
    private double preco;
    private int mesesGarantia;

    //Getters
    public String getInfo() {
        return info;
    }
    public double getPreco() {
        return preco;
    }
    public int getMesesGarantia() {
        return mesesGarantia;
    }

    
    //Setters
    public void setInfo(String info) {
        if(info.length() == 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.info = info;
    }
    public void setPreco(double preco) {
        if(preco < 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.preco = preco;
    }
    public void setMesesGarantia(int mesesGarantia) {
        if(mesesGarantia < 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.mesesGarantia = mesesGarantia;
    }

    //Construtor
    public Produto(String info, double preco, int mesesGarantia) {
        setInfo(info);
        setPreco(preco);
        setMesesGarantia(mesesGarantia);
    }

    public String Descricao(){
        return "\nInfo: " + info + "\nPreço: " + preco + "\nMeses de Garantia: " + mesesGarantia;
    }
}
