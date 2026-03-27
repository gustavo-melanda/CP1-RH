import java.util.ArrayList;

class SistemaERS {

    ArrayList<Colaborador> colaboradores = new ArrayList<>();
    ArrayList<Recurso> recursos = new ArrayList<>();
    ArrayList<alocacao> alocacoes = new ArrayList<>();

    public void cadastrarColaborador(Colaborador c) {
        colaboradores.add(c);
    }

    public void cadastrarRecurso(Recurso r) {
        recursos.add(r);
    }

    public Colaborador buscarColaborador(int id) {
        for (Colaborador c : colaboradores) {
            if (c.id == id) return c;
        }
        return null;
    }

    public Recurso buscarRecurso(int id) {
        for (Recurso r : recursos) {
            if (r.id == id) return r;
        }
        return null;
    }

    public void alocarRecurso(int colaboradorId, int recursoId) {

        Colaborador c = buscarColaborador(colaboradorId);
        Recurso r = buscarRecurso(recursoId);

        if (c == null || r == null) {
            System.out.println("Erro: Colaborador ou recurso não encontrado.");
            return;
        }

        if (!c.ativo) {
            System.out.println("Colaborador inativo não pode receber recursos.");
            return;
        }

        if (!r.disponivel) {
            System.out.println("Recurso já está alocado.");
            return;
        }

        if (r.valorEstimado > 5000) {
            System.out.println("Recurso exige autorização especial!");
            return;
        }

        if (r.podeSerAlocado()) {
            r.disponivel = false;
            alocacoes.add(new alocacao(colaboradorId, recursoId, "26/03/2026", "Alocação padrão"));
            System.out.println("Recurso alocado com sucesso!");
        }
    }

    public void devolverRecurso(int recursoId) {
        Recurso r = buscarRecurso(recursoId);

        if (r != null) {
            r.disponivel = true;
            System.out.println("Recurso devolvido com sucesso!");
        }
    }

    public void listarColaboradores() {
        for (Colaborador c : colaboradores) {
            c.exibir();
        }
    }

    public void listarRecursos() {
        for (Recurso r : recursos) {
            r.exibir();
        }
    }

    public void listarAlocacoes() {
        for (alocacao a : alocacoes) {
            a.exibir();
        }
    }
}