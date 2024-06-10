
public class Historico {

    private double valor;
    private AcaoConta acao;

    public Historico(double valor, AcaoConta acao) {
        this.valor = valor;
        this.acao = acao;

    }

    @Override
    public String toString() {
        return "Historico{" +
                "valor=" + valor +
                ", acao=" + acao +
                '}';
    }

    public double getDescricao() {
        return valor;
    }

    public AcaoConta getAcao() {
        return acao;
    }

}
