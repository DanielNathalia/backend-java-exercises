# 📚 Semana 2: Condicionais

## 🎯 Objetivos
- Entender estruturas de controle de fluxo
- Dominar if/else e switch
- Aprender operadores lógicos e de comparação
- Implementar lógica condicional em programas

## 📅 Distribuição de Dias

| Dia | Tópico | Atividade |
|-----|--------|----------|
| 8-9 | If/Else | Estrutura condicional simples e composta |
| 10-11 | Operadores Lógicos | AND (&&), OR (\|\|), NOT (!), comparadores |
| 12-13 | Switch/Case | Seleção múltipla, break, default |
| 14 | Prática Integrada | Mini-projetos |

## 📖 Conceitos-Chave

### Operadores de Comparação

| Operador | Descrição | Exemplo |
|----------|-----------|----------|
| `==` | Igual | `x == 5` |
| `!=` | Diferente | `x != 5` |
| `>` | Maior que | `x > 5` |
| `<` | Menor que | `x < 5` |
| `>=` | Maior ou igual | `x >= 5` |
| `<=` | Menor ou igual | `x <= 5` |

### Operadores Lógicos

| Operador | Descrição | Exemplo |
|----------|-----------|----------|
| `&&` | AND (E) | `x > 0 && x < 10` |
| `\|\|` | OR (OU) | `x < 0 \|\| x > 100` |
| `!` | NOT (NÃO) | `!(x == 5)` |

### If/Else

```java
// Simples
if (condicao) {
    // código executado se verdadeiro
}

// If/Else
if (condicao) {
    // código se verdadeiro
} else {
    // código se falso
}

// If/Else If/Else
if (condicao1) {
    // código 1
} else if (condicao2) {
    // código 2
} else if (condicao3) {
    // código 3
} else {
    // código padrão
}
```

### Switch/Case

```java
switch (variavel) {
    case valor1:
        // código se variavel == valor1
        break;
    case valor2:
        // código se variavel == valor2
        break;
    default:
        // código padrão
}
```

## 📝 Exercícios

### Exercício 1: MaiorDeIguais.java
**Objetivo:** Comparar números

**Tarefa:**
1. Declare três números inteiros
2. Encontre o maior entre eles usando if/else
3. Imprima qual é o maior

**Exemplo de saída:**
```
Número 1: 15
Número 2: 42
Número 3: 28
Maior número: 42
```

---

### Exercício 2: ValidadorDeIdade.java
**Objetivo:** Usar condicionais com múltiplas categorias

**Tarefa:**
1. Declare uma variável com uma idade
2. Classifique em categorias:
   - Menor de 13: "Criança"
   - 13 a 18: "Adolescente"
   - 19 a 65: "Adulto"
   - Acima de 65: "Idoso"
3. Imprima a categoria

**Exemplo de saída:**
```
Idade: 25
Categoria: Adulto
```

---

### Exercício 3: ValidadorDeNota.java
**Objetivo:** Usar switch para múltiplas opções

**Tarefa:**
1. Declare uma variável com uma nota (A, B, C, D, F)
2. Use switch para determinar o significado:
   - A: "Excelente (90-100)"
   - B: "Muito Bom (80-89)"
   - C: "Bom (70-79)"
   - D: "Passável (60-69)"
   - F: "Reprovado (<60)"
3. Imprima o resultado

**Exemplo de saída:**
```
Nota: A
Descrição: Excelente (90-100)
```

---

### Exercício 4: VerificadorDePrimo.java
**Objetivo:** Usar operadores lógicos

**Tarefa:**
1. Declare um número inteiro
2. Verifique se é positivo E maior que 1 (pré-requisito para primo)
3. Verifique se é primo (divisível apenas por 1 e por si mesmo)
4. Imprima o resultado

**Dica:** Para números pequenos, você pode verificar divisibilidade por números de 2 até a metade do número.

**Exemplo de saída:**
```
Número: 17
17 é primo: true

Número: 10
10 é primo: false
```

---

### Exercício 5: CalculadoraComCondicionais.java
**Objetivo:** Integrar operações matemáticas com condicionais

**Tarefa:**
1. Declare dois números
2. Declare uma operação (como um char: '+', '-', '*', '/')
3. Use switch para realizar a operação
4. Valide divisão por zero com if
5. Imprima o resultado

**Exemplo de saída:**
```
Número 1: 20
Número 2: 4
Operação: /
Resultado: 5.0

Número 1: 10
Número 2: 0
Operação: /
Erro: Divisão por zero!
```

---

## 🔗 Referências

- [Oracle - Control Flow Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Baeldung - Java If/Else](https://www.baeldung.com/java-if-else)

## ✅ Checklist de Conclusão

- [ ] MaiorDeIguais.java funcionando
- [ ] ValidadorDeIdade.java com todas as categorias
- [ ] ValidadorDeNota.java com switch
- [ ] VerificadorDePrimo.java implementado
- [ ] CalculadoraComCondicionais.java concluído
- [ ] Todos os exercícios commitados no Git

## 🚀 Próxima Semana

**Semana 3:** Laços (for, while, do-while)
