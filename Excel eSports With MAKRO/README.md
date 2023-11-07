# Excel eSports with MAKRO

We're given an excel sheet, with a [vbaProject.bin](./_makro.xlsm.extracted/xl/vbaProject.bin) file embedded in it.

Extract it and use [oletools](https://github.com/decalage2/oletools/) to rev the file.

We get the ASCII character codes in the flag, and we can reconstruct the flag using that.

Flag: `cruXipher{CUR53_Y0U_V1K4S}`