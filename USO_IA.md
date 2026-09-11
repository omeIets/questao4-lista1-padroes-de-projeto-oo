# Relatório de Utilização de Inteligência Artificial

## 1. Objetivo
Este documento detalha o processo de utilização de Inteligência Artificial (IA) como ferramenta de apoio para a resolução da questão sobre o padrão de projeto **Factory Method**. A IA atuou como um assistente técnico (*pair programming* e tutoria), auxiliando na geração de artefatos visuais e adequação às rigorosas práticas de controle de versão exigidas.

## 2. Etapas de Desenvolvimento com Suporte da IA

### 2.1. Implementação do Código Fonte
Em vez de solicitar o código completo de uma vez, a abordagem foi progressiva e focada na simplicidade ("tão simples quanto possível", conforme o enunciado).
- **Apoio da IA:** Fornecimento de fragmentos de código em Java focados exclusivamente na lógica do padrão, garantindo que o Princípio do Aberto-Fechado (OCP) fosse respeitado (permitindo adicionar o Rio de Janeiro sem alterar a base).
- **Prompts utilizados:**"preciso fazer uma lista de exercicios sobre padroes de projeto orientados a objetos e tenho essa questao, me dê um passo a passo para eu resolver ela por completo [seguido do texto da questão do jogo]"
- **Ajustes de resposta da IA:** O código sugerido pela Inteligência Artificial não era tão completo na demonstração do método e suas divisões como o exemplo da pizzaria fornecida na aula sobre o assunto, por isso utilizei apenas como base para implementação dos métodos e ajustei tomando como base a lógica do código da pizzaria.

### 2.2. Gestão de Versão e Commits Atômicos (Requisito Crítico)
Uma parte fundamental do trabalho era garantir que o histórico de commits contasse a evolução da solução.
- **Apoio da IA:** A IA estruturou um plano de **Commits Atômicos**, sugerindo mensagens semânticas (`feat`, `docs`, `test`, `fix`) para cada pequena alteração.
- **Prompts utilizados:** "como posso garantir isso? [seguido das regras do professor sobre o histórico do repositório]"

### 2.3. Elaboração da Documentação
A IA foi fundamental para a criação e estruturação da documentação do projeto, garantindo uma apresentação profissional do repositório.
- **Criação do README:** Geração do arquivo `README.md` contendo a explicação do problema, o mapeamento dos papéis do *Factory Method* na solução e as instruções de execução.
- **Adaptação à Solução Real:** Refinamento do texto do README para espelhar exatamente o diagrama definitivo criado no Draw.io, ajustando os nomes das classes (ex: `AnimaisMutantes`, `Criminosos`, `LocalJogo`) para alinhar a documentação ao código entregue.
- **Estruturação de Relatórios:** Auxílio na redação deste próprio documento de metadados (`USO_IA.md`), sumarizando a interação e listando os *prompts* utilizados.
- **Prompts utilizados:** "vamos fazer o readme, tenho a imagem do diagrama na pasta src" "ajuste para o meu diagrama real: [seguido do anexo da imagem do diagrama]" "pronto, agora vamos fazer outro md explicando como fiz a utilizacao de ia para resovler a questao"
