package problems.Pattern;
/*

#### Q6: Floyd’s Triangle (Number Pattern)

Input: `n = 5`

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

---


*/

public class Q6_FloydsTriangleNumberPattern {

    public static void floydsTriangleNumberPattern(int n){

        int num=1;

        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {

                System.out.print(num+" ");
                num++;
            }
            System.out.println();

        }

    }
}
