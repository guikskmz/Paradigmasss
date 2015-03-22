-- Nome: Guilherme Kaminski dos Santos
-- Lista1 - Haskell



--Escreva uma fun��o hasEqHeads :: [Int] -> [Int] -> Bool que verifica se as 2 listas possuem o mesmo primeiro elemento. Exemplo de uso:
hasEqHeads :: [Int] -> [Int] -> Bool
hasEqHeads x y = if (head x) == (head y) then True else False


--Observe a fun��o abaixo, que eleva ao cubo cada elemento da lista, produzindo outra lista.
pot3 :: [Int] -> [Int]
pot3 [] = []
pot3 ns = (head ns)^3 : pot3 (tail ns)

--Escreva uma fun��o recursiva add10, que adicione a constante 10 a cada elemento de uma lista, produzindo outra lista.
add10 :: [Int] -> [Int]
add10 [] = []
add10 (x:xs) = x+10 : add10 (xs)

--Escreva uma fun��o recursiva addComma, que adicione uma v�rgula no final de cada string contida numa lista. Dica: (1) Strings s�o listas de caracteres. (2) Para concatenar listas, use o operador ++.


--Refa�a os 2 exerc�cios anteriores usando a fun��o de alta ordem 'map'.


--Crie uma fun��o htmlListItems :: [String] -> [String], que receba uma lista de strings e retorne outra lista contendo as strings formatadas como itens de lista em HTML. Dica: use map e defina uma fun��o auxiliar a ser aplicada a cada elemento. Exemplo de uso da fun��o:


--Crie uma fun��o recursiva charFound :: Char -> String -> Bool, que verifique se o caracter (primeiro argumento) est� contido na string (segundo argumento). Exemplos de uso da fun��o:


--Reescreva a fun��o anterior sem recurs�o, usando outras fun��es pr�-definidas j� vistas em aula.


--Use a fun��o de alta ordem 'zipWith' para produzir uma fun��o que obtenha as diferen�as, par a par, dos elementos de duas listas. Por exemplo: para listas de entrada [1,2,3,4] e [2,2,1,1], o resultado ser� [-1,0,2,3].


--Dada uma lista de n�meros, calcular 2*n+1 para cada n�mero n contido na lista.


--Dadas duas listas X e Y de n�meros inteiros, calcular 4*x+2*y+1 para cada par de n�meros x e y pertencentes �s listas. Exemplo:


--Dada uma lista de strings, produzir outra lista com strings de 10 caracteres, usando o seguinte esquema: strings de entrada com mais de 10 caracteres s�o truncadas, strings com at� 10 caracteres s�o completadas com '.' at� ficarem com 10 caracteres. Exemplo:


--Dada uma lista de idades, selecionar as que s�o maiores que 20 e, para cada uma, calcular o ano de nascimento correspondente (aproximado, considerando o ano atual).
