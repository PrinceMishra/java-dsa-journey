package problems.Pattern;
/*

#### Q13: Pascal’s Triangle

Input: `n = 5`

```
        1
      1 1
    1 2 1
  1 3 3 1
1 4 6 4 1
```

---

 */

public class Q13_PascalsTrianglePattern {

    public static void pascalsTrianglePattern(int n){

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
