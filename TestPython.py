import math
a = float(input('Enter a: '))
b = float(input('Enter b: ')) 
c = float(input('Enter c: ')) 
V = float(0) 
S = float(0)

if a <= 0 or b <= 0 or c <= 0: 
	print('Invalid figure') 
else:
	V = a * b * c 
	print('V='+str(V)) 
	S = 2*(a*c + b*c); 
	print('S='+str(S))
