# Prime Mates

This RSA challenge has the values of e, N, and the ciphertext c given, along with the code used to encrypt the message.

We can get P and Q using a factorDB lookup. Since the Totient and e are not co-prime, we cannot obtain a single message.

We use the code found [here](https://github.com/jvdsn/crypto-attacks/blob/master/attacks/rsa/non_coprime_exponent.py) and write all possible messages to a file.

Searching for 'cruXipher' in that file yields the flag.

## Flag
```
cruXipher{RS4?_M0re_1!ke_4RSe}
```