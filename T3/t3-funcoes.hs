-- Nome: Guilherme Kaminski dos Santos
-- T3 - Haskell



--  1)
firstName :: String -> String
firstName x = if (head x) /= ' ' then (head x) : firstName (tail x) else []

--  2)
firstName2 :: String -> String
firstName2 str = head(words str)

--  3)
lastName :: String -> String
lastName str = last(words str)

--  4)
userName :: String -> String 
userName x = map (toLower) ((head x) : reverse (takeWhile (> ' ') (reverse x)))


--  5)
encodeName :: String -> String
encodeName str = 
	let d c
		|c == 'a' = "4"
		|c == 'e' = "3"
		|c == 'i' = "1"
		|c == 'o' = "0"
		|c == 'u' = "00"
		|otherwise = [c]
	in concat(map (d) str)

--  6)

isElem :: Int -> [Int] -> Bool
isElem x y
	|filter (== x) y == [] = False
	|otherwise = True

--  7)

nVogais :: String -> Int
nVogais [] = 0
nVogais x = (cont (head x)) + (nVogais (tail x))
	where cont x
		| x == 'a' = 1
		| x == 'e' = 1
		| x == 'i' = 1
		| x == 'o' = 1
		| x == 'u' = 1
		| otherwise = 0

--  8) ----------

--  9)
isInt :: String -> Bool
isInt [] = False 
isInt x = if length (x)/= length (filter (\x-> (x == '0') || (x == '1') || (x == '2') || (x == '3') || (x == '4') || (x == '5') || (x == '6') || (x == '7') || (x == '8') || (x == '9') && (x /=' ')) x) then False else True

--  10)  -----------