import Test.HUnit
import Test.Framework
import Test.Framework.Providers.HUnit
import Data.Monoid
import Control.Monad

-- | Binary search returning the index of the given value in the
--   given list.
chop :: Int -> [Int] -> Int
chop _ [] = -1

chop v [x]
    | x == v = 0
    | otherwise = -1

chop v xs
    | v == p = length as
    | v < p = combineIndices 0 $ chop v as
    | v > p = combineIndices ((length as) + 1) $ chop v bs
    where (as, p, bs) = splitWithPivot xs

combineIndices base sub = if sub == -1 then -1
                          else base + sub

-- | Split the list in two halves and the middle element.
splitWithPivot :: [a] -> ([a], a, [a])
splitWithPivot [] = error "can't split an empty list"
splitWithPivot [x] = ([], x, [])
splitWithPivot xs = let (as, (b:bs)) = splitAt ((length xs) `div` 2) xs 
                    in (as, b, bs)

simpleTest :: Bool
simpleTest =  (-1 == (chop 3 []))
           && (-1 == (chop 3 []))
           && (-1 == (chop 3 [1]))
           && (0 == ( chop 1 [1]))
           && (0 == (chop 1 [1, 3, 5]))
           && (1 == ( chop 3 [1, 3, 5]))
           && (2 == ( chop 5 [1, 3, 5]))
           && (-1 == (chop 0 [1, 3, 5]))
           && (-1 == (chop 2 [1, 3, 5]))
           && (-1 == (chop 4 [1, 3, 5]))
           && (-1 == (chop 6 [1, 3, 5]))
           && (0 == ( chop 1 [1, 3, 5, 7]))
           && (1 == ( chop 3 [1, 3, 5, 7]))
           && (2 == ( chop 5 [1, 3, 5, 7]))
           && (3 == ( chop 7 [1, 3, 5, 7]))
           && (-1 == (chop 0 [1, 3, 5, 7]))
           && (-1 == (chop 2 [1, 3, 5, 7]))
           && (-1 == (chop 4 [1, 3, 5, 7]))
           && (-1 == (chop 6 [1, 3, 5, 7]))
           && (-1 == (chop 8 [1, 3, 5, 7]))

main :: IO ()
main = print simpleTest
