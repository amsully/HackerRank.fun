e_est :: Double->Double->Double
e_est x n = sum([(x**i)/product [1..i] | i<-[0..(n-1)]] ) -- Series Expansion of e^x to the nth term.
main = do 
	print $ e_est 5 10