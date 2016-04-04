# Quiz Review on DES Encryption

> problem on quiz is that I XORed L0 with the key instead of XORing R0 with the key

RO = A0B13587
LO = 21CFE503

K1 = 15F098323E35

R1 = ?
L1 = ?

L0 --> 32 --> + --> R1

R0 --> 32 --> Expansion/Permutation --> 48 --> + (where K1 goes) --> 48 --> s-box --> 32 --> Permutation --> 32 --> + --> RI

K1 --> 48 --> +

## Step 1 - R0 in Binary

1010
0000
1011
0001
0011
0101
1000
0111

## Step 2 - R0 in Binary Expanded

1 1010 0
0 0000 1
0 1011 0
1 0001 0
1 0011 0
1 0101 1
1 1000 0
0 0111 1

## Step 3 - Convert K1 to Binary

> write in format of 6 bits in one line

000101
011111
000010
011000
001100
100011
111000
110101

## Step 4 - XOR R0 with K1

> this is the input for SBOX

110001
011110
010100
111010
101010
001000
001000
111010

## Step 5 - S-box

0101    S1  row 8   3
1010    S2  row 15  0
1100    S3  row 10  3
1010    S4  row 13  3
1101    S5  row 5   3
1001    S6  row 4   3
1111    S7  row 4   3
0011    S8  row 13  3

# Step 6 - Result of Permutation from S-box

01110011
01011111
10101101
01000011

# Step 7 - L0 in Binary

00100001
11001111
11100101
00000011

# Step 8 - XOR Step 6 with L0 = R1

01010010
10010000
01001000
01000000

# Step 9 - Convert Step 8 to Hexadecimal Format

R1 = 52904840

# Step 10

L1 = R0
Li = R0
Ri = R1