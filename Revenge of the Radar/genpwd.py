for i in range(65, 123):
    for j in range(65, 123):
        for k in range(65, 123):
            if (j + ((k & 15) << 4 | (i ^ j))) == 0x73 and ((i + k ^ (i ^ 0x38) | (j >> 3))) == 0xac:
                print(chr(k)+chr(j)+chr(i))

