# 📚 Semana 1: Variáveis e Tipos de Dados

## 🎯 Objetivos
- Configurar ambiente Java
- Entender o conceito de variáveis
- Aprender tipos de dados primitivos
- Realizar conversão de tipos

## 📅 Distribuição de Dias

| Dia | Tópico | Atividade |
|-----|--------|----------|
| 1-2 | Introdução a Java | Instalação JDK, IDE, primeiro "Hello World" |
| 3-4 | Variáveis | Declaração, inicialização, nomenclatura |
| 5-6 | Tipos Primitivos | int, double, boolean, char, long, float |
| 7 | Conversão de Tipos | Type casting, autoboxing, widening/narrowing |

## 📖 Conceitos-Chave

### Variáveis
Uma variável é um espaço na memória que armazena um valor. Em Java, toda variável deve ter um tipo declarado.

```java
// Sintaxe: tipo nomeVariavel = valor;
int idade = 25;
String nome = "João";
double altura = 1.75;
boolean ativo = true;
```

### Tipos Primitivos

| Tipo | Tamanho | Intervalo | Exemplo |
|------|--------|-----------|----------|
| `byte` | 8 bits | -128 a 127 | `byte x = 10;` |
| `short` | 16 bits | -32.768 a 32.767 | `short x = 1000;` |
| `int` | 32 bits | -2³¹ a 2³¹-1 | `int x = 50000;` |
| `long` | 64 bits | -2⁶³ a 2⁶³-1 | `long x = 9999999999L;` |
| `float` | 32 bits | ±3.4 × 10³⁸ | `float x = 3.14f;` |
| `double` | 64 bits | ±1.7 × 10³⁰⁸ | `double x = 3.14159;` |
| `char` | 16 bits | 0 a 65.535 | `char x = 'A';` |
| `boolean` | 1 bit | true / false | `boolean x = true;` |

### Nomenclatura (Convenções Java)
- Use `camelCase` para variáveis: `minhaVariavel`, `idadeDoUsuario`
- Comece com letra ou `_`, não com número
- Use nomes descritivos: `idade` ao invés de `a`
- Constantes em `UPPER_CASE`: `final int VELOCIDADE_LUZ = 300000;`

### Conversão de Tipos

```java
// Widening (conversão implícita - sempre segura)
int numero = 10;
long numeroGrande = numero; // int → long

// Narrowing (conversão explícita - pode perder informação)
long numeroGrande = 100L;
int numero = (int) numeroGrande; // long → int
```

## 📝 Exercícios

### Exercício 1: HelloWorld.java
**Objetivo:** Seu primeiro programa Java

**Tarefa:**
1. Crie um arquivo `HelloWorld.java`
2. Implemente um programa que imprima: "Olá, mundo!"
3. Compile: `javac HelloWorld.java`
4. Execute: `java HelloWorld`

**Dica:**
```java
public class HelloWorld {
    public static void main(String[] args) {
        // Seu código aqui
    }
}
```

---

### Exercício 2: VariaveisBasicas.java
**Objetivo:** Praticar declaração e inicialização de variáveis

**Tarefa:**
1. Crie variáveis para armazenar:
   - Nome (String)
   - Idade (int)
   - Altura em metros (double)
   - Ativo/Inativo (boolean)

2. Imprima os valores usando `System.out.println()`

**Exemplo de saída:**
```
Nome: João Silva
Idade: 25 anos
Altura: 1.75m
Ativo: true
```

---

### Exercício 3: TiposPrimitivos.java
**Objetivo:** Explorar todos os tipos primitivos

**Tarefa:**
1. Declare uma variável de cada tipo primitivo
2. Atribua um valor apropriado
3. Imprima o tipo e o valor
4. Imprima o tamanho em bytes (use `Byte.SIZE / 8`, etc.)

**Exemplo de saída:**
```
byte: 127 (1 byte)
short: 32767 (2 bytes)
int: 2147483647 (4 bytes)
long: 9223372036854775807L (8 bytes)
float: 3.4028235E38f (4 bytes)
double: 1.7976931348623157E308 (8 bytes)
char: Z (2 bytes)
boolean: true (1 bit)
```

---

### Exercício 4: ConversaoDeTipos.java
**Objetivo:** Praticar widening e narrowing

**Tarefa:**
1. Realize conversão implícita (widening):
   - int → long
   - float → double

2. Realize conversão explícita (narrowing):
   - long → int
   - double → float

3. Imprima antes e depois de cada conversão

**Exemplo:**
```
Antes: int x = 100
Depois de converter para long: 100L
```

---

### Exercício 5: CalculadoraSimples.java
**Objetivo:** Integrar variáveis em um programa útil

**Tarefa:**
1. Declare duas variáveis numéricas (números reais)
2. Calcule: soma, subtração, multiplicação, divisão
3. Armazene os resultados em variáveis
4. Imprima todos os resultados

**Exemplo de saída:**
```
Número 1: 10.5
Número 2: 3.2

Soma: 13.7
Subtração: 7.3
Multiplicação: 33.6
Divisão: 3.28
```

---

## 🔗 Referências

- [Oracle - Variables](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)
- [Oracle - Primitive Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Baeldung - Java Primitive Types](https://www.baeldung.com/java-primitive-types)

## ✅ Checklist de Conclusão

- [ ] Ambiente Java configurado e testado
- [ ] HelloWorld.java compilado e executado
- [ ] VariaveisBasicas.java funcionando
- [ ] TiposPrimitivos.java com todos os tipos
- [ ] ConversaoDeTipos.java implementado
- [ ] CalculadoraSimples.java concluído
- [ ] Todos os exercícios commitados no Git

## 🚀 Próximas Semanas

Com os fundamentos de Semana 1 consolidados, você estará pronto para:
- **Semana 2:** Condicionais (if/else, switch)
- **Semana 3:** Laços (for, while)
- **Semana 4:** Métodos
