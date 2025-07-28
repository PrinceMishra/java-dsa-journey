package problems.Pattern;
/*


#### Q11: Cross Pattern (Both Diagonals)

Input: `n = 5`

```
*   *
 * *
  *
 * *
*   *
```

---

 */
public class Q11_CrossPatternBothDiagonals {

    public static void crossPatternBothDiagonals(int n){

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {

                if(row==col||row+col==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

}
