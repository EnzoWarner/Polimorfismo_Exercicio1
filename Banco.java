import java.util.ArrayList;
import java.util.List;

class Banco {
    private List<InstrumentoFinanceiro> instrumentos;
    private int numInstrumentos;

    public Banco() {
        instrumentos = new ArrayList<>();
        numInstrumentos = 0;
    }

    public void adicionarInstrumento(InstrumentoFinanceiro instrumento) {
        instrumentos.add(instrumento);
        numInstrumentos++;
    }

    public float calcularSaldos() {
        float saldoTotal = 0;
        for (InstrumentoFinanceiro instrumento : instrumentos) {
            saldoTotal += instrumento.calcularSaldoTotal();
        }
        return saldoTotal;
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        Acao acao = new Acao();
        acao.setSaldo(10.0f);
        acao.setCotas(5);

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(1000.0f);
        contaCorrente.setLimite(500.0f);

        FundoDeAplicacao fundoDeAplicacao = new FundoDeAplicacao();
        fundoDeAplicacao.setSaldo(2000.0f);
        fundoDeAplicacao.setRentabilidade(100.0f);

        banco.adicionarInstrumento(acao);
        banco.adicionarInstrumento(contaCorrente);
        banco.adicionarInstrumento(fundoDeAplicacao);

        System.out.println("Saldo total do banco: " + banco.calcularSaldos());
    }
}
// Banco: Gerencia uma lista de InstrumentoFinanceiro e calcula o saldo total de todos os instrumentos adicionados.