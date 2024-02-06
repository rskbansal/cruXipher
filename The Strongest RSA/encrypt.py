from Crypto.Util.number import getPrime as gP, GCD
from Crypto.Random.random import getrandbits as rand
from secret import flag


flag_int = int.from_bytes(flag, "big")
p = gP(1024)
q = gP(1024)

n = p*q
t = (p-1)*(q-1)

while True:
    e1 = rand(256)
    e2 = rand(256)
    if (GCD(e1, e2) != 1):
        continue
    if (GCD(e1, t) != 1):
        continue
    if (GCD(e2, t) != 1):
        continue
    break

enc1 = pow(flag_int, e1, n)
enc2 = pow(flag_int, e2, n)
enc_a = pow(enc1, e2, n)
enc_b = enc1*enc2

print('enc_a =', enc_a)
print('enc_b =', enc_b)
print('e1 =', e1)
print('e2 =', e2)
print('n =', n)



