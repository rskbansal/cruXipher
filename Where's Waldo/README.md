# Where's Waldo

We are given a PDF with a clue related to spam. Using [Spam Mimic](https://www.spammimic.com/) we decode it, which yeilds the link to an image.

Downloading the image and running steghide on it yeilds a base64 string, which when decoded gives an imgur link.

Downloading the imgur image and running steghide on it again, yields another base64 string, which gives the flag when decoded.

Flag: `cruXipher{n0b0dy_ev3r_ask5_how5_w4ld0}`