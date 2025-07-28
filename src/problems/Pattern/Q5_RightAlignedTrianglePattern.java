package problems.Pattern;
/*

#### Q5: Right-Aligned Triangle

Input: `n = 4`

```
      *
    * *
  * * *
* * * *
```

---

 */

public class Q5_RightAlignedTrianglePattern {

    public static void rightAlignedTrianglePattern(int n){

        for (int row = n-1; row >= 0; row--) {
            for (int col = 0; col <= n; col++) {
                if(row>=col)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}
