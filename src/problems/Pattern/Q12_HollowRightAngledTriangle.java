package problems.Pattern;
/*

#### Q12: Hollow Right-Angled Triangle

Input: `n = 5`

```
*
* *
*   *
*     *
* * * * *
```

---

 */

public class Q12_HollowRightAngledTriangle {

   public static void hollowRightAngledTriangle(int n){

       for (int row = 0; row < n; row++) {

           for (int col = 0; col < n; col++) {

               if(row == col || row == n - 1 || col==0)
                   System.out.print("* ");
               else
                   System.out.print("  ");
           }

           System.out.println();
       }
   }

}
