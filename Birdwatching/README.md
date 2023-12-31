# Birdwatching
- Used https://www.angelfire.com/tx4/cus/combinator/birds.html to figure out the lambda/combinator expressions for the birds given in the input file.

- Then used this [compiler](https://crypto.stanford.edu/~blynn/lambda/sk.html) to encode them as follows :-

    ```
    M = \x -> x x -- Mockingbird
    S = \a b e -> (a e) (b e) -- starling
    K = \x y -> x -- Kestrel
    I = S K K -- identity 
    B = \a b c -> a (b c) -- Bluebird
    B2  = B B B -- Blackbird
    C = \a b c -> a c b -- Cardinal
    D = B B -- Dove
    Q = C B -- Queer
    O = S I -- Owl
    ```

- Set the main function as each line given in [birds.txt](./birds.txt) & run.

- Number is automatically provided by the compiler if the main function returns a *Church Numeral*.

## Flag
```
cruXipher{42.331}
```