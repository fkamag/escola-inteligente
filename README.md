# Escola Inteligente!

Boas-vindas ao repositório do exercício Escola Inteligente!

<details>
  <summary>👨‍💻 O que deverá ser desenvolvido</summary><br />

A Escola Inteligente é uma aplicação Java que interage através do terminal apresentando algumas
funcionalidades para determinados departamentos:

- A funcionalidade de calcular a idade de uma pessoa estudante em dias para o departamento Pessoa
  Estudante.
- A funcionalidade de calcular a média das notas de uma pessoa estudante para o departamento
  Secretaria.
- A funcionalidade de gerar um relatório de controle de acesso das pessoas estudantes na escola para
  o departamento Portaria.

</details>

## Requisitos

### 1 - Calcular a idade em dias para o departamento Pessoa Estudante

<details>
  <summary>Descrição</summary>

Implemente os métodos `coletarInformacoes` e `calcularIdadeEmDias` contidos na
classe `PessoaEstudante`.
O método `coletarInformacoes` realiza a leitura do nome da pessoa estudante no console Java e mais três valores: anos, meses e dias.
Já o método `calcularIdadeEmDias`, recebe 3 argumentos do tipo `int`: anos, meses e dias. Esse método deve calcular e retornar a idade da pessoa estudante em dias, e esse retorno deve ser do tipo `int`. Em outras palavras:

1. Ao iniciar a aplicação e a opção 1 for escolhida, o método `coletarInformacoes` da
   classe `PessoaEstudante` será chamado.
2. Os dados nome e idade atual em quantidade de anos, meses e dias decorridos desde seu aniversário, deverão ser informados.
3. O método `calcularIdadeEmDias` deve calcular e retornar a idade da pessoa usuária em dias.

   **Para simplificar nosso cálculo, desconsidere anos bissextos, ou seja, considere que cada ano tem 365 dias. Considere também que todos os meses têm 30 dias.**

*Lembre-se* de que você deve fazer a conversão da entrada da pessoa usuária para inteiro para poder realizar o cálculo, pois o método `scanner.next()` lê a entrada da pessoa usuária e converte para `String`.

Suponha que a entrada seja:

  ```bash
  Boas vindas a Escola Inteligente!
  Escolha um departamento:
  1 - Pessoa Estudante - Calcular idade em dias
  2 - Secretaria - Calcular a média das notas
  3 - Portaria - Gerar relatório de controle de acesso
  1
  Qual o nome da Pessoa Estudante?
  Carla
  Qual a sua idade em anos, meses e dias?
  anos:
  32
  meses:
  2
  dias:
  29
  ```

Aqui nós lemos as entradas da pessoa estudante, fizemos as devidas conversões, passamos a quantidade de anos, de meses e de dias para o método `calcularIdadeEmDias(32, 2, 29)`, e a saída do método `calcularIdadeEmDias(32, 2, 29)` deve ser `11769`. Ou seja, a saída final do programa deve
ser similar a essa:

  ```bash
  A idade de Carla em dias é 11769.
  ```

</details>

### 2 - Calcular a média das notas de uma pessoa estudante

<details>
  <summary>Descrição</summary>

Implemente os métodos `coletarInformacoes` e `calcularMedia` contidos na classe `Secretaria`.

O método `coletarInformacoes` realiza a leitura do nome da pessoa estudante do console
Java e mais quatro valores que serão referentes às notas de 4 avaliações. Já o método `calcularMedia`, recebe 4 argumentos do tipo `float` ou `double`: nota1, nota2, nota3 e nota4. Esse método deve calcular e retornar a média, e esse retorno deve ser do tipo `float` ou `double`. Em outras palavras:

1. Ao iniciar a aplicação e a opção 2 for escolhida, o método `coletarInformacoes` da
   classe `Secretaria` será chamado.
2. Os dados nome e quatro valores decimais das notas deverão ser informados;
3. O método `calcularMedia` deve calcular e retornar a média dos valores inseridos pela pessoa usuária.

*Lembre-se* de que você deve fazer a conversão da entrada da pessoa usuária para `float` ou `double` para poder realizar o cálculo, pois o método `scanner.next()` lê a entrada da pessoa usuária e converte para `String`.

Suponnha que a entrada seja:

```bash
Boas vindas a Escola Inteligente!
Escolha um departamento:
1 - Pessoa Estudante - Calcular idade em dias
2 - Secretaria - Calcular a média das notas
3 - Portaria - Gerar relatório de controle de acesso
2
Qual o nome da Pessoa Estudante?
Carla
Entre com as notas das provas:
Avaliação 1:
9.85
Avaliação 2:
9.58
Avaliação 3:
9.90
Avaliação 4:
8.75
```

Aqui nós lemos as entradas da pessoa estudante, fizemos as devidas conversões, passamos as notas das avaliações para o método `calcularMedia(9.85, 9.58, 9.90, 8.75)`, e a saída do método `calcularMedia(9.85, 9.58, 9.90, 8.75)` deve ser `9.52`. Ou seja, a saída final do programa deve ser similar a essa:

```bash
A média das notas de Carla é 9.52
```

</details>

### 3 - Realizar o controle de acesso e a emissão do relatório.

<details>
  <summary>Descrição</summary>

Implemente os métodos `coletarInformacoes` e `emitirRelatorio` contidos na
classe `Portaria`.

O método `coletarInformacoes` deve realizar a leitura da idade de todas as pessoas estudantes que acessam a escola pela portaria. Já o método `emitirRelatorio` informa o total de pessoas estudantes divididas nas categorias Ensino Fundamental I, Ensino Fundamental II e Ensino Médio. Em outras palavras:

1. Ao iniciar a aplicação e a opção 3 for escolhida, o método `coletarInformacoes` da
   classe `Portaria`será chamado na nossa classe principal (App).

2. O método `coletarInformacoes` deve **receber como entrada a idade das pessoas estudantes:** essa etapa se repete até que a opção de finalizar acessos seja escolhida. É importante frisar que nesta etapa, a idade deve ser apenas contabilizada para fins estatísticos ou de registro, sem a necessidade de armazenamento em um array ou qualquer outra estrutura de dados. O foco é no processo de contagem e registro do número total de pessoas em cada nível de ensino (fundamental 1, 2 e médio), e não no armazenamento individual das idades.

3. **Finalizar o sistema e mostrar o relatório:** nessa etapa, o relatório deve ser impresso no console (método `emitirRelatorio`). O relatório deve conter o total de pessoas estudantes que acessaram a escola através da portaria, e também o número de pessoas estudantes do ensino fundamental I (de 6 a 10 anos), o número de pessoas estudantes do ensino fundamental II (de 11 a 14 anos) e o número de pessoas estudantes do ensino médio (a partir de 15 anos). O relatório também deve calcular, em relação ao total de pessoas estudantes, a porcentagem delas por categoria de ensino.

A imagem abaixo mostra o fluxo que o programa deve seguir:

![SistemaFluxograma](/images/controle-acesso.png)

- A coleta de informações do departamento Portaria deve ter o formato:

```bash
Entre com o número correspondente à opção desejada:
1 - Registrar o acesso de pessoa estudante
2 - Finalizar o acesso e emitir o relatório
```

Se a opção 1 for escolhida no método `coletarInformacoes`, então a mensagem `Entre com a idade da pessoa estudante:` será impressa no console. Em seguida, após inserir a idade da pessoa estudante e pressionar enter, aparecerá uma das mensagens listadas abaixo:

- `Pessoa estudante do Ensino Fundamental I, catraca liberada!`: se a idade da pessoa inserida for menor ou igual a 10 anos.

- `Pessoa estudante do Ensino Fundamental II, catraca liberada!`: se a idade da pessoa inserida for entre 11 e 14 anos.

- `Pessoa estudante do Ensino Médio, catraca liberada!`: se a idade da pessoa inserida for maior ou igual a 15 anos.

Depois que a mensagem for impressa, devemos retornar ao estado inicial do menu. Supondo que a idade da primeira pessoa seja 18 anos, um exemplo do conteúdo do console após inserir a idade da primeira pessoa cliente será:

```bash
Entre com o número correspondente à opção desejada:
1 - Registrar o acesso de pessoa estudante
2 - Finalizar o acesso e emitir o relatório
1
Informe a idade da pessoa estudante:
12
Pessoa estudante do Ensino Fundamental II, catraca liberada!
Entre com o número correspondente à opção desejada:
1 - Registrar o acesso de pessoa estudante
2 - Finalizar o acesso e emitir o relatório
```

Esse ciclo se repete até a opção 2 ser escolhida, o que indica que os acessos foram finalizados e o relatório deve ser emitido.

O relatório deve ser impresso no console quando a opção 2 for selecionada. Supondo que 200 pessoas estudantes acessaram a escola, o relatório deve conter as seguintes informações:

- Número total de pessoas estudantes que entraram na escola: nesse caso, esse valor deverá ser 200.

- Número de pessoas estudantes do ensino fundamental I que entraram na escola: supondo que, das 200 pessoas, 40 tinham menos de 10 anos, então no relatório esse valor deverá ser 40.

- Número de pessoas estudantes do ensino fundamental II que entraram na escola: supondo que, das 200 pessoas, 100 tinham entre 11 e 14 anos, então esse valor deverá ser 100.

- Número de pessoas estudantes do ensino médio que entraram na escola: supondo que, das 200 pessoas, 60 tinham 15 anos ou mais, então esse valor deverá ser 60.

O relatório também deve calcular a porcentagem de pessoas em cada categoria em relação ao total de pessoas. Ainda seguindo a suposição anterior, o total de acessos à escola foi de 200 pessoas estudantes, então o relatório na parte dos números percentuais deve apresentar:

- Percentual de pessoas estudantes do ensino fundamental I: supondo que, das 200 pessoas, 40 tinham menos de 10 anos, então no relatório esse valor deverá ser 20.0%.

- Número de pessoas estudantes do ensino fundamental II que entraram na escola: supondo que, das 200 pessoas, 100 tinham entre 11 e 14 anos, então esse valor deverá ser 50.0%.

- Número de pessoas estudantes do ensino médio que entraram na escola: supondo que, das 200 pessoas, 60 tinham 15 anos ou mais, então esse valor deverá ser 30.0%.

Para essa suposição, a saída do relatório deve ser similar à saída abaixo:

```bash
----- Quantidade -----
Ensino Fundamental I: 40
Ensino Fundamental II: 100
Ensino Médio: 60

----- Percentual -----
Ensino Fundamental I: 20.0%
Ensino Fundamental II: 50.0%
Ensino Médio: 30.0%

TOTAL: 200
```

### Restrições

- O valor percentual deve ter duas casas decimais, exceto se for zero, então pode ser apenas uma casa decimal, como exposto no exemplo acima.
- Caso a opção inserida seja um valor diferente de 1 ou de 2, a mensagem `Entre com uma opção válida!` deve ser impressa no console, e o menu voltar para o estado inicial.

⚠️🔴**DICA: para fazer com que o valor do tipo `float` ou `double` tenha apenas duas casas decimais, pesquise sobre a classe `DecimalFormat`.** 🔴⚠️

</details>

