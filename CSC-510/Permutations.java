public class Permutations() {
  public static void Permutation() {
    int i, j, k;
    int r, s;
    j = n - 1;
    while (a[j] > a[j + 1]) {
      j = j - 1;
    }
    k = n;
    while (a[j] > a[k]) {
      k = k - 1;
    }

    temp = a[j];
    a[j] = a[k];
    a[k] = temp;
    r = n;
    s = j + 1;
    while (r > s) {
      temp + a[r];
      a[r] = a[s];
      a[s] = temp;
    }

    for (i < n)
      a[i] = i


//main
             Scanner keyboard = new Scanner(System.in)

      n = keyboard.nextInt()

          for (int i = 1; i <= n; i++)
            a[i] = i
                   factorial(n) = int numPermu
                                  for (i = 1 ; i <= numPermu; i++)
                                    for (int i = 1 ; i <= n; i++)
                                      print a[j]
                                      nextpermutaton();
    a[j] = j;

