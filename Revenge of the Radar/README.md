# Revenge of the Radar

```
nc 103.177.232.41 5003
```

We decompiled the [given file](./chall) to C code, and upon examining we saw that the passkey requires 3 characters (and a terminating \0 at the end).

We wrote a [simple script](./genpwd.py) to bruteforce the passkey

From this we are able to get “pas” as one of the passkeys (“password” also works, so I guess all that effort wasn’t required).

In any case, we now have to do a buffer overflow attack.

Initially our exploits failed, however upon learning about socat, we find out that it requires an escape sequence, `\x16`, for the binary string input.

We run [our new exploit](./exploit.py) and get the flag.

## Flag
```
cruXipher{fr0m_k3y804rd_m45h1n6_70_574ck_5m45h1n6}
```
