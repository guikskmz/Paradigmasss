-- Nome: Guilherme Kaminski dos Santos
-- Lista2 - Haskell


--    PARTE1 - List comprehension


--    1) Escreva uma fun��o geraPotencias :: Int -> [Int], que gere uma lista com as pot�ncias de 2
--   com expoente de n at� 0, onde n � o argumento para a fun��o. Use a sintaxe de list comprehension. 

geraPot :: Int -> [Int]
geraPot x = [(2^x) | x <- [x,x-1..0]]


--    2) Escreva uma fun��o addSuffix :: String -> [String] -> [String]
--   usando list comprehension, para adicionar um sufixo �s strings contidas numa lista. 

addSuffix :: String -> [String] -> [String]
addSuffix s ls =  [(ls++s) | ls <- ls]


--    3) Escreva uma fun��o anosDeNascimento :: [Int] -> [Int] que receba uma lista de idades,
--   selecione as que s�o maiores que 20 e, para cada uma das selecionadas, calcule o ano de nascimento correspondente (aproximado).
--   Use a sintaxe de list comprehension.

anosDeNascimento :: [Int] -> [Int]
anosDeNascimento x = [(2015-x) | x <- x , x > 20]