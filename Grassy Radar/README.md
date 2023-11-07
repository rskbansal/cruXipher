# Grassy Radar

```
When you are outside on your monthly grass-touching session (vitamin D deficiency is not a joke), you see a small dirt mound under a tree to your left. The mound seems too big for a herd of insects to make, which intrigues you greatly. As you carefully approach it, you see a shiny metallic thing sticking out. When you pull it out of the dirt, you realise that it is a USB with an address written on the back. You sigh and realise (not unhappily) that today's grass touching session is over. The flag is in the format cruXipher{<flag>}

nc 103.177.232.41 5004
```

We decompiled the [given file](./chall) to C code, and upon examining we saw that the passkey requires 6 characters.

Using some basic maths we are able to find the ASCII values for these characters and therefore the passkey: **aIrXyG**

The program prompts a max 20 character input, exceeding which gave the flag.

Flag: `cruXipher{0n1y_w34k11n65_u53_c41cu1470r5}`

