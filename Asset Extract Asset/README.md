# Asset Extract Asset

The files have a code with a [passphrase "ChatGPT"](./asset_extract_asset/app/src/main/java/com/example/assetextractasset/db/FileDatabase.kt) and the comments hint towards a file called ['secret'](./asset_extract_asset/app/src/main/assets/secret).

This is a database file and you can use a [database browser](https://sqlitebrowser.org/) to view the file.

There is a base64 string. Decoding it, we get an image with the flag.

![](./flag.png)


## Flag
```
cruXipher{y0ur_f1r3d}
```