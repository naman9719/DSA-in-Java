
//arrays (list of  number ya marks bana kar ak hee type ka hota hai un ko arrays mein likhta hai )
//bhoat sara veriable ko store karana ka liya arraya ka use kiya jata hai 

//array syntax = (type[]arrayname = new tyape[size];    )

// public class arrays {

//     public static void main(String[] args) {

//         //int[] marks = new int[3];      es ko ham asa bhi likh sakta hai ;

//         int marks[] = new int[3];

//         marks[0] = 97;
//         marks[1] = 98;
//         marks[2] = 95;

//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         // es ko ham loop sa bhi kar sakta hai yadi ham ko bhot sara marks print karana
//         // ho

//         for (int i = 0; i < 3; i++) {
//             System.out.println(marks[i]);
//        }

//    }

//}

//new defination arrays ko ham asa bhi define kar sakta hai ...

// import java.util.Scanner;

// public class arrays {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         int number[] = new int[size];
//         // input ka liya loop
//         for (int i = 0; i < size; i++) {
//             System.out.println("Enter number " + (i + 1) + ":");
//             number[i] = sc.nextInt();
//         }
//         // output ka liya loop
//         for (int i = 0; i < size; i++) {
//             System.out.println("Number at index " + i + ":");
//             System.out.println(number[i]);

//         }

//     }
// }

// q1........................

// import java.util.*;

// public class arrays {

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();

// int number[] = new int[size];
// //input loop
// for (int i = 0; i < size; i++) {
// number[i] = sc.nextInt();
// }
// int x = sc.nextInt();
// //output loop
// for (int i = 0; i < size; i++) {
// if (number[i] == x) {
// System.out.println("x found at index = " + i);
// }
// }

// }
// }

// 2d arrays ..............................................

// declaration = type [][] arrayname = new type[rows][columns];

// import java.util.Scanner;

// public class arrays {

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int row = sc.nextInt();
// int col = sc.nextInt();

// int[][] numbers = new int[row][col];

// // input //rows

// for (int i = 0; i < row; i++) {
// // colomn
// for (int j = 0; j < col; j++) {

// numbers[i][j] = sc.nextInt();
// }

// }

// // output
// for (int i = 0; i < row; i++) {

// for (int j = 0; j < col; j++) {
// System.out.print(numbers[i][j] + " ");

// }
// System.out.println();

// }
// sc.close();
// }
// }

// q1....................................................

import java.util.Scanner;

public class arrays {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];

        // input //rows

        for (int i = 0; i < row; i++) {

            // System.out.println("Enter numbers for row " + i + ":");

            // colomn
            for (int j = 0; j < col; j++) {

                numbers[i][j] = sc.nextInt();
            }

        }
        int x = sc.nextInt();

        // output
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + "," + j + ")");
                }

            }

        }
        sc.close();
    }
}
