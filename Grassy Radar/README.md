# Grassy Radar

```
nc 103.177.232.41 5004
```

We decompiled the [given file](./chall) to C code, and upon examining we saw that the passkey requires 6 characters.

Using some basic maths we are able to find the ASCII values for these characters and therefore the passkey: **aIrXyG**

The program prompts a max 20 character input, exceeding which gave the flag.

Flag: **cruXipher{0n1y_w34k11n65_u53_c41cu1470r5}**

