# 📚 Semana 3: Laços (Loops)

## 🎯 Objetivos
- Dominar estruturas de repetição
- Entender for, while e do-while
- Aprender break e continue
- Implementar laços aninhados

## 📅 Distribuição de Dias

| Dia | Tópico | Atividade |
|-----|--------|----------|
| 15-16 | For Loop | Estrutura, incremento/decremento, range |
| 17-18 | While/Do-While | Loops com condição, diferenças práticas |
| 19-20 | Break/Continue | Controle de fluxo, saída prematura |
| 21 | Laços Aninhados | Combinações e casos de uso |

## 📖 Conceitos-Chave

### For Loop

```java
// Forma clássica
for (inicialização; condicao; incremento) {
    // código a ser repetido
}

// Exemplo
for (int i = 0; i < 5; i++) {
    System.out.println("Iteração: " + i);
}

// For-each (para arrays/coleções)
int[] numeros = {1, 2, 3, 4, 5};
for (int numero : numeros) {
    System.out.println(numero);
}
```

### While Loop

```java
while (condicao) {
    // código a ser repetido
    // incremento/alteração de variável
}

// Exemplo
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

### Do-While Loop

```java
do {
    // código a ser repetido
    // incremento/alteração de variável
} while (condicao);

// Exemplo: executa pelo menos uma vez
int contador = 0;
do {
    System.out.println("Contador: " + contador);
    contador++;
} while (contador < 5);
```

### Break e Continue

```java
// Break: sai do loop
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // sai do loop quando i == 5
    }
    System.out.println(i);
}
// Saída: 0 1 2 3 4

// Continue: pula para próxima iteração
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue; // pula quando i == 2
    }
    System.out.println(i);
}
// Saída: 0 1 3 4
```

### Laços Aninhados

```java
// Exemplo: tabuada
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println(i + " x " + j + " = " + (i * j));
    }
}
```

## 📝 Exercícios

### Exercício 1: TabelaDeNumeros.java
**Objetivo:** Praticar for loop básico

**Tarefa:**
1. Imprima números de 1 a 10 usando for
2. Depois, imprima números de 10 a 1 (decrescente)

**Exemplo de saída:**
```
Crescente: 1 2 3 4 5 6 7 8 9 10
Decrescente: 10 9 8 7 6 5 4 3 2 1
```

---

### Exercício 2: SomaDeNumeros.java
**Objetivo:** Acumular valores em um loop

**Tarefa:**
1. Declare uma variável soma = 0
2. Use um for para somar números de 1 a 100
3. Imprima o resultado

**Exemplo de saída:**
```
Soma de 1 a 100: 5050
```

---

### Exercício 3: Tabuada.java
**Objetivo:** Usar laços aninhados

**Tarefa:**
1. Implemente a tabuada de multiplicação (1 a 10)
2. Use dois for loops aninhados

**Exemplo de saída:**
```
1 x 1 = 1    1 x 2 = 2    1 x 3 = 3    ...
2 x 1 = 2    2 x 2 = 4    2 x 3 = 6    ...
...
```

---

### Exercício 4: ProcuraDePalavra.java
**Objetivo:** Usar break para sair de um loop

**Tarefa:**
1. Declare um array de Strings com nomes
2. Use um for para procurar um nome específico
3. Quando encontrar, imprima a posição e use break
4. Se não encontrar, imprima mensagem apropriada

**Dica:** Use `== null` ou `.equals()` para comparar Strings

**Exemplo de saída:**
```
Procurando por: "João"
Encontrado na posição: 2
```

---

### Exercício 5: NumerosPares.java
**Objetivo:** Usar continue para pular iterações

**Tarefa:**
1. Imprima números de 1 a 20
2. Use continue para pular números ímpares
3. Apenas números pares devem ser impressos

**Exemplo de saída:**
```
Números pares: 2 4 6 8 10 12 14 16 18 20
```

---

### Exercício 6: SerieDeSequencias.java
**Objetivo:** Integrar e praticar loops

**Tarefa:**
1. **Série Fibonacci:** Imprima os 10 primeiros números de Fibonacci (0, 1, 1, 2, 3, 5...)
2. **Quadrados:** Imprima os quadrados de 1 a 10
3. **Padrão Piramidal:** Imprima uma pirâmide de asteriscos (5 linhas)

**Exemplo de saída:**
```
Fibonacci: 0 1 1 2 3 5 8 13 21 34
Quadrados: 1 4 9 16 25 36 49 64 81 100
Pirâmide:
*
**
***
****
*****
```

---

## 🔗 Referências

- [Oracle - Loops](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html)
- [Baeldung - Java Loops](https://www.baeldung.com/java-loops)

## ✅ Checklist de Conclusão

- [x] TabelaDeNumeros.java funcionando
- [x] SomaDeNumeros.java com resultado correto
- [x] Tabuada.java com loops aninhados
- [x] ProcuraDePalavra.java com break
- [x] NumerosPares.java com continue
- [x] SerieDeSequencias.java concluído
- [x] Todos os exercícios commitados no Git

## 🚀 Próxima Semana

**Semana 4:** Métodos e Consolidação
