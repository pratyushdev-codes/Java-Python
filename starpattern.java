public class starpattern {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
    }
    //pattern 1
// *
// **
// ***
// ****
    
    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //pattern 2
// ****
//  ***
//   **
//    *
    public static void pattern2(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

    // pattern 3
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 

   public static void pattern3(int n) {
    for (int row = 1; row <= n; row++) {
        for (int col = 1; col <= row; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
    }
}
}
