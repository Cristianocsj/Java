public class Projeto {
    private int qtdPessoas;
    private float mediaSalarial;
    private float custoPecas;
    
    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        if (qtdPessoas <= 0) {
            throw new IllegalArgumentException("Qtd pessoas deve ser maior que zero");
        }
        this.qtdPessoas = qtdPessoas;
    }

    public float getMediaSalarial() {
        return mediaSalarial;
    }

    public void setMediaSalarial(float mediaSalarial) {
        if (mediaSalarial <= 0) {
            throw new IllegalArgumentException("Média salarial deve ser maior que zero");
        }
        this.mediaSalarial = mediaSalarial;
    }

    public float getCustoPecas() {
        return custoPecas;
    }

    public void setCustoPecas(float custoPecas) {
        if (custoPecas <= 0) {
            throw new IllegalArgumentException("Custo das peças deve ser maior que zero");
        }
        this.custoPecas = custoPecas;
    }

    public float calculaCustoMensal() {
        // 1.2 * quantidade de pessoas * média salarial + 1.7 * custo mensal das peças
        return 1.2f * qtdPessoas * mediaSalarial + 1.7f * custoPecas;
    }

    //Construtor;
    public Projeto(int qtdPessoas, float mediaSalarial, float custoPecas) {
    //     this.qtdPessoas = qtdPessoas;
    //     this.mediaSalarial = mediaSalarial;
    //     this.custoPecas = custoPecas;

        // Ao invés de fazer como acima, chamar os sets que verificam as restriçoes
        setQtdPessoas(qtdPessoas);
        setMediaSalarial(mediaSalarial);
        setCustoPecas(custoPecas);
    }
}
