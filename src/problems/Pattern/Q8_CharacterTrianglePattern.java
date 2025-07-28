package problems.Pattern;
/*

#### Q8: Character Triangle

Input: `n = 3`

```
A
A B
A B C
```

---

 */

public class Q8_CharacterTrianglePattern {

        public static void characterTrianglePattern(int n){
            char ch;

            for (int row = 0; row < n; row++) {
                ch ='A';
                for (int col = 0; col < row; col++) {
                    System.out.print(ch+" ");
                    ch++;
                }

                System.out.println();

            }

        }

}
