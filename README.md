# TodoList Android App

Este é um projeto de aplicativo de lista de tarefas (TodoList) para Android, desenvolvido com as práticas e tecnologias mais recentes do ecossistema Android.

## Status do Projeto

**Configuração Inicial Concluída**

O projeto foi totalmente configurado e está pronto para o desenvolvimento de funcionalidades. As principais tarefas realizadas até o momento incluem:

- Estrutura do projeto Gradle com Kotlin DSL (`.kts`).
- Gerenciamento centralizado de dependências com Gradle Version Catalogs (`libs.versions.toml`).
- Configuração dos plugins essenciais, incluindo KSP (Kotlin Symbol Processing) e Hilt para injeção de dependência.
- Resolução de múltiplos desafios de sincronização do Gradle para garantir um ambiente de build estável.

## Arquitetura e Tecnologias

O projeto está configurado para seguir uma arquitetura moderna e escalável, utilizando as seguintes tecnologias do Jetpack e do ecossistema Kotlin:

- **Linguagem:** 100% [Kotlin](https://kotlinlang.org/)
- **UI:** [Jetpack Compose](https://developer.android.com/jetpack/compose) para uma abordagem de UI declarativa e moderna.
- **Arquitetura:** MVVM (Model-View-ViewModel) com [ViewModels do Jetpack](https://developer.android.com/topic/libraries/architecture/viewmodel).
- **Injeção de Dependência:** [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) para gerenciar dependências de forma robusta e com menos boilerplate.
- **Persistência de Dados:** [Room](https://developer.android.com/training/data-storage/room) para um banco de dados local SQLite seguro e eficiente.
- **Navegação:** [Jetpack Navigation para Compose](https://developer.android.com/jetpack/compose/navigation) para gerenciar a navegação entre as telas do aplicativo.
- **Processamento de Anotações:** [KSP (Kotlin Symbol Processing)](https://kotlinlang.org/docs/ksp-overview.html) para um processamento de anotações mais rápido e eficiente, utilizado pelo Room e Hilt.

## Próximos Passos

Com a base do projeto estabelecida, o foco agora se volta para o desenvolvimento das funcionalidades principais da aplicação, como:

1.  Definir as entidades do banco de dados (Models) e os DAOs (Data Access Objects) com Room.
2.  Criar os Repositórios para abstrair as fontes de dados.
3.  Implementar os ViewModels para gerenciar a lógica de UI.
4.  Construir as telas (Composables) para adicionar, listar e editar tarefas.
