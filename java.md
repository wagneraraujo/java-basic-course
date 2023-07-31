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
- 