// This is a placeholder for the advanced pattern Java class.

//buterfly pattern.................

// import java.util.*;

// public class adv {

//     public static void main(String args[]) {

//         int n = 5; // Number of rows for the butterfly pattern

//         // Upper part of the butterfly

//         for (int i = 1; i <= n; i++) {
//             // Left side stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // Spaces in the middle
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             // Right side stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();

//         }

//         // Lower part of the butterfly

//         for (int i = n; i >= 1; i--) {
//             // Left side stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // Spaces in the middle
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             // Right side stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

// }

// solid rhombus pattern.................

//  public class adv {

//     public static void main(String args[]) {
//  {

//         int n = 8; // Number of rows for the solid rhombus

//         for (int i = 1; i <= n; i++) {

//             // Print leading spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // Print stars
//             for (int j = 1; j <= n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

//number pyramid pattern.................

// public class adv {

//     public static void main(String args[]) {
//         int n = 5; // Number of rows for the number pyramid

//         for (int i = 1; i <= n; i++) {
//             // Print leading spaces

//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // Print numbers in each row

//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }

//     }
// }

//palindrome pattern.................

// public class adv {

//     public static void main(String args[]) {
//         int n = 5; // Number of rows for the palindrome pattern

//         for (int i = 1; i <= n; i++) {

//             // Print leading spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // Print decreasing numbers
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }

//             // // Print increasing numbers
//             for (int j = 2; j <= i; j++) {
//                 System.out.print(j);
//             }

//             System.out.println(); // Move to the next line after each row
//         }

//     }
// }

//diamond pattern.................

public class adv {

    public static void main(String args[]) {

        int n = 5; // Number of rows for the diamond pattern

        // Upper part of the diamond

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part of the diamond

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
