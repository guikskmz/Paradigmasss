-- Nome: Guilherme Kaminski dos Santos
-- Lista1 - Haskell


--    PARTE1 - PROGRAMACAO


--  1)Escreva uma função hasEqHeads :: [Int] -> [Int] -> Bool que verifica se as 2 listas possuem o mesmo primeiro elemento. Exemplo de uso:

hasEqHeads :: [Int] -> [Int] -> Bool
hasEqHeads x y = if (head x) == (head y) then True else False


--  2)Observe a função abaixo, que eleva ao cubo cada elemento da lista, produzindo outra lista.

pot3 :: [Int] -> [Int]
pot3 [] = []
pot3 a = (head a)^3 : pot3 (tail a)


--  3)Escreva uma função recursiva add10, que adicione a constante 10 a cada elemento de uma lista, produzindo outra lista.

add10 :: [Int] -> [Int]
add10 [] = [] 
add10 a =(head a) + 10 : add10 (tail a)


--  4)Escreva uma função recursiva addComma, que adicione uma vírgula no final de cada string contida numa lista.
--   Dica: (1) Strings são listas de caracteres. (2) Para concatenar listas, use o operador ++.

addComma :: [String] -> [String]
addComma [] = []
addComma a =(head a) ++ "," : addComma (tail a)


--  5)Refaça os 2 exercícios anteriores usando a função de alta ordem 'map'.


add102 :: [Int] -> [Int]
add102 [] = [] 
add102 a = map (+10) a 



addComma2 :: [String] -> [String]
addComma2 [] = [] 
addComma2 a = map (++ ",") a



--  6)Crie uma função htmlListItems :: [String] -> [String], que receba uma lista de strings
--   e retorne outra lista contendo as strings formatadas como itens de lista em HTML.
--   Dica: use map e defina uma função auxiliar a ser aplicada a cada elemento.


htmlListItens :: [String] -> [String]
htmlListItens [] = []
htmlListItens a = ( "<LI>" ++ head a ++ "</LI>" ) : htmlListItens(tail a)


--  7)Crie uma função recursiva charFound :: Char -> String -> Bool, que verifique se o caracter (primeiro argumento)
--   está contido na string (segundo argumento).

charFound :: Char -> String -> Bool
charFound ca st 
		| st == [] = False
		| ca == (head st) = True
		| ca /= (head st) = charFound ca (tail st)


--  8)Reescreva a função anterior sem recursão, usando outras funções pré-definidas já vistas em aula.


--  9)Use a função de alta ordem 'zipWith' para produzir uma função que obtenha as diferenças, par a par, dos elementos de duas listas.
--   Por exemplo: para listas de entrada [1,2,3,4] e [2,2,1,1], o resultado será [-1,0,2,3].




--     PARTE2 - ALTA ORDEM



--  1)Dada uma lista de números, calcular 2*n+1 para cada número n contido na lista.


--  2)Dadas duas listas X e Y de números inteiros, calcular 4*x+2*y+1 para cada par de números x e y pertencentes às listas.


--  3)Dada uma lista de strings, produzir outra lista com strings de 10 caracteres, usando o seguinte esquema:
--   strings de entrada com mais de 10 caracteres são truncadas, strings com até 10 caracteres são completadas com '.' até ficarem com 10 caracteres.


--  4)Dada uma lista de idades, selecionar as que são maiores que 20 e, para cada uma, calcular o ano de nascimento correspondente
--   (aproximado, considerando o ano atual).
