public class Empregado {
    private int qtdHorasPSemana;
    private float valorSalarioHora;

    // Gets e Sets
    public int getQtdHorasPSemana() {
        return qtdHorasPSemana;
    }

    public void setQtdHorasPSemana(int qtdHorasPSemana) {
        if (qtdHorasPSemana <= 0) {
            throw new IllegalArgumentException("A quantidade de horas deve ser estabelecida corretamente.");
        }
        this.qtdHorasPSemana = qtdHorasPSemana;
    }

    public float getValorSalarioHora() {
        return valorSalarioHora;
    }

    public void setValorSalarioHora(float valorSalarioHora) {
        if (valorSalarioHora <= 0) {
            throw new IllegalArgumentException("O valor do salário-hora deve ser positivo.");
        }
        this.valorSalarioHora = valorSalarioHora;
    }

    public Empregado() {}

    public Empregado(int qtdHorasPSemana, float valorSalarioHora) {
        setQtdHorasPSemana(qtdHorasPSemana);
        setValorSalarioHora(valorSalarioHora);
    }

    public float RetornoSalarioSemanal() {
        if (qtdHorasPSemana <= 40) {
            return qtdHorasPSemana * valorSalarioHora;
        } else {
            int qtdAdicional = qtdHorasPSemana - 40;
            float percent50 = valorSalarioHora * 0.5f;  // Corrigido o cálculo de 50%
            return (40 * valorSalarioHora) + (qtdAdicional * (valorSalarioHora + percent50)); 
        }
    }
}
