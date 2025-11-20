# 📝 Projeto Lista de Tarefas — Início do Aprendizado Java

Este repositório contém um projeto inicial de **Lista de Tarefas em Java**, desenvolvido como parte do aprendizado da linguagem.  
A ideia é evoluir este projeto simples para, futuramente, construir um **programa de controle de despesas pessoais**, que permita registrar, listar e gerenciar informações de forma estruturada.

---

## 📌 Estrutura do Projeto

O projeto é composto por duas classes principais:

1. **ListaDeTarefa**  
2. **ListaDeTarefasMain**

---

### 1️⃣ ListaDeTarefa

**Objetivo:** Gerenciar uma lista de tarefas de forma simples, permitindo adicionar, listar e remover tarefas.  

**Funcionalidades principais:**

- Adicionar novas tarefas informadas pelo usuário.  
- Listar todas as tarefas, numeradas para facilitar a visualização.  
- Remover tarefas pelo número exibido na lista (com validação de entrada).  
- Evitar a inserção de tarefas vazias ou compostas apenas por espaços.  
- Verificar se a lista está vazia antes de tentar remover tarefas.  

**Trecho de aprendizado técnico:**

- Manipulação de **ArrayList** para armazenamento dinâmico de tarefas.  
- Estruturação de métodos separados para cada funcionalidade (adicionar, remover, listar).  
- Boas práticas de **encapsulamento** (atributos privados e métodos públicos).  

---

### 2️⃣ ListaDeTarefasMain

**Objetivo:** Controlar a interação com o usuário por meio de um menu interativo.  

**Funcionalidades principais:**

- Menu interativo que lista as opções: adicionar tarefa, remover tarefa, listar tarefas e sair.  
- Leitura de entradas do usuário usando **Scanner**.  
- Tratamento de erros de entrada, permitindo que o programa continue rodando mesmo se o usuário digitar valores inválidos.  
- Permitir que o usuário digite `"sair"` a qualquer momento para encerrar o programa.  
- Loop contínuo até o usuário escolher encerrar (opção 4 ou `"sair"`).  

**Trecho de aprendizado técnico:**

- Uso de **loops while** para repetição até condição de saída.  
- Uso de **switch-case** para selecionar ações com base na opção do usuário.  
- Tratamento de exceções com **try-catch** para entradas inválidas.  
- Comparação de strings com **equalsIgnoreCase** para aceitar diferentes formas de saída (`"Sair"`, `"SAIR"`, `"sair"`).

---

## 📚 O que foi aprendido

Durante o desenvolvimento deste projeto, os principais conceitos praticados foram:

- **Entrada e saída de dados**
  - Uso da classe **Scanner** para capturar dados do usuário.  
  - Validação de entradas incorretas e tratamento de exceções.  

- **Estruturas de controle**
  - Loops **while** para repetição de operações.  
  - Condições **if** e **switch-case** para lógica do menu.  

- **Tratamento de exceções**
  - Evitar erros em tempo de execução com **try-catch**.  
  - Garantir que o programa continue rodando mesmo após entradas inválidas.  

- **Modularização e boas práticas**
  - Separação de funções em métodos específicos (adicionar, remover, listar).  
  - Encapsulamento de dados com atributos privados.  
  - Fechamento do **Scanner** no final do programa.  
  - Mensagens claras e instruções amigáveis para o usuário.  

---

## 🔜 Próximos passos

Este projeto será expandido para se tornar parte de um sistema maior, que permitirá:

- Inserir e gerenciar tarefas de forma mais elaborada.  
- Aplicar conceitos de **POO** (Programação Orientada a Objetos) de forma mais complexa.  
- Evoluir para projetos de controle de despesas, permitindo registrar, listar e calcular gastos pessoais.
