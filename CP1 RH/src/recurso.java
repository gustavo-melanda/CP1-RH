class Recurso {

    int id;
    String nomeDoRecurso;
    Categoria categoria; // usando ENUM
    boolean disponivel;
    double valorEstimado;

    public Recurso(int id, String nomeDoRecurso, Categoria categoria, double valorEstimado) {
        this.id = id;
        this.nomeDoRecurso = nomeDoRecurso;
        this.categoria = categoria;
        this.valorEstimado = valorEstimado;
        this.disponivel = true;
    }

    public boolean podeSerAlocado() {
        return disponivel && valorEstimado <= 5000;
    }

    public void exibir() {
        System.out.println("ID: " + id +
                " | Recurso: " + nomeDoRecurso +
                " | Categoria: " + categoria +
                " | Disponível: " + disponivel +
                " | Valor: " + valorEstimado);
    }
}
