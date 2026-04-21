# Estrutura de Dados em Java

Este repositório contém implementações de estruturas de dados fundamentais em Java, desenvolvidas como material de estudo e referência.

## 📚 Estruturas Implementadas

### 1. **Vetores (Arrays Dinâmicos)**
   - `Vetor<T>`: Implementação de array dinâmico com redimensionamento automático
   - Operações: inserção, remoção, busca, contenção

### 2. **Listas Ligadas**
   - `ListaLigada<T>`: Lista simplesmente ligada
   - `ListaDuplamenteLigada<T>`: Lista duplamente ligada
   - Operações: inserção (início, fim, posição específica), remoção, busca, recuperação

### 3. **Pilha (Stack)**
   - `Pilha<T>`: Implementação de pilha (LIFO - Last In, First Out)
   - Operações: empilhar, desempilhar

### 4. **Fila (Queue)**
   - `Fila<T>`: Implementação de fila (FIFO - First In, First Out)
   - Operações: enfileirar, desenfileirar

### 5. **Conjuntos (Sets)**
   - `Conjunto<T>`: Implementação de conjunto sem elementos duplicados
   - Operações: inserção, verificação de existência

### 6. **Mapas (Maps/Dictionaries)**
   - `Mapa<K, V>`: Implementação de mapa chave-valor
   - Operações: adicionar, remover, recuperar, verificar contenção de chaves

### 7. **Árvores Binárias**
   - `Arvore<T>`: Implementação de árvore binária de busca
   - `NoArvore<T>`: Nó da árvore
   - Operações: inserção, busca, travessias (em ordem, pré ordem, pós ordem), cálculo de altura

### 8. **Tabela de Espalhamento (Hash Table)**
   - `TabelaEspalhamento`: Implementação de tabela hash

## 🏗️ Organização do Projeto

```
src/
└── br/com/estruturadados/
    ├── main/                    # Classe principal com demonstrações
    ├── modelos/                 # Classes modelo (ex: Pessoa)
    ├── vetores/                 # Implementação de vetores
    ├── listasligadas/           # Listas ligadas (simples e duplas)
    ├── pilha/                   # Implementação de pilha
    ├── filas/                   # Implementação de fila
    ├── conjuntos/               # Implementação de conjuntos
    ├── mapas/                   # Implementação de mapas
    ├── arvorebinaria/           # Implementação de árvores binárias
    └── espalhamento/            # Tabela de espalhamento
```

## 🚀 Como Executar

### Pré-requisitos
- Java Development Kit (JDK) 8 ou superior
- Eclipse IDE (opcional, o projeto já está configurado para Eclipse)

### Usando Eclipse
1. Importe o projeto no Eclipse
2. Execute a classe `Main.java` localizada em `br.com.estruturadados.main`

### Usando Linha de Comando
```bash
# Compile todos os arquivos Java
javac -d bin src/br/com/estruturadados/**/*.java

# Execute a classe principal
java -cp bin br.com.estruturadados.main.Main
```

## 📖 Funcionalidades Demonstradas

A classe `Main` inclui um menu interativo que demonstra todas as estruturas de dados:

1. **Gerenciamento de Memória**: Demonstra diferenças entre tipos primitivos e objetos
2. **Vetores**: Operações com arrays dinâmicos
3. **Lista Ligada**: Operações com lista simplesmente ligada
4. **Lista Duplamente Ligada**: Operações com lista duplamente ligada
5. **Pilha**: Operações de empilhamento e desempilhamento
6. **Fila**: Operações de enfileiramento e desenfileiramento
7. **Conjunto**: Inserção e verificação de unicidade
8. **Mapas**: Operações com pares chave-valor
9. **Árvore**: Inserção, busca e travessias em árvore binária

## 🎯 Conceitos Abordados

- Genéricos (Generics) em Java
- Tipos abstratos de dados (TADs)
- Complexidade de operações em diferentes estruturas
- Comparação entre estruturas de dados
- Manipulação de memória (referências vs. valores)

## 📝 Notas

- Todas as implementações utilizam genéricos para maior flexibilidade
- O projeto inclui uma classe `IO` utilitária para operações de entrada/saída
- A classe `Pessoa` é utilizada como modelo de exemplo nas demonstrações

## 🤝 Contribuição

Este projeto foi desenvolvido para fins educacionais. Sinta-se à vontade para usar como referência de estudos sobre estruturas de dados.

## 📄 Licença

Projeto educacional para estudo de estruturas de dados.
