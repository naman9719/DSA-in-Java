// conditional statements(if, else if, switch, break)..java ka kuch keys words hai 

// import java.util.*;

// public class Conditions {

//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);
//         int age = Sc.nextInt();

//         if (age > 18) {
//             System.out.println("adult");

//         } else {
//             System.out.println("not adult");
//         }
//         Sc.close();
//     }

// };

//second ex............................................

// import java.util.*;

// public class Conditions {

//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);
//         int a = Sc.nextInt();
//         int b = Sc.nextInt();

//         if (a == b) {
//             System.out.println("equal");
//         } else {
//             if (a > b) {
//                 System.out.println("a is greater than b");
//             } else {
//                 System.out.println("a is less than b");
//             }
//         }
//         Sc.close();
//     }
// }

// else if example................................................

// import java.util.*;

// public class Conditions {

//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);
//         int a = Sc.nextInt();
//         int b = Sc.nextInt();

//         if (a == b) {
//             System.out.println("equal");
//         } else if (a > b) {
//             System.out.println("a is greater than b");
//         } else {
//             System.out.println("a is less than b");
//         }

//         Sc.close();
//     }
// }

// switch case example ..................................

// import java.util.*;

// public class Conditions {

//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);
//         int button = Sc.nextInt();

//         if (button == 1) {
//             System.out.println("hello");
//         } else if (button == 2) {
//             System.out.println("namaste");
//         } else if (button == 3) {
//             System.out.println("bonjour");
//         } else {
//             System.out.println("invilid input");
//         }

//         Sc.close();
//     }
// }

// ex.............................

// import java.util.*;

// public class Conditions {

//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);
//         int button = Sc.nextInt();

//         switch (button) {
//             case 1:
//                 System.out.println("hello");
//                 break;
//             case 2:
//                 System.out.println("namaste");
//                 break;
//             case 3:
//                 System.out.println("bonjour");
//                 break;
//             default:
//                 System.out.println("invilid input");
//         }
//             Sc.close();
//     }
// }

// homework q1...................................

// import java.util.*;

// public class Conditions {

//     public static void main(String args[]) {
//         Scanner Sc = new Scanner(System.in);
//         int a = Sc.nextInt();
//         int b = Sc.nextInt();
//         char op = Sc.next().charAt(0); // character input for operation....

//         switch (op) {
//             case '+':
//                 System.out.println("add = " + (a + b));
//                 break;
//             case '-':
//                 System.out.println("sub  = " + (a - b));
//                 break;
//             case '*':
//                 System.out.println("mul = " + (a * b));
//                 break;
//             case '/':
//                 if (b != 0) {
//                     System.out.println("div = " + ((double) a / b));
//                 } else {
//                     System.out.println("division by zero is not allowed");
//                 }
//                 break;
//             case '%':
//                 System.out.println("mod = " + (a % b));
//                 break;
//             default:
//                 System.out.println("invalid operation");
//         }
//         Sc.close();
//     }
//};

//q2 homework....................

import java.util.*;

public class Conditions {

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter month number (1-12)");
        int months = Sc.nextInt();

        switch (months) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("gebruary");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("setember");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("desember");

                break;

            default:
                System.out.println("inviled month");

        }
        Sc.close();
    }
};