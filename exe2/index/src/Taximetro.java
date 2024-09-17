public class Taximetro {
    //Atributos
    private float quilometragem;
    private int bandeira = 1;


    //Gets e Sets
    public void setQuilometragem(float quilometragem) {
        if(quilometragem <= 0){
            throw new IllegalArgumentException("A quilometragem deve ser positiva! ");
        }
        this.quilometragem = quilometragem;
    }
    public void setBandeira(int bandeira) {
        if(bandeira != 1 && bandeira != 2){
            throw new IllegalArgumentException("A bandeira deve ser 1 ou 2");
        }
        this.bandeira = bandeira;
    }
    public float getQuilometragem() {
        return quilometragem;
    }
    public int getBandeira() {
        return bandeira;
    }

    //Métodos
    public float ValorCorrida(){
        /*
         *Bandeira 1:
         * 4.30 + 1.50 * quilometragem
         * 
         * Bandeira 2:
         * 4.30 + 1.70 * quilometragem
        */

        if(bandeira == 1){
            return 4.30f + 1.50f * quilometragem;
        }
        return 4.30f + 1.70f * quilometragem;
    }
    


}
