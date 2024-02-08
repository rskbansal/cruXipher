# The Strongest RSA
- We have been given 2 files - `encrypt.py` & `output.txt`
- The python file ecnrypts the flag using RSA with 2 different public exponents - $e1$ & $e2$ and the same modulus $n$
- Further, the 2 obtained ciphertexts - $enc1$ & $enc2$ are manipulated & $enc\\_a$ & $enc\\_b$ are printed in the output file along with the publics exponents & modulus


  $enc\\_a = (flag\\_int^{e1}\\mod n)^{e2}\\mod n$<br>
  $enc\\_a = flag\\_int^{e1*e2}\\mod n$<br>
  
  $enc\\_b = (flag\\_int^{e1}\\mod n)*(flag\\_int^{e2}\\mod n)$<br>
  $enc\\_b\\mod n = flag\\_int^{e1+e2}\\mod n$

- This is a simple common modulus attack with ciphertexts - $enc\\_a$ & $(enc\\_b\mod n)$ and public exponents - $(e1*e2)$ & $(e1+e2)$
- On running the [`solve.py`](https://github.com/rskbansal/cruXipher/blob/main/The%20Strongest%20RSA/solve.py) script, we get the flag!

## Flag
```
cruXipher{X11_w@s_@_cr0N_j0b}
```
