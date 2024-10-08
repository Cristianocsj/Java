public class Inquilino {
    private String nome;
    private String cpf;
    private Imovel imovel;
    
    public Inquilino(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
        this.imovel = null;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void alugaImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public void liberaImovel() {
        this.imovel = null;
    }

    public String dadosBoleto() {
        if (imovel == null) {
            return "";
        } else {
            return nome + " - " + imovel.getEndereco() + " - R$" + imovel.calculaAluguel();
        }
    }
    
}
