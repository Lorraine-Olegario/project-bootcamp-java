import java.util.ArrayList;
import java.util.List;

public class HistoricoLista {

    private List<Historico> historicoTransacoesList;

    public HistoricoLista() {
        this.historicoTransacoesList = new ArrayList<>();
    }

    public void add(double valor, AcaoConta acao) {
        historicoTransacoesList.add(new Historico(valor, acao));
    }

    public void exibir() {
        System.out.println(historicoTransacoesList);
    }
}
