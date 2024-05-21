class FundoDeAplicacao extends InstrumentoFinanceiro {
    private float rentabilidade;

    public void setRentabilidade(float rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    @Override
    public float calcularSaldoTotal() {
        return saldo + rentabilidade;
    }
}
// FundoDeAplicacao: Herda de InstrumentoFinanceiro e implementa o método calcularSaldoTotal considerando a rentabilidade.