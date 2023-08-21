# Java

****
**Tipos primitivos**
São tipos valor, tipos valor são caixas e não ponteiros.
Mais simples e performático
- Não instância, uma vez declarados, pronto para uso.
- Não aceita valor null
- boolean
- double
- int
- long
- float
- char

**Tipos Referências**
- Classe

Usurfrui de todos os recursos OO, objetos precisam ser instanciados usando new ou 
apontar para um objeto existente
- Aceita null

### Descolacao de memória - Garbage collector e escopo local
**Garbage Collector** automatiza o gerenciamento de memória de um programa, monitora os objetos alocados
e desloca aqueles que não estão sendo mais usados.
No caso de **variaveis locais** são deslocadas imediatamente assim que seu escopo local sai de execução.

### Vetores
Estrutura de dados
- Homogênea (do mesmo tipo)
- Ordenada
- Alocada
- Acesso imediato aos elementos pela sua posição [499] sem precisar percorrer todos os elementos

### Wrapper classes e unboxing
- tem como objetivo de tratr os tipos primitivos como classes de forma transparente ao compilador,
- pois os tipos referencias(classes) aceitam valor num e usurfruem dos recursos OO, herancas, poliformicos e tals

### Listas
- Só guardar dados do mesmo tipo
- Coleção ordenada, acessado por posições
- Inicia vazia, e alocados sobre demanda, difrente do vetor
- Cada elemento ocupa um no (nodo) que tem info do próximo
- List é uma interface e não classe, não posso instanciar, preciso faer isso dentro de umc classe
- Classe que implementam: ArrayList, LinkedList e outras
- Tamanho variavel
- Facilita para inserções e deleções
- Não aceita tipos primitivos

### Matrizes
 Arranjo bidemensionais, "vetor de vetores"