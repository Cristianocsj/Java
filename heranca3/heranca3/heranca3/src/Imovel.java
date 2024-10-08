public abstract class Imovel {
    private String endereco;
    private int numQuartos;
    private int numBanheiros;
    private double area;

    //Construtor
    public Imovel(String endereco, int numQuartos, int numBanheiros, double area) {
        setEndereco(endereco);
        setNumQuartos(numQuartos);;
        setNumBanheiros(numBanheiros);;
        setArea(area);;
    }
    public Imovel(){}

    //Getters
    public String getEndereco() {
        return endereco;
    }
    public int getNumQuartos() {
        return numQuartos;
    }
    public int getNumBanheiros() {
        return numBanheiros;
    }
    public double getArea() {
        return area;
    }

    //Setters
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }
    public void setNumBanheiros(int numBanheiros) {
        this.numBanheiros = numBanheiros;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public abstract double calculaAluguel();

}
