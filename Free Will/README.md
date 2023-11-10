# Free Will

The provided [free.will](./free.will) file is a pdf, changing it to a .pdf file gives a locked pdf.

We run the `strings` command on this file, and `grep` it with "cruXipher" to get the imgure link [cruXipher{https://imgur.com/a/Fp01slI}](https://imgur.com/a/Fp01slI).

This image contains a flag of Korea. We translate the contents of [string.txt](./string.txt) from Korean to English to get `distort`.

This is the password and upon unlocking the pdf, there is some white colored text at the bottom of the [pdf file](./free.pdf), which is the flag.

## Flag
```
cruXipher{f0rg3t_m3_n0t}
```
