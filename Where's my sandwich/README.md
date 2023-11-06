# Where's my sandwich?

We know that the server is running nginx, so we ran [https://github.com/stark0de/nginxpwner](https://github.com/stark0de/nginxpwner) on the website to check for any vulnerabilities.

We noticed a different response code from the pages “/recipes/” [200] and “/recipes../” [403], so we decided to inspect further.

The URL [http://sandwich.cruxipher.crux-bphc.com/recipes../SUPER_IMPORTANT.txt](http://sandwich.cruxipher.crux-bphc.com/recipes../SUPER_IMPORTANT.txt) contains the login credentials for the website, from which we get the ext4 file.

We mounted the file using the commands:

```
$ mount vault_with_hole.ext4 /mnt/tmp
$ df -hT
```

After which we got a file `/dev/loop0` correlated with this mount. We read the file’s contents using cat and found the flag.

Flag: `cruXipher{1tal1an-p4st4-w3ch}`

