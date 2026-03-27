public class alocacao {

    int colaboradorId;
    int recursoId;
    String data;
    String observacao;

    public alocacao(int colaboradorId, int recursoId, String data, String observacao) {
        this.colaboradorId = colaboradorId;
        this.recursoId = recursoId;
        this.data = data;
        this.observacao = observacao;
    }

    public void exibir() {
        System.out.println("Colaborador ID: " + colaboradorId +
                " | Recurso ID: " + recursoId +
                " | Data: " + data +
                " | Obs: " + observacao);
    }
}