# 📚 Semana 4: Métodos e Consolidação

## 🎯 Objetivos
- Entender o conceito de métodos
- Aprender a criar métodos reutilizáveis
- Dominar escopo de variáveis
- Implementar método overloading
- Consolidar aprendizado em um projeto final

## 📅 Distribuição de Dias

| Dia | Tópico | Atividade |
|-----|--------|----------|
| 22-23 | Conceito de Métodos | Assinatura, retorno, parâmetros |
| 24-25 | Escopo de Variáveis | Local vs instance, visibilidade |
| 26-27 | Métodos com Parâmetros | Passagem por valor/referência |
| 28-29 | Overloading | Múltiplos métodos com mesmo nome |
| 30 | Projeto Final | Integração completa |

## 📖 Conceitos-Chave

### Estrutura de um Método

```java
// Sintaxe
[modificador] tipoRetorno nomeDosMetodo(parametros) {
    // corpo do método
    return valor; // se tipoRetorno não for void
}

// Exemplo
public static int somar(int a, int b) {
    int resultado = a + b;
    return resultado;
}

// Chamada
int soma = somar(5, 3); // soma = 8
```

### Componentes de um Método

1. **Modificador:** `public`, `private`, `static`
2. **Tipo de Retorno:** `int`, `double`, `String`, `void`, etc.
3. **Nome:** Em camelCase
4. **Parâmetros:** Entre parênteses, separados por vírgula
5. **Corpo:** Entre chaves `{}`
6. **Return:** Valor de retorno (opcional se `void`)

### Tipos de Retorno

```java
// Retorna um valor
public static int somar(int a, int b) {
    return a + b;
}

// Sem retorno (void)
public static void imprimir(String mensagem) {
    System.out.println(mensagem);
}

// Retorna um boolean
public static boolean ehPositivo(int numero) {
    return numero > 0;
}
```

### Escopo de Variáveis

```java
public class ExemploEscopo {
    // Variável de instância (escopo: toda a classe)
    int idade = 25;
    
    public static void main(String[] args) {
        // Variável local (escopo: apenas este método)
        int numero = 10;
    }
    
    public void metodo() {
        // Variável local (escopo: apenas este método)
        String nome = "João";
    }
}
```

### Method Overloading

```java
// Mesmo nome, parâmetros diferentes
public static int somar(int a, int b) {
    return a + b;
}

public static double somar(double a, double b) {
    return a + b;
}

public static int somar(int a, int b, int c) {
    return a + b + c;
}

// Uso
int r1 = somar(5, 3);           // Usa primeiro método
double r2 = somar(5.5, 3.2);    // Usa segundo método
int r3 = somar(5, 3, 2);        // Usa terceiro método
```

### Passagem de Parâmetros

```java
// Por valor (tipos primitivos)
public static void alterarNumero(int numero) {
    numero = 100; // não afeta a variável original
}

int x = 50;
alterarNumero(x);
System.out.println(x); // imprime 50

// Por referência (objetos/arrays)
public static void alterarArray(int[] arr) {
    arr[0] = 999; // afeta o array original
}

int[] numeros = {1, 2, 3};
alterarArray(numeros);
System.out.println(numeros[0]); // imprime 999
```

## 📝 Exercícios

### Exercício 1: MetodosBasicos.java
**Objetivo:** Criar métodos simples

**Tarefa:**
1. Crie método `saudacao()` que imprime "Olá!"
2. Crie método `dobro(int x)` que retorna o dobro
3. Crie método `ehPar(int x)` que retorna true se par
4. Chame todos os métodos no main

**Exemplo de saída:**
```
Olá!
Dobro de 5: 10
10 é par? true
```

---

### Exercício 2: CalculadoraComMetodos.java
**Objetivo:** Refatorar cálculos em métodos

**Tarefa:**
1. Crie métodos para: adicionar, subtrair, multiplicar, dividir
2. Cada método recebe dois parâmetros
3. Todos retornam um double
4. No main, realize algumas operações

**Exemplo de saída:**
```
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2.0
```

---

### Exercício 3: OverloadingDeMetodos.java
**Objetivo:** Implementar method overloading

**Tarefa:**
1. Crie 3 versões de um método `perimetro()`:
   - `perimetro(int lado)` - quadrado
   - `perimetro(int largura, int altura)` - retângulo
   - `perimetro(double raio)` - círculo
2. Cada um retorna o perímetro correto
3. Chame as 3 versões no main

**Fórmulas:**
- Quadrado: P = 4 × lado
- Retângulo: P = 2 × (L + A)
- Círculo: P = 2 × π × raio

**Exemplo de saída:**
```
Perímetro do quadrado (lado 5): 20
Perímetro do retângulo (8x5): 26
Perímetro do círculo (raio 3): 18.85
```

---

### Exercício 4: ValidadoresComMetodos.java
**Objetivo:** Criar métodos de validação

**Tarefa:**
1. Crie método `ehMaiorDeIdade(int idade)` - retorna true se >= 18
2. Crie método `ehEmail(String texto)` - retorna true se contém '@'
3. Crie método `ehSenhaForte(String senha)` - retorna true se comprimento >= 8
4. Teste os métodos com valores variados

**Exemplo de saída:**
```
Idade 20 é maior de idade? true
Idade 16 é maior de idade? false
email@example.com é email válido? true
senha123 é senha forte? true
senhacurta é senha forte? false
```

---

### Exercício 5 (PROJETO FINAL): Calculadora.java
**Objetivo:** Integrar todos os conceitos em um projeto completo

**Tarefa:**
1. Crie uma classe Calculadora com:
   - Método `somar(double a, double b)` → double
   - Método `subtrair(double a, double b)` → double
   - Método `multiplicar(double a, double b)` → double
   - Método `dividir(double a, double b)` → double (com validação de zero)
   - Método `potencia(double base, double expoente)` → double
   - Método `raizQuadrada(double numero)` → double (com validação de negativo)

2. Implemente validações:
   - Divisão por zero
   - Raiz quadrada de negativo
   - Imprima mensagens de erro apropriadas

3. No main:
   - Teste todas as operações
   - Teste os casos de erro
   - Imprima resultados formatados

**Exemplo de saída:**
```
=== CALCULADORA ===
10 + 5 = 15.0
10 - 5 = 5.0
10 * 5 = 50.0
10 / 5 = 2.0
2 ^ 3 = 8.0
Raiz de 16 = 4.0

10 / 0 = Erro: Divisão por zero!
Raiz de -4 = Erro: Não é possível raiz de número negativo!
```

---

## 🔗 Referências

- [Oracle - Defining Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- [Baeldung - Java Methods](https://www.baeldung.com/java-methods)
- [Oracle - Understanding Instance and Class Variables](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)

## ✅ Checklist de Conclusão

- [ ] MetodosBasicos.java funcionando
- [ ] CalculadoraComMetodos.java concluído
- [ ] OverloadingDeMetodos.java com 3 versões
- [ ] ValidadoresComMetodos.java implementado
- [ ] Calculadora.java (PROJETO FINAL) completo
- [ ] Todos os exercícios commitados no Git
- [ ] Plano de 30 dias FINALIZADO! 🎉

## 🚀 Próximos Passos

Parabéns! Você completou os fundamentos de Java. Agora está pronto para:

1. **Programação Orientada a Objetos (POO)**
   - Classes e Objetos
   - Encapsulamento (getters/setters)
   - Herança
   - Polimorfismo
   - Abstração

2. **Collections Framework**
   - ArrayList
   - HashMap
   - HashSet
   - LinkedList

3. **Exceções e Tratamento de Erros**
   - Try/Catch
   - Finally
   - Throws
   - Custom Exceptions

4. **Frameworks e Bibliotecas**
   - Spring Boot
   - Hibernate
   - JPA
   - Maven/Gradle

**Mantenha o repositório atualizado e continue praticando!** 💪
