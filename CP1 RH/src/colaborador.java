class Colaborador {

    int id;
    String nome;
    String cargo;
    double salario;
    boolean ativo;
    String dataDeAdmissao;

    public Colaborador(int id, String nome, String cargo, double salario, String dataDeAdmissao) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissao;
        this.ativo = true; // regra de negócio
    }

    public void promover(String novoCargo, double novoSalario) {
        this.cargo = novoCargo;
        this.salario = novoSalario;
    }

    public void desativar() {
        this.ativo = false;
    }

    public void exibir() {
        System.out.println("ID: " + id +
                " | Nome: " + nome +
                " | Cargo: " + cargo +
                " | Salário: " + salario +
                " | Ativo: " + ativo);
    }
}