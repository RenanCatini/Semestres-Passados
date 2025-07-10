{- Lista 2: Programação Funcional -}
import Data.Char

-- Exercicio 1: 
powCen :: [Int]
powCen = [x*x | x <- [1..100]]

-- Exercicio 2:
replicate2 :: Int -> a -> [a]
replicate2 x e = [e | _ <- [1..x]] 

-- Exercicio 3:
pyths :: Int -> [(Int, Int, Int)] 
pyths l = [(x,y,z) | x <- [1..l], y <- [1..l], z <- [1..l], x*x + y*y == z*z]

-- Exercicio 4: ?????

-- Exercicio 5: 
provList :: [(Int,Int)]
provList = [(x,y) | x <- [1,2,3], y <- [4,5,6]]

-- Exercicio 6:
positions :: Eq a => a -> [a] -> [Int]
positions x xs = find x (zip xs [0..n])
    where n = (length xs) - 1

find :: Eq a => a -> [(a,Int)] -> [Int]
find x xs = [n | (e,n) <- xs, e == x]

-- Exercicio 7:
scalarproduct :: [Int] -> [Int] -> Int
scalarproduct xs ys = sum [x*y | (x,y) <- zip xs ys]

-- Exercicio 8: ???

-- Exercicio 9:
altSete :: [Int]
altSete = map (+7) (filter odd [1..10])
    
-- Exercicio 10: 
dec2int :: [Int] -> Int
dec2int l = foldl (+) 0 [x*(10^y) | (x,y) <- zip (reverse l) [0..(length l)]]

-- Exercicio 11:
unfold p h t x
    | p x = []
    | otherwise = h x : unfold p h t (t x)

listPowTwo :: [Int]
listPowTwo = unfold (>10) (2^) (+1) 1 

-- Exercicio 12:
evenCubes :: Int -> [Int] 
evenCubes x = [x^3 | x <- [1..x], even x]

-- Exercicio 13:
insertOrd :: Int-> [Int]-> [Int]
insertOrd x xs = [a | a <- xs, a < x] ++ [x] ++ [b | b <- xs, b > x]

-- Exercicio 14:
howManyMultiples :: Int -> Int -> Int -> Int
howManyMultiples x a b = foldl (+) 0 [1 | y <- [a..b], y `mod` x == 0]

-- Exercicio 15:
duplicate::String->Int->String
duplicate s n = foldr (++) s [s | _ <- [1..(n-1)]]

-- Exercicio 16:
pushRight::String->Int->String
pushRight s n = ['>' | _ <- [1..(n - length s)]] ++ s

-- Exercicio 17: ????

-- Exercicio 18:
separa :: [Int] -> ([Int],[Int])
separa l = ([x | x <- l, even x], [y | y <- l, odd y])

-- Exercicio 19: 
converte :: [Int] -> String
converte l = [chr (c + (ord 'A' - 1)) | c <- l]

-- Exercicio 20:
conta :: [Char] -> Char -> Int
conta s c = foldl (+) 0 [1 | a <- s, a == c]

--a)
proliferaInt :: [Int] -> [Int]
proliferaInt l = foldl (++) [] [[n | x <- [1..n]] | n <- l]

-- Exercicio 21:
proliferaChar :: [Char] -> [Char]
proliferaChar l = foldl (++) [] [[n | x <- [1..(ord n - ord 'A' + 1)]] | n <- l]

-- Exercicio 22:
procuraElemento :: Int-> [Int]-> Bool
procuraElemento n (x:xs) = n == x || procuraElemento n xs

procuraElemento2 :: Int-> [Int]-> Bool
procuraElemento2 n (x:xs) = procuraElemento n xs || n == x

---------------------------------------------------------------------------------------
{- Exercicios Complementares -}
-- 1)
sumOddCubes :: Int
sumOddCubes = foldl (+) 0 [x^3 | x <- [1..50], odd x]

-- 2)
take' :: Int -> [a] -> [a]
take' x xs = [a | (a,b) <- zip xs [1..x]]

-- 3)
arithmetic :: Int -> [(Int, Int, Int)]
arithmetic x = [(a,b,c) | a <- [1..x], b<-[(a+1)..x], c <- [(b+1)..x], b-a == c-b]

-- 4) 
abundant :: Int -> [Int]
abundant x = [n | n <- [1..x], (foldl (+) 0 [a | a <- [1..(n-1)], n `mod` a == 0]) > n]

-- 5) [x*y | x <- [1,2], y <- [3,4], x < y]

-- 6)
removeAll :: Eq a => a -> [a] -> [a]
removeAll e s = [x | x <- s, x /= e]

-- 9) [x | x <- xs, even x, x > 10]
f9 :: [Int] -> [Int]
f9 xs = filter (>10) (filter even xs)


