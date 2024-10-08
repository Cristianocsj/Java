public class Casa extends Imovel {
    private double areaTerreno;

    //Construtor
    public Casa(String endereco, int numQuartos, int numBanheiros, double area, double areaTerreno) {
        super(endereco, numQuartos, numBanheiros, area);
        setAreaTerreno(areaTerreno);
    }

    //Get
    public double getAreaTerreno() {
        return areaTerreno;
    }

    //Set
    public void setAreaTerreno(double areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    @Override
    public double calculaAluguel() {
        return 4 * getArea() + 2 * areaTerreno + 100 * getNumQuartos() + 40 * getNumBanheiros();
    }
    
}
