package problems.Pattern;
/*

#### Q15: Butterfly Pattern

Input: `n = 4`

```
*      *
* *    * *
* * *  * * *
* * * * * * *

* * * * * * *
* * *  * * *
* *    * *
*      *
```

---

 */

public class Q15_ButterflyPattern {

    public static void butterflyPattern(int n)
    {
        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }

            for (int col = 1; col < n-row; col++) {
                System.out.print("- ");
            }

            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//
//     for (int row = 0; row < n; row++) {
//
//        for (int col = 0; col <= row; col++) {
//            System.out.print("* ");
//        }
//
//        for (int col = 1; col < n-row; col++) {
//            System.out.print("- ");
//        }
//
//        for (int col = 0; col <= row; col++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

}
