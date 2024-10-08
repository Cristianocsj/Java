public abstract class Pessoa { // Classe abstrata significa que não se pode instanciar um objeto dela
    private String nome;
    private long identidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome == null || nome.length() == 0) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }
    public long getIdentidade() {
        return identidade;
    }
    public void setIdentidade(long identidade) {
        if (identidade <= 0) {
            throw new IllegalArgumentException("Identidade negativa");
        }
        this.identidade = identidade;
    }

    // Criado um construtor com 2 parâmetros
    public Pessoa(String nome, long identidade) {
        // setNome(nome);
        // setIdentidade(identidade);
        setDados(nome, identidade);
    }

    // A partir do momento que se criar um construtor com parâmetros numa classe,
    // o construtor sem parâmetros SÓ existirá se ele for explicitamente declarado
    public Pessoa() {}
    
    public void setDados(String nome, long identidade) {
        setNome(nome);
        setIdentidade(identidade);
    }
    
    public void print() {
        System.out.println("**********************************");
        System.out.println(getClass().getName()); // Reflexão
        System.out.println("Nome: " + nome);
        System.out.println("Identidade: " + identidade);
    }
}
