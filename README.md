# CP1-RH

 Contexto Empresarial

Em empresas modernas, existe a necessidade de controlar colaboradores e recursos internos, como notebooks, celulares e equipamentos. Sistemas corporativos são utilizados para garantir organização, segurança e rastreabilidade desses ativos.

O ERS foi desenvolvido para simular esse cenário, aplicando conceitos reais de gestão de pessoas e controle de recursos.

---

Diagrama de Classes (Simples)

Colaborador

* id
* nome
* cargo
* salario
* ativo
* dataDeAdmissao

Recurso

* id
* nomeDoRecurso
* categoria (ENUM)
* disponivel
* valorEstimado

Alocacao

* colaboradorId
* recursoId
* data
* observacao

SistemaERS

* lista de colaboradores
* lista de recursos
* lista de alocações

Relacionamentos:

* Colaborador ↔ Alocacao
* Recurso ↔ Alocacao

---

 Regras de Negócio

* Colaboradores são criados como ativos por padrão
* Apenas colaboradores ativos podem receber recursos
* Um recurso só pode ser alocado se estiver disponível
* Recursos com valor acima de 5000 não podem ser alocados automaticamente
* Recursos podem ser devolvidos e voltar a ficar disponíveis

---
 Inovação Implementada

Foi utilizado **ENUM (Categoria)** para definir os tipos de recursos (NOTEBOOK, CELULAR, etc.), garantindo padronização e evitando erros de digitação, prática comum em sistemas corporativos.

---
 Link do Repositório
	
https://github.com/gustavo-melanda/CP1-RH.git



Grupo: 
Gustavo melanda RM 556081
Felipe Cordeiro RM 566518
