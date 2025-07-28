package problems.Pattern;
/*

#### Q1: Print Solid Square of Stars

Input: `n = 4`

```
* * * *
* * * *
* * * *
* * * *
```

---

 */

public class Q1_SolidSquarePattern {

    public static void solidSquarePattern(int n){

        for (int row= 0; row< n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
