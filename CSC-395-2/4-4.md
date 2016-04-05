# Test 3 - Next Class

- 1 sheet of paper
    + steps/figures
    + equations
- all conversion/permutation tables will be provided
- test will be next class
    + DES encryption process
        * s-box process
    + LSFR

# AES Encryption

> pages 154 to 165

- short for Advanced Encryption Standard
- A xor B xor B = A so same key used
- every stage is reversible because of above property
- AES S-box tables

{ 95 } = { y, x }
i = 0

b0 = b0 XOR b4 XOR b5 XOR b6 XOR b7 XOR c0

{ 95 }^-1 = 8A = 1000 1010

b0'     10001111        0           1           0
b1'     11000111        1           1           1
.       11100011        0           0           0
.       11110001   x    1     +     0     =     1    =  0101 > A, 0100 > 2 so 2A
.       11111000        0           0           0
.       01111100        0           1           1
.       00111110        0           1           0
b7'     00011111        1           0           0

bottom is most significant bit
top is least significant bit

- all information is diffused from three bits
    + as in info from all of P1, P2, and P3 is used to generate P1' and P2' and P3'
- equation 5.6 = page 164
- 4 transformations used in each round except the last round
    - SubBytes
    - ShiftRows
    - MixColumns
    - AddRoundKey
- last round has just 3 transformations, excluding MixColumns