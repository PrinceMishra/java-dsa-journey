package problems.Pattern;
/*

#### Q7: Increasing Number Triangle

Input: `n = 4`

```
1
1 2
1 2 3
1 2 3 4
```

---

 */

public class Q7_IncreasingNumberTrianglePattern {

    public static void increasingNumberTrianglePattern(int n){
        int num=0;
        for (int row = 1; row <= n; row++) {
            num=1;
            for (int col = 0; col < row; col++) {
                System.out.print(num+" ");
                num++;
            }

            System.out.println();

        }
    }

}
