let fib n = 
	let rec f i a b =
	        if i = n then a
	        else f (i+1) (b) (a+b) 
	in f 0 0 1

in print_int (fib 6);;
