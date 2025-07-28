package problems.Pattern;

/*


#### Q10: Left Diagonal Pattern

Input: `n = 5`

```
*
  *
    *
      *
        *
```

---

 */

public class Q10_LeftDiagonalPattern {

    public static void leftDiagonalPattern(int n){

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n; col++) {

                if(row == col)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
