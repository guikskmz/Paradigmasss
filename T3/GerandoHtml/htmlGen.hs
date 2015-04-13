-- Nome: Guilherme Kaminski dos Santos
-- T3 - Haskell - html

-- Este programa lê um arquivo CSV, com 2 dados por linha. Cada linha é transformada numa tupla. 
-- A lista de tuplas é passada para uma função que vai gerar uma longa string representando um
-- documento HTML.
--

main :: IO ()
main = do
    strcontent <- readFile infile
    let listofstrlist = map (splitOnChar ',') (lines strcontent)
        strtuplelist = map (\lis -> (head lis, last lis)) listofstrlist
    writeFile outfile (mkHtmlURLItemsDoc "Usuarios Cadastrados no NCC" strtuplelist)
    putStrLn "Done!!"
    where 
    infile = "logins.csv"
    outfile = "output.html"


-- Esta função deve ser alterada para chamar outras funções que vão
-- construir o documento HTML

mkHtmlURLItemsDoc :: String -> [(String,String)] -> String
mkHtmlURLItemsDoc title lis = "<html>" ++ "<head><title>Usuarios Cadastrados no NCC</title></head>" ++ "<body><ul>" ++ (foldr1 (++) (addLink2 (addLink (map fst lis) (map snd lis)))) ++ "<html><body><ul>"

addLink :: [String] -> [String] -> [String]
addLink x y
    | x == [] = []
    | y == [] = []
    | otherwise = ("<li><a href=http://www.inf.ufsm.br/~"++ (head y)++ ">" ++ (head x)) : addLink (tail x) (tail y)

addLink2 :: [String] -> [String]
addLink2 x = map (++"</a></li>\n") x

-- Decompoe string usando um caracter delimitador
splitOnChar :: Char -> String -> [String]
splitOnChar x y = auxSplitOnChar x y [[]]

auxSplitOnChar :: Char -> String -> [String] -> [String]
auxSplitOnChar x [] z = reverse (map reverse z)
auxSplitOnChar x (y:ys) (z:zs) = 
	if y == x then 
            auxSplitOnChar x ys ([]:(z:zs)) 
        else 
            auxSplitOnChar x ys ((y:z):zs)