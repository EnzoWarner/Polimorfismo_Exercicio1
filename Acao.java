class Acao extends InstrumentoFinanceiro {
    private int cotas;

    public void setCotas(int cotas) {
        this.cotas = cotas;
    }

    @Override
    public float calcularSaldoTotal() {
        return cotas * saldo;
    }
}
// Acao: Herda de InstrumentoFinanceiro e implementa o método calcularSaldoTotal considerando o número de cotas.