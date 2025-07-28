package problems.Pattern;
/*

#### Q2: Print Hollow Square

Input: `n = 5`

```
* * * * *
*       *
*       *
*       *
* * * * *
```

---

 */
public class Q2_HollowSquarePattern {

    public static void hollowSquarePattern(int n){
        for (int row = 0; row <n ; row++) {

            for (int col = 0; col <n; col++) {

                if(row==0||row==n-1||col==0||col==n-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }
    }

}
