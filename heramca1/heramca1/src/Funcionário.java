public class Funcionário extends Pessoa{
    private String cargo;
    private float salario;

    //Construtores
    public Funcionário(String nome, int codigo, String endereco, String cargo, float salario) {
        super(nome, codigo, endereco);
        setCargo(cargo);
        setSalario(salario);
    }
    public Funcionário() {}

    //Getters
    public String getCargo() {
        return cargo;
    }
    public float getSalario() {
        return salario;
    }

    //Setters
    public void setCargo(String cargo) {
        if(cargo.length() == 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.cargo = cargo;
    }
    public void setSalario(float salario) {
        if(salario < 0){
            throw new IllegalArgumentException("ERRO!");
        }
        this.salario = salario;
    }

    //Método para exibir dados
    public void ExibeDados(){
        super.ExibeDados();
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
    }
}
