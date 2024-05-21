class ContaCorrente extends InstrumentoFinanceiro {
    private float limite;

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public float calcularSaldoTotal() {
        return saldo + limite;
    }
}
// ContaCorrente: Herda de InstrumentoFinanceiro e implementa o método calcularSaldoTotal considerando o limite.