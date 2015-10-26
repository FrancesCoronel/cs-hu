a[i] = a[i] + 1;

for (j = i+1; i<=r)
a[j] = a[i] + j - i

int numcombo = factorial(n)/factorial(r)*factorial(n-r);
for (i = 1; i<= numcombo)
  for j = 1; j<= r
    print a[j]

nextcombination()