from Crypto.Util.number import getPrime, bytes_to_long
from secret import flag
 
def gen():
    while True:
        prime = getPrime(128)
        if (prime - 1) % e == 0:
            return prime
 
e = 29
p = gen()
q = gen()
N = p * q
 
m = bytes_to_long(flag)
assert m < N
 
c = pow(m, e, N)
 
print(f"e = {e}")
print(f"N = {N}")
print(f"c = {c}")
