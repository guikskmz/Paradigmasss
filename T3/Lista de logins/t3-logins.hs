-- Nome: Guilherme Kaminski dos Santos
-- T3 - Haskell - log

import Data.Char

nusr :: String -> String
nusr (x:xs) = map (toLower) ( x : reverse ( takeWhile (/= ' ')(reverse xs) ) )

main :: IO ()
main = do
    strcontent <- readFile "nomes.csv"
    let strlist = lines strcontent
        strnew = map (\y -> y ++ "," ++ nusr y) strlist
    writeFile "logins.csv" (unlines strnew)
