# Plano de Testes - Calculadora Java

## Objetivo

Validar se a calculadora executa corretamente as quatro operacoes basicas, trata divisao por zero, aceita entradas pelo menu e encerra sem erros.

## Escopo

- Soma
- Subtracao
- Multiplicacao
- Divisao
- Divisao por zero
- Menu principal
- Tratamento de opcao invalida
- Tratamento de numero invalido
- Compilacao do projeto
- Verificacao da integracao entre os arquivos entregues
- Registro de pendencias para controle de mudancas no PCM

## Ambiente

- Linguagem: Java
- Execucao: terminal
- Comandos previstos:
  - `javac Main.java menu.java Soma.java Subtracao.java Multiplicacao.java Divisao.java TestesCalculadora.java`
  - `java TestesCalculadora`
  - `java Main`

## Casos de Teste

| ID | Funcionalidade | Entrada | Resultado esperado |
| --- | --- | --- | --- |
| CT-01 | Soma | 2 + 2 | 4 |
| CT-02 | Subtracao | 5 - 3 | 2 |
| CT-03 | Multiplicacao | 4 * 3 | 12 |
| CT-04 | Divisao | 10 / 2 | 5 |
| CT-05 | Divisao por zero | 10 / 0 | Mensagem de erro, sem quebrar o programa |
| CT-06 | Menu | Opcao 1, numeros 2 e 2 | Exibe resultado da soma |
| CT-07 | Menu | Opcao 2, numeros 5 e 3 | Exibe resultado da subtracao |
| CT-08 | Menu | Opcao 3, numeros 4 e 3 | Exibe resultado da multiplicacao |
| CT-09 | Menu | Opcao 4, numeros 10 e 2 | Exibe resultado da divisao |
| CT-10 | Menu | Opcao 4, numeros 10 e 0 | Exibe erro de divisao por zero |
| CT-11 | Menu | Opcao fora de 1 a 5 | Solicita nova opcao |
| CT-12 | Menu | Entrada textual no lugar de numero | Solicita novo valor numerico |
| CT-13 | Encerramento | Opcao 5 | Encerra o programa corretamente |

## Criterios de Aprovacao

- O codigo deve compilar sem erros.
- Todos os testes automatizados devem passar.
- O menu deve chamar as classes reais das operacoes.
- A divisao por zero deve ser bloqueada com mensagem de erro.
- O programa deve encerrar normalmente pela opcao 5.
- As pendencias encontradas devem ser registradas para correcao pelos responsaveis antes da baseline final.

## Relacao com o PCM

Conforme o papel de QA no Plano de Gerencia de Configuracao, estes testes verificam se os artefatos entregues estao em condicao de serem aprovados para baseline. Caso algum item falhe, a versao deve ser marcada com pendencia e encaminhada para correcao antes da aprovacao final.
