public class Main {

    public static void main(String[] args) {

        SistemaERS sistema = new SistemaERS();

        // Colaboradores
        sistema.cadastrarColaborador(new Colaborador(1, "Gustavo", "Dev Junior", 3000, "2026-01-01"));
        sistema.cadastrarColaborador(new Colaborador(2, "Ana", "Analista", 4000, "2025-12-01"));

        // Recursos (usando ENUM)
        sistema.cadastrarRecurso(new Recurso(1, "Notebook Dell", Categoria.NOTEBOOK, 4500));
        sistema.cadastrarRecurso(new Recurso(2, "iPhone 14", Categoria.CELULAR, 7000));
        sistema.cadastrarRecurso(new Recurso(3, "Monitor LG", Categoria.MONITOR, 1200));

        // Testes
        sistema.alocarRecurso(1, 1); // OK
        sistema.alocarRecurso(1, 2); // BLOQUEADO (valor alto)
        sistema.alocarRecurso(2, 3); // OK

        System.out.println("\n--- COLABORADORES ---");
        sistema.listarColaboradores();

        System.out.println("\n--- RECURSOS ---");
        sistema.listarRecursos();

        System.out.println("\n--- ALOCAÇÕES ---");
        sistema.listarAlocacoes();

        // Devolução
        sistema.devolverRecurso(1);

        System.out.println("\n--- RECURSOS APÓS DEVOLUÇÃO ---");
        sistema.listarRecursos();
    }
}