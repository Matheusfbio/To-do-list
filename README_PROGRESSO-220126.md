## Introdução ao MVVM no Android

• Importância da arquitetura MVVM na estruturação de aplicativos Android  
– Permite uma melhor separação de camadas (UI, lógica de apresentação, dados)  
– Facilita manutenção e escalabilidade em projetos Android

• Capacidades da camada de dados antes de implementar MVVM  
– Inserir e recuperar dados do banco de dados

## Organização dos Pacotes

• Criação de pacotes para cada funcionalidade no projeto  
– Exemplo: Pacote `addEdit` para gerenciamento da tela de adição/edição de tarefas  
– Move arquivos específicos para seus respectivos pacotes para melhor organização

## Criação do ViewModel

• Implementação do `addEditViewModel`  
– Herança da classe ViewModel dos componentes de arquitetura do Android  
– Importância de usar a interface de repositório, não a implementação concreta  
– Facilita a troca de implementações no futuro sem impactar o ViewModel

## Gerenciamento de Estado da UI

• Gestão de estado dos campos de entrada (title e description)  
– Uso de `mutableStateOf` para gerenciar o estado dos campos  
– Evita perda de dados em casos como rotação de tela

• Definição das variáveis `title` e `description` no ViewModel  
– `title` com valor padrão vazio  
– `description` pode ser nulo, definida como uma string opcional

## Eventos e Ações

• Implementação de eventos na UI  
– Criação de uma interface selada `AddEditEvent` para encapsular ações da UI  
– Exemplo de ações: `TitleChanged`, `DescriptionChanged`, `Save`

• Implementação da função `onEvent` para lidar com os eventos disparados  
– Cada evento é tratado através de uma estrutura de controle  
– Atualização do estado correspondente no ViewModel com base no evento

## Inserção de Dados no Banco

• Função privada `saveToDo` para inserir dados no banco  
– Importância de gerenciar chamadas assíncronas utilizando coroutines  
– Verificação do campo `title` para garantir que não esteja vazio antes da inserção

• Estrutura de controle para tratamento de erros  
– Implementação de notificações para campos obrigatórios (ex: título não pode ser vazio)

## Injeção de Dependência Manual

• Demonstração de injeção de dependência sem bibliotecas externas  
– Criação do ViewModel com dependências necessárias  
– Instanciação do repositório e banco de dados diretamente no ViewModel  
– Abordagem manual para compreensão do processo de injeção de dependência

## Fluxo de Dados Unidirecional

• Implementação do padrão de fluxo de dados unidirecional  
– O estado desce do ViewModel para a UI, enquanto as ações sobem da UI para o ViewModel  
– Uso de `compose` para reagir a alterações de estado de forma automática

## Testando a Funcionalidade

• Execução do aplicativo para testar a inserção de tarefas  
– Validação de que tanto a UI quanto a lógica de dados estão funcionando em conjunto de forma correta  
– Uso da ferramenta App Inspection para verificar os dados inseridos na tabela

## Implementação de Feedbacks e Navegação

• Implementação de Snackbar para feedback ao usuário  
– Uso de `Scaffold` para mostrar Snackbar em resposta a eventos  
– Passagem do estado do Snackbar entre as camadas da aplicação

• Navegação utilizando o NavController  
– Implementação de navegação após a inserção bem-sucedida de tarefas  
– Demonstração prática de como a tela navega para a tela anterior com base nos eventos do ViewModel

## Finalização da Aula

• Validação dos requisitos funcionais através de testes executando o app  
– Confirmação de que a Snackbar aparece para validação de erros ao tentar cadastrar sem um título  
– Preparação para a próxima aula após a implementação completa da tela de cadastro