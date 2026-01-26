# To do List Android App

Este é um projeto de aplicativo de lista de tarefas (TodoList) para Android, desenvolvido com as práticas e tecnologias mais recentes do ecossistema Android.


https://github.com/user-attachments/assets/fe01094b-640f-4c26-b3e3-b40e0e8dfbeb


## Status do Projeto

**Funcionalidades Iniciais Implementadas**

A estrutura inicial do aplicativo está funcional. As principais funcionalidades e componentes implementados incluem:

- **Configuração de Build:** Estrutura Gradle com Kotlin DSL, Version Catalogs, KSP e Hilt.
- **Persistência de Dados:** Entidade `TodoEntity` e `TodoDao` configurados com Room para operações de banco de dados.
- **Arquitetura MVVM:**
    - `TodoRepository` para abstrair a fonte de dados.
    - `ListViewModel` para gerenciar o estado e a lógica da UI da lista de tarefas.
- **Interface de Usuário (UI):**
    - Tela principal (`ListScreen`) construída com Jetpack Compose para exibir a lista de tarefas.
    - Navegação básica configurada com `Navigation for Compose`.
    - Tema dinâmico (Claro/Escuro) com controle da barra de status.
- **Funcionalidades Básicas:** Listagem de tarefas e atualização do status de "concluído".

## Arquitetura e Tecnologias

O projeto está configurado para seguir uma arquitetura moderna e escalável, utilizando as seguintes tecnologias do Jetpack e do ecossistema Kotlin:

- **Linguagem:** 100% [Kotlin](https://kotlinlang.org/)
- **UI:** [Jetpack Compose](https://developer.android.com/jetpack/compose) para uma abordagem de UI declarativa e moderna.
- **Arquitetura:** MVVM (Model-View-ViewModel) com [ViewModels do Jetpack](https://developer.android.com/topic/libraries/architecture/viewmodel).
- **Injeção de Dependência:** [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) para gerenciar dependências de forma robusta e com menos boilerplate.
- **Persistência de Dados:** [Room](https://developer.android.com/training/data-storage/room) para um banco de dados local SQLite seguro e eficiente.
- **Navegação:** [Jetpack Navigation para Compose](https://developer.android.com/jetpack/compose/navigation) para gerenciar a navegação entre as telas do aplicativo.
- **Processamento de Anotações:** [KSP (Kotlin Symbol Processing)](https://kotlinlang.org/docs/ksp-overview.html) para um processamento de anotações mais rápido e eficiente, utilizado pelo Room.
- **UI Asíncrona:** [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) e [Flow](https://developer.android.com/kotlin/flow) para gerenciar operações de background e atualizações de UI.

## Próximos Passos

Com a base funcional estabelecida, o foco agora se volta para a expansão e refinamento das funcionalidades:

1.  **Testes:** Adicionar testes unitários para ViewModels e Repositórios, e testes de UI para os Composables.
2.  **Gerenciamento de Estado Avançado:** Refinar o gerenciamento de eventos da UI (`UiEvent`) e o estado da tela.
