//loops in java ...................... for loop

// public class loops {

//     public static void main(String args[]) {
//         for (int i = 0; i < 11; i++) {
//             System.out.println(i);
//         }
//     }
// }

//while loop example................................es mein condition loop sa bhar hote hai or updating loop ka ander .....

// public class loops {

//     public static void main(String args[]) {
//         int i = 0;                    // condition loop ka bhar hote hai....
//         while (i < 11) {
//             System.out.println(i);
//             i++;                      // updating loop ka ander hote hai...
//         }
//     }
//  }

//do while loop example.............

// public class loops {

//     public static void main(String args[]) {
//         int i = 0; // condition loop ka bhar hote hai...
//         do {

//             System.out.println(i);
//             i++; // updating loop ka ander hote hai....
//         } while (i < 21);
//     }
// }

//practious q1...............

// import java.util.*;

// public class loops {
//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);
//         int n = Sc.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             sum = sum + i;
//         }
//         System.out.println(sum);
//         Sc.close();
//     }
// }

//q2.............

// import java.util.*;

// public class loops {
//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);
//         int n = Sc.nextInt();
//         System.out.println("multiplication table of " + n + " is :");

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n * i);
//         }
//         Sc.close();
//     }
// }

// // home work q1....................

// import java.util.*;

// public class loops {
//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);
//         int n = Sc.nextInt();
//         System.out.println("even number to " + n + " is : ");

//         for (int i = 1; i < n; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i);
//             }

//         }
//         Sc.close();
//     }
// }

//HOME WORK Q2........................

import java.util.*;

public class loops {
    public static void main(String args[]) {

        Scanner Sc = new Scanner(System.in);
        int choice;

        int mark = Sc.nextInt();

        do {
            System.out.println("1. enter the mark,  ,  loop band kar ka liya o:");
            choice = Sc.nextInt();

            if (choice == 1) {
                System.out.println("mark dalya 0 to 100 ka bich mein hai ");

            }
            if (mark >= 90) {
                System.out.println("this is good");

            } else if (mark >= 60 && mark <= 89) {
                System.out.println("this is also good");
            } else if (mark >= 0 && mark <= 59) {
                System.out.println("this is good as well");
            } else {
                System.out.println("this is not good");
            }
        } while (choice == 1);

        Sc.close();
    }
}

// import java.util.*;

// public class loops {
// public static void main(String args[]) {

// Scanner Sc = new Scanner(System.in);
// int choice;

// do {
// System.out.println("1. Marks daalne ke liye 1 dijiye, program band karne ke
// liye 0:");
// choice = Sc.nextInt(); // Choice har baar poochhna chahiye

// if (choice == 1) {
// System.out.println("Marks daaliye (0 se 100 ke beech): ");
// int mark = Sc.nextInt(); // Har baar naye mark input lo

// if (mark >= 90 && mark <= 100) {
// System.out.println("This is Good");
// } else if (mark >= 60 && mark <= 89) {
// System.out.println("This is also Good");
// } else if (mark >= 0 && mark <= 59) {
// System.out.println("This is Good as well");
// } else {
// System.out.println("This is not good (Invalid marks)");
// }
// }

// } while (choice == 1);

// System.out.println("Loop is end");
// Sc.close();
// }
// }
