public class InfoCliente {
    private String nome;
    private String endereco;
    private int cep;
    private String estado;
    private String pais;
    private String email;

    // Getters
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getCep() {
        return cep;
    }
    public String getEstado() {
        return estado;
    }
    public String getPais() {
        return pais;
    }
    public String getEmail() {
        return email;
    }

    // Setters
    public void setNome(String nome) {
        if(nome.length() == 0) {
            throw new IllegalArgumentException("É preciso digitar algo.");
        }
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        if(endereco.length() == 0) {
            throw new IllegalArgumentException("É preciso digitar algo.");
        }
        this.endereco = endereco;
    }
    public void setCep(int cep) {
        if(cep < 0) {
            throw new IllegalArgumentException("Não pode existir um CEP negativo.");
        }
        this.cep = cep;
    }
    public void setEstado(String estado) {
        if(estado.length() == 0) {
            throw new IllegalArgumentException("É preciso digitar algo.");
        }
        this.estado = estado;
    }
    public void setPais(String pais) {
        if(pais.length() == 0) {
            throw new IllegalArgumentException("É preciso digitar algo.");
        }
        this.pais = pais;
    }
    public void setEmail(String email) {
        if(email.length() == 0) {
            throw new IllegalArgumentException("É preciso digitar algo.");
        }
        this.email = email;
    }

    public InfoCliente(String nome, String endereco, int cep, String estado, String pais, String email) {
        setCep(cep);
        setEmail(email);
        setEndereco(endereco);
        setEstado(estado);
        setNome(nome);
        setPais(pais);
    }

    public InfoCliente(){}

    public String MensagemRetorno() {
        if(pais.equals("Brasil")) {
            return "É um prazer divulgar seu perfil, Sr(a) " + nome;
        } else {
            return "It is a pleasure to share your profile, Mr(s). " + nome;
        }
    }
}
