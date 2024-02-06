# Strummin' and Summin'

Use this [compiler website](https://crypto.stanford.edu/~blynn/lambda/sk.html) to encode the following functions

```
succ = \n f x -> f(n f x)
add = \m n -> m succ n
main = add
```

Output : `s(skk)(k(s(s(ks)k)))`

- This is the program for adding two church numerals together.

- Take this output in SK compbinator form and convert S's to A's and K's to E's as specified in the challenge to get the required expression.

Giving, `A(AEE)(E(A(A(EA)E)))`

- Submit the expression to the program to get the flag.

## Flag
```
cruXipher{Play_Free_Bird_Next}
```
