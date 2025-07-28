package problems.Pattern;

/*

#### Q4: Inverted Left-Aligned Triangle

Input: `n = 4`

```
* * * *
* * *
* *
*
```

---

*/

public class Q4_InvertedLeftAlignedTriangle {

    public static void invertedLeftAlignedTriangle(int n){

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n ; col++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
