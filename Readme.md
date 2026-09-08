# Boas Práticas de Software - Atividade Prática

Projeto desenvolvido para a disciplina **Manutenção e Configuração de Software**,
aplicando boas práticas de código e controle de versão com Git.

## Questão final

**1. Qual era o principal problema do código original?**

O código funcionava, mas tinha baixa legibilidade e organização. As
variáveis usavam nomes genéricos e sem significado (`n`, `a`, `b`, `c`),
e todo o processamento (cálculo, verificação e exibição do resultado)
estava concentrado em um único método `main`, misturando responsabilidades
diferentes no mesmo bloco de código.

**2. Quais melhorias você realizou?**

- Renomeei as variáveis para nomes descritivos (`nomeAluno`, `nota1`,
  `nota2`, `media`).
- Criei uma classe separada, `Calcular`, responsável apenas pelo cálculo
  da média.
- Encapsulei os dados dessa classe: `nota1` e `nota2` são atributos
  privados, acessados por meio de métodos `get`/`set`.
- O método `media()` também é privado e só é usado internamente pela
  própria classe, através do método público `getMedia()`.
- Padronizei nomes (camelCase), indentação e a organização dos arquivos.

**3. Como a modularização facilitou a organização do código?**

Separar o cálculo da média em uma classe própria (`Calcular`) fez com
que o `Sistema` deixasse de se preocupar em como a média é calculada,
apenas usando o resultado. Isso divide responsabilidades: uma classe
cuida do cálculo, e a outra cuida do fluxo principal do programa. Se a
regra de cálculo mudar no futuro, só é necessário alterar a classe
`Calcular`, sem risco de afetar o restante do sistema.

**4. Como o Git ajudou a controlar as alterações realizadas no sistema?**

O Git permitiu registrar o histórico de todas as mudanças feitas no
código, guardando o estado original antes das melhorias. O uso de uma
branch separada (`melhoria-boas-praticas`) possibilitou aplicar as
alterações sem impactar diretamente a versão principal (`main`), e o uso
de Pull Request permitiu revisar as mudanças antes de integrá-las
definitivamente ao projeto por meio do merge.