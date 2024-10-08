public class Funcionario extends Pessoa {
    private long registro;
    private double salarioBase;
    private String cargo;
    private int faltas;
    
    public long getRegistro() {
        return registro;
    }
    public void setRegistro(long registro) {
        this.registro = registro;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getFaltas() {
        return faltas;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public Funcionario(String nome, long identidade) {
        super(nome, identidade);
    }

    public Funcionario(String nome, long identidade, long registro, double salarioBase, String cargo) {
        super(nome, identidade);
        // this.registro = registro;
        // this.salarioBase = salarioBase;
        // this.cargo = cargo;
        setRegistro(registro);
        setSalarioBase(salarioBase);
        setCargo(cargo);
    }

    public Funcionario(String nome, long identidade, long registro, double salarioBase, String cargo, int faltas) {
        // super(nome, identidade);
        // this.registro = registro;
        // this.salarioBase = salarioBase;
        // this.cargo = cargo;
        // this.faltas = faltas;
        this(nome, identidade, registro, salarioBase, cargo);
        setFaltas(faltas);
    }

    public double salarioLiquido() {
        return (salarioBase - faltas * salarioBase / 30) * 0.8;
    }

    public void print() {
        super.print();
        System.out.println("Registro: " + registro);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário Líquido: " + salarioLiquido());
    }    
}
