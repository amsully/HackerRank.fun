f :: Int -> [Int] -> [Int]

f 0 _ = []
f n (h:l) = [h | _ <- [1..n]] ++ f n l -- Complete this function

-- This part handles the Input and Output and can be used as it is. Do not modify this part.
main :: IO ()
main = getContents >>=
       mapM_ print. (\(n:arr) -> f n arr). map read. words
