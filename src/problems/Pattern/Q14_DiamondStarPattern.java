package problems.Pattern;
/*

#### Q14: Diamond Star Pattern

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

public class Q14_DiamondStarPattern {

    public static void diamondStarPattern(int n){

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n-row; col++) {
                System.out.print(" ");
            }

            for (int triangle = 0; triangle <= row; triangle++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        diamondStarInvertedPattern(n);
    }


//  #### Diamond Star Inverted Pattern

    public static void diamondStarInvertedPattern(int n){

        for (int row = 1; row < n; row++) {

            for (int triangle = 0; triangle <= row; triangle++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= n-row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
