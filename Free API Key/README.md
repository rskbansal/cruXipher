# Free API Key

```
Soymitra, the dev sec of crux, has been fed up with a particular member of crux because of his unhealthy obsession with goth girls and also the fact that he committed a secret API key on his repo. Soymitra has given you an image of this crux member and tasked you with finding him and breaking his legs with a baseball bat. You got to know that the API key was used to access the High Performance Compute facility for the campus and you figure you can use this facility to run your own projects and tasks which require a good CPU for free. Like the morally upstanding person you are, you decide to search for this API key. The flag is in the format cruXipher{<flag>}
```

We were provided an image of a person, which we eventually traced to [this](https://github.com/TheComputerM/) github user.ss

Looking through their commits for a repo called 'jwt-cracker' under the dev branch revealed the flag.

Flag : `cruXipher{train_anime_ml_models}`