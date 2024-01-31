# Canine Curiosities
- Used dirsearch on url: https://canine-curiosities.vercel.app to find [url/app.js](https://canine-curiosities.vercel.app/app.js)  .

- Found the token from [url/forget](https://canine-curiosities.vercel.app/forget) and then used 'cux' as user-agent to retrieve flag from [url/fact](https://canine-curiosities.vercel.app/fact) .

- Used the following command in terminal :
    ```bash
  $ curl -H "user-agent:cux" -H "token:fec62644-6db3-11ee-a34a-505bc2eeff4f" https://canine-curiosities.vercel.app/fact
    ```
- Got the following result :
    ```
    {
      "fact":"cruXipher{m0n15h4_f0R_pR0m_qV33n}"
    }
    ```

## Flag
```
cruXipher{m0n15h4_f0R_pR0m_qV33n}
```
