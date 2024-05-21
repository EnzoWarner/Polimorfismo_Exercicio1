abstract class InstrumentoFinanceiro {
    protected float saldo;

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public abstract float calcularSaldoTotal();
}
// InstrumentoFinanceiro: Classe base abstrata com métodos para definir e obter saldo e um método abstrato para calcular o saldo total.