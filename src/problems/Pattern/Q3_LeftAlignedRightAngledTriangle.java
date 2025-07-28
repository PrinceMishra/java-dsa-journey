package problems.Pattern;
/*


#### Q3: Left-Aligned Right-Angled Triangle

Input: `n = 4`

```
*
* *
* * *
* * * *
```

---

 */
public class Q3_LeftAlignedRightAngledTriangle {

    public static void leftAlignedRightAngledTriangle(int n){
        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
