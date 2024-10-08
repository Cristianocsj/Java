public class Apartamento extends Imovel {
    public Apartamento(String endereco, int numQuartos, int numBanheiros, double area) {
        super(endereco, numQuartos, numBanheiros, area);
    }

    @Override
    public double calculaAluguel() {
        return 5 * getArea() + 100 * getNumQuartos() + 50 * getNumBanheiros();
    }
}