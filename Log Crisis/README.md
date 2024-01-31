# Log Crisis
- First tried to understand the [python](./grid_Search.py) file, but it didn't lead to much .
- Next analysed the [json](./output.json) file and ruled out the degree 0 entries as all the errors (underlined red thanks to vsc) had degree 0 .
- Then extracted all the "text\\" entries with degree 1, converted those values from hex to text, and found the intended flag .
## Flag
```
cruXipher{0ka7_F1ne_Y0u_w1n873146913}
```
