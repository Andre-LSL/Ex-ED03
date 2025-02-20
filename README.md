## 1. Multiplicação por somas  
Crie uma função recursiva que receba dois valores inteiros `A` e `B` e, utilizando somas sucessivas, calcule o produto de `A` por `B`.  
- **Condição de parada**: A recursão deve parar quando `B == 1`, pois `A * 1 = A`.  
- **Relação de chamada**: A função deve retornar `A + multiplicacao(A, B - 1)`.  
---

## 2. Contagem de dígitos de um número  

Crie uma função recursiva que receba um número inteiro e retorne a quantidade de dígitos que ele possui.  

- **Condição de parada**: A recursão deve parar quando `n < 10`, pois números menores que 10 possuem apenas um dígito.  
- **Relação de chamada**: A função deve retornar `1 + quantidadeDigitos(n / 10)`.  

---

## 3. Contagem de ocorrências de um dígito  

Crie uma função recursiva que receba um número inteiro `N` (de 10 a 999999) e um dígito `D` (de 0 a 9) e retorne quantas vezes `D` aparece em `N`.  

- **Condição de parada**: A recursão deve parar quando `N == 0`.  
- **Relação de chamada**: A função verifica se o último dígito de `N` (`N % 10`) é igual a `D` e retorna `1 + contarOcorrencias(N / 10, D)`.  

---

## 4. Inversão de uma string  

Crie uma função recursiva que receba uma string e retorne sua versão invertida. Utilize a função `substring` do Java.  

- **Condição de parada**: A recursão deve parar quando a string tiver comprimento 0 ou 1.  
- **Relação de chamada**: A função deve retornar `ultimoCaractere + inverterString(restanteDaString)`.  

---

## 5. Conversão de número decimal para binário  

Crie uma função recursiva que receba um número inteiro `N` (até 2000) e retorne sua representação binária.  

- **Condição de parada**: A recursão deve parar quando `N == 0`.  
- **Relação de chamada**: A função deve retornar `binario(N / 2) + (N % 2)`.  

---

## 6. Sequência de Fibonacci  

Crie uma função recursiva que receba um número inteiro `N` (limite de 20) e retorne o `N`º termo da sequência de Fibonacci.  

- **Condição de parada**: A recursão deve parar quando `N == 1` ou `N == 2`, pois os primeiros dois termos são 1.  
- **Relação de chamada**: A função deve retornar `Fibonacci(N - 1) + Fibonacci(N - 2)`.  

---

## 7. Somatória de série envolvendo fatoriais  

Crie uma função recursiva que receba um número `N` e retorne o valor da somatória:  

- **Condição de parada**: A recursão deve parar quando `N == 1`, pois `1/1! = 1`.  
- **Relação de chamada**: A função deve retornar `(1 / fatorial(N)) + somatoria(N - 1)`.  
