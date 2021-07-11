<!-- Visualizador online: https://stackedit.io/ -->
 ![Logo da UDESC Alto Vale](http://www1.udesc.br/imagens/id_submenu/2019/marca_alto_vale_horizontal_assinatura_rgb_01.jpg)

---
# Simulador de Tráfego em Malha Viária

---

Trabalho realizado para a disciplina de Desenvolvimento de Sistemas Paralelos e Distribuídos do [Centro de Educação Superior do Alto Vale do Itajaí (CEAVI/UDESC)](https://www.udesc.br/ceavi)<br> O objetivo do trabalho é desenvolver um simulador de tráfego. Neste simulador há veículos que se movem pelas vias de uma malha viária. A malha é informada através de arquivo. 


---

# Sumário 
* [Equipe](#equipe)
* [Cenário Base e Especificação](#problema)
* [Modelagem e diagramas](#modelagem)

---

## [Equipe](#equipe)
 - [**Robson de Jesus**](mailto:robson.jesus@edu.udesc.br) - [robsondejesus1996](https://github.com/robsondejesus1996)
 - [**Brenda Paetzoldt Silva**](mailto:brenda.bps@edu.udesc.br) - [brendapaetzoldt](https://github.com/brendapaetzoldt)


---


## [Cenário Base e Especificação](#problema)

Especificação dos Veículos<br>
a) Cada veículo deve ser um thread.<br>

b) O veículo se movimenta pela malha, uma posição por vez, respeitando o sentido de fluxo da
pista. O veículo só pode se mover caso a posição à frente esteja livre.<br>

c) Ao se deparar com um cruzamento:
• Deve escolher, aleatoriamente, uma das vias de saída do cruzamento para seguir. A
escolha deve ser feita antes do veículo ingressar no cruzamento.<br>

d) Só deve se mover pelo cruzamento se todas as posições por onde vai passar estiverem
totalmente livres (exclusão mútua).<br>

e) Não deve bloquear o cruzamento de outros veículos (ficar parado no cruzamento).<br>

f) Novos veículos são inseridos nos pontos de entrada da malha (ver especificação da malha)<br>

g) Ao atingir um ponto de saída (ver especificação da malha), o veículo deve ser encerrado.<br>

h) Veículos possuem velocidades de movimentação diferente (tempo de sleep a cada passo).<br>


a) Deve ser carregada de um arquivo texto.<br>

b) Nas duas primeiras linhas estão a quantidade de linhas e colunas da malha, respectivamente.<br>

c) As próximas linhas especificam o tipo de cada segmento (célula) da malha:<br>

Valor (int) Tipo de segmento (movimentos permitidos) <br>
0 Nada (célula não usada pela malha)<br>
1 Estrada Cima<br>
2 Estrada Direita<br>
3 Estrada Baixo<br>
4 Estrada Esquerda<br>
5 Cruzamento Cima<br>
6 Cruzamento Direita<br>
7 Cruzamento Baixo<br>
8 Cruzamento Esquerda<br>
9 Cruzamento Cima e Direita<br>
10 Cruzamento Cima e Esquerda<br>
11 Cruzamento Direita e Baixo<br>
12 Cruzamento Baixo e Esquerda<br>


d) Características gerais das vias:<br>

i) São sempre horizontais ou verticais (não haverá vias em diagonal).<br>

ii) São de mão dupla (ou seja, possuem duas pistas)<br>

iii) Nas bordas, só haverá vias perpendiculares.<br>

iv) Entre vias paralelas, haverá sempre ao menos uma linha ou coluna em branco (ou seja,
não haverá vias “grudadas” umas nas outras).<br>

e) Identificação de pontos de entrada e de saída de veículos:<br>

i) Entrada: posição inicial da pista que está em uma das bordas da malha.<br>

ii) Saída: posição final da pista que está em uma das bordas da malha.<br>


---