# Furagu No Yaiba

We are given an image. 

![](./blueprint.jpg)

Downloading it and running binwalk on it reveals a [hidden zip file](./_blueprint.jpg.extracted/4881.zip). 

After extraction, we can search for 'cruXipher' within the zipfile using a search function on any Zip Viewer and get the flag.

## Flag
```
cruXipher{r37urn_70_7h3_0n3_p13c3_m4ng4}
```