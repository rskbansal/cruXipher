# Free Will

```
One of your best agents, Will, has been captured while spying on a secret organization, name unknown. The organization members proceeded to take his comms device from him, and used it to send you the following message: “Caught an uninvited guest. Want him back? :)”. As a taunt, they also sent a file, free.will, with the promise that its contents will help you get your agent back, assuming you can decrypt it. "We'll even be so nice as to tell you the password begins with 'd'." Fortunately, Will had a backup device, and was able to send a string (in string.txt), along with the message “saw a member type this out. could only see their keyboard, not screen, so dont know what it means. might be useful.” It is now up to you to crack their code in order to see your agent again. The flag is in the format cruXipher{<flag>}
```


The provided [free.will](./free.will) file is a pdf, changing it to a .pdf file gives a locked pdf.

We run the `strings` command on this file, and `grep` it with "cruXipher" to get the imgure link [cruXipher{https://imgur.com/a/Fp01slI}](https://imgur.com/a/Fp01slI).

This image contains a flag of Korea. We translate the contents of [string.txt](./string.txt) from Korean to English to get `distort`.

This is the password and upon unlocking the pdf, there is some white colored text at the bottom of the [pdf file](./free.pdf), which is the flag.

Flag: `cruXipher{f0rg3t_m3_n0t}`
