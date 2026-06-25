# Relatorio de Testes - Calculadora Java

## Identificacao

- Responsavel: Matheus Vasco
- Data da validacao: 25/06/2026
- Projeto: Calculadora Java
- Objetivo: testar as funcionalidades entregues pelos demais integrantes e registrar problemas encontrados.

## Resumo da Execucao

Foram executados testes de compilacao, testes automatizados das classes de operacao e testes manuais simulados pelo menu.

Resultado geral: aprovado parcialmente.

As classes de operacao funcionam isoladamente, porem a versao integrada pelo menu ainda nao esta totalmente aprovada, porque o menu exibe mensagens de chamada em vez de mostrar o resultado calculado pelas classes.

Esta validacao foi feita sobre os arquivos presentes no repositorio local no momento do teste. O objetivo foi verificar a qualidade da versao atual antes de uma possivel baseline final, conforme a responsabilidade de QA definida no PCM.

## Comandos Executados

```bash
javac Main.java menu.java Soma.java Subtracao.java Multiplicacao.java Divisao.java TestesCalculadora.java
java TestesCalculadora
java Main
java menu
```

## Casos Testados

| ID | Caso | Resultado esperado | Resultado obtido | Status |
| --- | --- | --- | --- | --- |
| CT-01 | Classe `Soma`: 2 + 2 | 4 | 4.0 | Aprovado |
| CT-02 | Classe `Subtracao`: 5 - 3 | 2 | 2.0 | Aprovado |
| CT-03 | Classe `Multiplicacao`: 4 * 3 | 12 | 12.0 | Aprovado |
| CT-04 | Classe `Divisao`: 10 / 2 | 5 | 5.0 | Aprovado |
| CT-05 | Classe `Divisao`: 10 / 0 | Erro | Excecao `IllegalArgumentException` | Aprovado |
| CT-06 | `Main.java` | Abrir a calculadora funcional | Exibe apenas menu resumido com itens em desenvolvimento | Reprovado |
| CT-07 | Menu - soma | Exibir resultado 4.0 | Exibe apenas mensagem `[Menu] Aqui chamara: Soma.somar(...)` | Reprovado |
| CT-08 | Menu - subtracao | Exibir resultado 2.0 | Exibe apenas mensagem `[Menu] Aqui chamara: Subtracao.subtrair(...)` | Reprovado |
| CT-09 | Menu - multiplicacao | Exibir resultado 12.0 | Exibe apenas mensagem `[Menu] Aqui chamara: Multiplicacao.multiplicar(...)` | Reprovado |
| CT-10 | Menu - divisao | Exibir resultado 5.0 | Exibe apenas mensagem `[Menu] Aqui chamara: Divisao.dividir(...)` | Reprovado |
| CT-11 | Menu - divisao por zero | Exibir erro controlado | Mensagem de erro exibida | Aprovado |
| CT-12 | Menu - opcao invalida | Solicitar nova opcao | Mensagem de opcao inexistente | Aprovado |
| CT-13 | Menu - texto na opcao | Solicitar opcao numerica | Mensagem de entrada invalida | Aprovado |
| CT-14 | Menu - texto no numero | Solicitar numero valido | Mensagem de valor invalido | Aprovado |
| CT-15 | Menu - sair | Encerrar programa | Programa encerrou pela opcao 5 | Aprovado |

## Evidencia dos Testes Automatizados

Saida obtida em `java TestesCalculadora`:

```text
[OK] 2 + 2 = 4.0
[OK] 5 - 3 = 2.0
[OK] 4 * 3 = 12.0
[OK] 10 / 2 = 5.0
[OK] 10 / 0 retornou erro: Não é possível dividir por zero.
Todos os testes automatizados passaram.
```

## Problemas Encontrados

| Problema | Impacto | Recomendacao |
| --- | --- | --- |
| `Main.java` nao chama o menu completo da calculadora. | Quem executar `java Main` nao acessa as quatro operacoes funcionais. | Integrar `Main.java` ao menu principal ou mover o menu completo para `Main`. |
| `menu.java` nao chama os metodos reais das operacoes. | O usuario nao recebe o resultado pelo menu, apenas uma mensagem indicando o metodo que seria chamado. | Substituir os placeholders por chamadas reais a `Soma.somar`, `Subtracao.subtrair`, `Multiplicacao.multiplicar` e `Divisao.dividir`. |
| A integracao final ainda depende de alteracao dos desenvolvedores. | A versao final nao pode ser aprovada completamente pelo QA. | Solicitar correcao e executar nova rodada de testes apos ajuste. |

## Revisao de Qualidade para PCM

| Item verificado | Resultado |
| --- | --- |
| Codigo compila | Aprovado |
| Testes executados na versao atual dos artefatos | Aprovado |
| Operacoes isoladas funcionam | Aprovado |
| Integracao pelo menu funciona completamente | Reprovado |
| Versao pronta para baseline final | Reprovado no momento |
| Necessidade de nova correcao e novo teste | Sim |

## Correcoes Realizadas pelo QA

Nenhuma correcao foi aplicada no codigo da aplicacao. Como QA, a atuacao foi limitada a testar, registrar evidencias e apontar os problemas encontrados.

Foi criado apenas o arquivo `TestesCalculadora.java` como apoio para automatizar a validacao das classes de operacao.

## Conclusao

As operacoes matematicas funcionam quando testadas diretamente pelas classes. Entretanto, a versao integrada ainda precisa de correcao no `Main.java` e no `menu.java` para que a calculadora entregue os resultados ao usuario pelo menu.

Parecer final do QA: versao aprovada parcialmente, com pendencias de integracao antes da entrega final.
