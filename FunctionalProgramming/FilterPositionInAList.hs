f :: [Int] -> [Int]
f lst =  [x | (x,y) <- zip lst [0..], odd y] -- Fill up this Function

-- This part deals with the Input and Output and can be used as it is. Do not modify it.
main = do
   inputdata <- getContents
   mapM_ (putStrLn. show). f. map read. lines $ inputdata
