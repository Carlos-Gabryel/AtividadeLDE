Lista de Estruturas de Dados I

Listas duplamente encadeadas

1 – Considere dois conjuntos de números inteiros (A e B) implementados utilizando listas lineares  duplamente encadeadas, ordenadas e sem repetidos. Implemente, na classe LDE, os métodos abaixo:
(a) Função para gerar a lista Interseção e preenchê-la com os valores pertencentes à lista A  e que também estão presentes na lista B. A função deverá retornar a nova lista gerada. (b) Função para gerar a lista União e preenchê-la com os valores pertencentes à lista A e/ou  pertencentes à lista B. A lista gerada não poderá conter valores repetidos. A função deverá retornar a nova lista gerada.
(c) Função para gerar a lista Diferença e preenchê-la com os valores pertencentes à lista A e  que não estão presentes na lista B. A lista gerada não poderá conter valores repetidos. A  função deverá retornar a nova lista gerada.
Implemente o programa para preencher as listas A e B e para gerar e exibir os valores das listas  Interseção, União e Diferença. Implemente os procedimentos e funções que julgar necessários,  além dos solicitados nos itens (a), (b) e (c). As três listas geradas devem estar ordenadas, porém  a ordenação deve ser fruto do processo de geração da lista.  

2 - Considere uma lista linear duplamente encadeada cujos nós armazenam objetos da classe Livro. Considere ainda que a referida lista NÃO ESTÁ ORDENADA e PODE CONTER elementos  repetidos. Implemente uma função para remover um dado Livro da lista. A função deverá receber  como parâmetro o Livro a ser removido. A função deverá retornar quantas ocorrências do Livro foram removidas da lista.  

3 - Considere uma lista linear duplamente encadeada cujos nós armazenam objetos da classe Livro. Considere ainda que a referida lista ESTÁ ORDENADA e PODE CONTER elementos  repetidos. Implemente uma função para remover um dado Livro da lista. A função deverá receber  como parâmetro o Livro a ser removido. A função deverá retornar quantas ocorrências do Livro foram removidas da lista.

4 - Considere uma lista linear duplamente encadeada (vazia ou não) cujos nós devem  armazenar objetos da classe Pessoa (Atributos: RG, nome, idade, gênero (M/F), peso e altura).  Considere ainda a existência de duas outras listas duplamente encadeadas que estão inicialmente vazias e que devem ser preenchidas da seguinte forma: a primeira, com os dados  das pessoas do gênero masculino encontradas na lista principal; a segunda, com os dados das  pessoas do gênero feminino encontradas na lista principal. Implemente um método que irá  percorrer a lista principal e quebrá-la em duas, fazendo o preenchimento das duas outras listas,  segundo o critério acima especificado.  

OBS1: A lista geral não está ordenada, porém as listas geradas pelo método a ser implementado  devem estar ordenadas por RG.  

OBS2: O campo que identifica unicamente uma pessoa é o RG. A lista original pode conter mais  de uma ocorrência da mesma pessoa (mesmo RG), porém as duas novas listas geradas não podem conter pessoas com mesmo RG (ou seja, uma pessoa não pode aparece mais de uma  vez nas listas geradas).

OBS3: Ao final da execução do método, a lista original deve estar vazia.

OBS4: O método implementado deve receber como parâmetro as duas listas vazia a serem  preenchidas.
