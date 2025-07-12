package problems.Pattern;
/*
#### Q11: Cross Pattern (Both Diagonals)

Input: `n = 5`

```
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
```

---

*/

public class Q11_DiagonalPattern {

    public static void diagonalPattern( int n){

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {

                if(row==col || (row+col==n+1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

}
