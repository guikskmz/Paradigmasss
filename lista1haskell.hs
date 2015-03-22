-- Nome: Guilherme Kaminski dos Santos
-- Lista1 - Haskell


--    PARTE1 - PROGRAMACAO


--  1)Escreva uma fun��o hasEqHeads :: [Int] -> [Int] -> Bool que verifica se as 2 listas possuem o mesmo primeiro elemento. Exemplo de uso:

hasEqHeads :: [Int] -> [Int] -> Bool
hasEqHeads x y = if (head x) == (head y) then True else False


--  2) (apenas observar a fun��o)


--  3)Escreva uma fun��o recursiva add10, que adicione a constante 10 a cada elemento de uma lista, produzindo outra lista.

add10 :: [Int] -> [Int]
add10 [] = [] 
add10 a =(head a) + 10 : add10 (tail a)


--  4)Escreva uma fun��o recursiva addComma, que adicione uma v�rgula no final de cada string contida numa lista.
--   Dica: (1) Strings s�o listas de caracteres. (2) Para concatenar listas, use o operador ++.

addComma :: [String] -> [String]
addComma [] = []
addComma a =(head a) ++ "," : addComma (tail a)


--  5)Refa�a os 2 exerc�cios anteriores usando a fun��o de alta ordem 'map'.


add102 :: [Int] -> [Int]
add102 [] = [] 
add102 a = map (+10) a 



addComma2 :: [String] -> [String]
addComma2 [] = [] 
addComma2 a = map (++ ",") a



--  6)Crie uma fun��o htmlListItems :: [String] -> [String], que receba uma lista de strings
--   e retorne outra lista contendo as strings formatadas como itens de lista em HTML.
--   Dica: use map e defina uma fun��o auxiliar a ser aplicada a cada elemento.


htmlListItens :: [String] -> [String]
htmlListItens [] = []
htmlListItens a = ( "<LI>" ++ head a ++ "</LI>" ) : htmlListItens(tail a)


--  7)Crie uma fun��o recursiva charFound :: Char -> String -> Bool, que verifique se o caracter (primeiro argumento)
--   est� contido na string (segundo argumento).

charFound :: Char -> String -> Bool
charFound ca st 
		| st == [] = False
		| ca == (head st) = True
		| ca /= (head st) = charFound ca (tail st)


--  8)Reescreva a fun��o anterior sem recurs�o, usando outras fun��es pr�-definidas j� vistas em aula.

charFound2 :: Char -> String -> Bool
charFound2 ca st
			|filter (== ca) st /= [] = True
			|filter (== ca) st == [] = False


--  9)Use a fun��o de alta ordem 'zipWith' para produzir uma fun��o que obtenha as diferen�as, par a par, dos elementos de duas listas.
--   Por exemplo: para listas de entrada [1,2,3,4] e [2,2,1,1], o resultado ser� [-1,0,2,3].

diff :: [Int] -> [Int] -> [Int]
diff [] [] = []
diff a b = zipWith (-) a b




--     PARTE2 - ALTA ORDEM



--  1)Dada uma lista de n�meros, calcular 2*n+1 para cada n�mero n contido na lista.

eq :: [Int] -> [Int]
eq [] = []
eq x = map (\x -> 2*x+1) x


--  2)Dadas duas listas X e Y de n�meros inteiros, calcular 4*x+2*y+1 para cada par de n�meros x e y pertencentes �s listas.

eq2 :: [Int] -> [Int] -> [Int]
eq2 [] [] = []
eq2 a b = zipWith (\a b -> 4*a+2*b+1) a b


--  3)Dada uma lista de strings, produzir outra lista com strings de 10 caracteres, usando o seguinte esquema:
--   strings de entrada com mais de 10 caracteres s�o truncadas, strings com at� 10 caracteres s�o completadas com '.' at� ficarem com 10 caracteres.

dez :: [String] -> [String]
dez [] = []
dez (a:b) = take 10 (a ++ (repeat '.')) : dez b


--  4)Dada uma lista de idades, selecionar as que s�o maiores que 20 e, para cada uma, calcular o ano de nascimento correspondente
--   (aproximado, considerando o ano atual).

anonasc :: [Int]->[Int]
anonasc [] = []
anonasc a = map(2015-)(filter(>20)a)
