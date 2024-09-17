public class App {
    public static void main(String[] args) throws Exception {
    
        // Ao instanciar um objeto de uma classe, eu tenho que respeitar
        // os construtores existentes em relação aos parâmetros.
        // Para a classe Teste eu tenho 4 construtores:
        // 1 sem parâmetros
        // 1 com 1 parâmetro inteiro
        // 1 com 1 parâmetro float
        // 1 com 3 parâmetros, na ordem, int, float e boolean

        Teste t1 = new Teste();
        Teste t2 = new Teste(5);
        Teste t3 = new Teste(3.5f);
        //Teste t4 = new Teste(false); Erro porque não existe construtor com um parametro booleano
        Teste t5 = new Teste(1, 2.2f, false);
        //Teste t6 = new Teste(1, 4.5f); Erro porque não existe construtor com 2 parâmetros
    }
}
