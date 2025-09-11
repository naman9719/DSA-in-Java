
//function (kuch operation karna ka bad input lata hai or output data hai
//method  (return type functionName(type arg1, type arg2..){
//     operation                                  
//})

//sum  two numbers using function..............

// import java.util.*;

// public class function {

//     public static void add(int a, int b) {
//         System.out.println("Sum is: " + (a + b));
//         return;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // Taking input from user

//         System.out.println("Enter first number: ");

//         int a = sc.nextInt();
//         System.out.println("Enter second number: ");

//         int b = sc.nextInt();
//         add(a, b);                      // calling the function

//     }
// }

//multiply two numbers using function..............

// import java.util.*;

// public class function {

//     public static int Multiplicationproduct(int a, int b) {

//         System.out.println("Multiplication is = " + (a * b));

//         return (a * b);
//     }

//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         // Taking input from user

//         System.out.println("enter the first number: ");
//         int a = sc.nextInt();
//         System.out.println("enter the second number: ");
//         int b = sc.nextInt();
//         Multiplicationproduct(a, b);// calling the function
//     }
// }

//find the factorial of a number using function..............

// import java.util.*;

// public class function {

//     public static void factorial(int n) {

//         int fact = 1;

//         for (int i = n; i >= 1; i--) {
//             fact = fact * i;

//         }
//         System.out.println(fact);
//     }

//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number to find its factorial: ");

//         int n = sc.nextInt();

//         factorial(n); // calling the function

//     }

// }

// qucations in function 

// q1/.............................................................

//q1............

// import java.util.*;

// public class function {

//     public static void average(int a, int b, int c) {

//         int average = (a + b + c) / 3;

//         System.out.println("average = " + average);
//         return;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter the first valu:");
//         int a = sc.nextInt();
//         System.out.println("enter the second valu:");
//         int b = sc.nextInt();
//         System.out.println("enter the third valu:");
//         int c = sc.nextInt();

//         average(a, b, c);
//     }

// }

//q2...................................

// import java.util.*;

// public class function {

//     public static void sumodd(int n) {

//         int sum = 0;
//         for (int i = 0; i <= n; i += 2) {

//             sum += i;
//             System.out.println(i);
//         }
//         System.out.println("sumodd = " + sum);
//         return;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the valu of n:");
//         int n = sc.nextInt();
//         sumodd(n);

//     }

// }

//q3................................

//import java.util.*;

//public class function{

// public static int graternumber(int a, int b) {

//         if (a > b) {
//             return a;
//         } else {
//             return b;
//         }

//        }   
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.err.println("enter the first number;");
//         int a = sc.nextInt();
//         System.out.println("enter the second number;");
//         int b = sc.nextInt();

//         graternumber(a, b);

//          System.out.println("graternumber = " + graternumber(a, b));

//     }

// }

//q4........................................

// import java.util.*;

// public class function {

//     public static double circumference(double r) {

//         return 2 * Math.PI * r;

//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the valu r ;");
//         int r = sc.nextInt();

//         circumference(r);
//         System.out.println("circumference = " + circumference(r));

//     }
// }

//q5..............

// import java.util.*;

// public class function {

//     public static void age(int a) {

//         if (a >= 18) {
//             System.out.println("vote valid");
//         } else {
//             System.out.println("not valid");
//         }
//     }

//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the age;");
//         int a = sc.nextInt();

//         age(a);

//     }
// }

//q8..........................

// import java.util.*;

// public class function {

//     public static int rasied(int x, int n) {

//         int ras = 1;
//         for (int i = 1; i <= n; i++) {

//             ras *= x;

//         }
//         return ras;

//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the to value in power =");
//         int x = sc.nextInt();
//         int n = sc.nextInt();

//         rasied(x, n);
//         System.out.println("raied = " + rasied(x, n));
//     }

// }

//q9.......................

import java.util.*;

public class function {

    public static int commondivisor(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0)
            return a;
        if (b == 0)
            return b;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;

        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value =");
        int a = sc.nextInt();
        System.out.println("enter the second value =");
        int b = sc.nextInt();

        commondivisor(a, b);

        System.out.println(" common divisor = " + commondivisor(a, b));
    }
}