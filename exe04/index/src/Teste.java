public class Teste {
    private int a;
    private float b;
    private boolean c;

    // Construtor sem parametros
    public Teste() {
        a = 1; // Se eu não fizer isso, a começa com 0
        b = 10; // Se eu não fizer isso, b começa com 0
        c = true; // Se eu não fizer isso, c começa com false
    }

    // Posso ter mais de um construtor
    public Teste(int x) {
        this(); // chama o construtor sem parametros para iniciar b e c
                // o a também será iniciado, mas o set abaixo altera o valor 
                // de a

        setA(x); // chamar o set do atributo pois se houver verificação, será
                 // implementado no set
    }

    // Outro constutor com 1 parametro só é possível se o tipo do parametro
    // for diferente do outro construtor (no anterior x é int e nesse abaixo x
    // é float)
    public Teste(float x) {
        this();

        setB(x);
    }

    // O construtor abaixo não é permitido pois já existe um construtor
    // com um parâmetro inteiro (o nome do parametro não faz diferença)
    // public Teste(int a) {

    // }

    // Exemplo de um construtor com 3 parâmetros
    public Teste(int x, float y, boolean z) {
        setA(x);
        setB(y);
        setC(z);
    }    

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }
    public boolean isC() {
        return c;
    }
    public void setC(boolean c) {
        this.c = c;
    }

    

}
