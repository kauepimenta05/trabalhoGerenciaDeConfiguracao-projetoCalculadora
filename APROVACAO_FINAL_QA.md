# Parecer Final de QA

## Status

Aprovado parcialmente, com pendencias de integracao.

## Criterios Validados

| Criterio | Status | Observacao |
| --- | --- | --- |
| Codigo compila sem erros | Aprovado | Compilacao executada com `javac`. |
| Soma funciona | Aprovado | Classe `Soma` retornou 4.0 para 2 + 2. |
| Subtracao funciona | Aprovado | Classe `Subtracao` retornou 2.0 para 5 - 3. |
| Multiplicacao funciona | Aprovado | Classe `Multiplicacao` retornou 12.0 para 4 * 3. |
| Divisao funciona | Aprovado | Classe `Divisao` retornou 5.0 para 10 / 2. |
| Divisao por zero retorna erro controlado | Aprovado | Classe `Divisao` lanca erro e o menu exibe mensagem. |
| Menu executa operacoes reais | Reprovado | O menu mostra placeholders em vez dos resultados. |
| `Main.java` abre calculadora completa | Reprovado | `Main.java` exibe apenas menu resumido com itens em desenvolvimento. |
| Opcao invalida e tratada | Aprovado | Menu solicita nova opcao. |
| Entrada numerica invalida e tratada | Aprovado | Menu solicita novo numero. |

## Parecer

Como QA do projeto, a versao atual nao deve ser considerada totalmente aprovada para entrega final. As classes de calculo estao funcionando, mas a integracao pelo menu ainda precisa ser corrigida pelos desenvolvedores.

Para fins de Gerencia de Configuracao, esta versao nao deve ser congelada como baseline final enquanto as pendencias de integracao nao forem corrigidas e retestadas.

## Pendencias para Aprovacao Total

- Integrar `Main.java` ao menu principal funcional.
- Alterar `menu.java` para chamar os metodos reais das operacoes.
- Reexecutar os testes do `RELATORIO_DE_TESTES.md` apos a correcao.
- Registrar a nova versao corrigida antes de aprovar a baseline final.

## Entregaveis de QA

- `PLANO_DE_TESTES.md`
- `RELATORIO_DE_TESTES.md`
- `APROVACAO_FINAL_QA.md`
- `TestesCalculadora.java`
