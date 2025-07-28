package problems.Pattern;
/*

#### Q9: Number Pyramid (Centered)

Input: `n = 5`

```
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5
```

---

 */

public class Q9_NumberPyramidCenteredPattern {


    public static void numberPyramidCenteredPattern(int n){
        int num=1;

        for (int  row = n-1; row >=0; row--) {

            for (int col = 0; col<n; col++) {

                if(col>=row){
                    System.out.print(num);
                    num++;
                }
                else{
                    System.out.print(" ");
                }
            }
            num=1;

            System.out.println();
        }
    }

//
//    public static void numberPyramidCenteredPattern2(int n){
//        int num=1;
//
//        for (int  row = 1; row <= n; row++) {
//            for (int col = 1; col<=n-row; col++) {
//
//                System.out.print(" ");
//
//            }
//            for (int col=1;col<=row;col++){
//                System.out.print(col);
//            }
//
//            System.out.println();
//        }
//    }

}
