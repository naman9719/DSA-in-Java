// patterns in java impotanat .......

// solid rectangle...............................

// import java.util.*;

// public class patterns {

// public static void main(String args[]) {

// // outer loop....................
// for (int i = 1; i <= 4; i++) {

// // inner loop......................
// for (int j = 1; j <= 5; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// hollow rectangle.................abi pura nhi huya error hai es mein ,...

// import java.util.*;

// public class patterns {

// public static void main(String args[]) {
// int n = 4;
// int m = 5;

// for (int i = 1; i <= n; i++) {

// for (int j = 1; j <= m; j++) {

// if (i == 1 || j == 1 || i == n || j == m) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }

// }
// }

// half pyramid .................

// public class patterns {

// public static void main(String args[]) {
// int n = 4;
// for (int i = 1; i <= n; i++) {

// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }

// }

// inverted half pyramid.................

// public class patterns {

// public static void main(String args[]) {
// int n = 4;
// for (int i = n; i >= 1; i--) {

// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// inverted half pyramid rotated by 180 degree)................

// public class patterns {
// public static void main(String args[]) {
// int n = 4;
// for (int i = 1; i <= n; i++) {

// //space print .....
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");

// }

// //star print ...
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }

// System.out.println();
// }
// }
// }

// half pyramid using numbers.................

// public class patterns {
// public static void main(String ars[]) {
// int n = 5;
// for (int i = 1; i <= n; i++) {

// for (int j = 1; j <= i; j++) {
// System.out.print(j);

// }
// System.out.println();
// }
// }
// }

// inverted half pyramid using numbers.................

// public class patterns {
// public static void main(String ars[]) {
// int n = 5;
// for (int i = 1; i <= n; i++) {

// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");

// }
// for (int j = 1; j <= i; j++) {
// System.out.print(j);
// }
// System.out.println();
// }
// }
// }

// inverted half pyramid using numbers rotated by 180 degree.................

// public class patterns {
// public static void main(String args[]) {
// int n = 5;
// for (int i = 1; i <= n; i++) {

// for (int j = 1; j <= n - i + 1; j++) {
// System.out.print(j);
// }
// System.out.println();
// }
// }
// }

// 2 .inverted half pyramid using numbers rotated by 180 degree.................

// public class patterns {

// public static void main(String args[]) {
// int n = 5;
// for (int i = n; i >= 1; i--) {

// for (int j = 1; j <= i; j++) {
// System.out.print(j);
// }
// System.out.println();
// }
// }
// }

// floyds triangle.................

// public class patterns {
// public static void main(String args[]) {
// int n = 5;

// int number = 1; // Initialize the number to be printed

// for (int i = 1; i <= n; i++) {

// for (int j = 1; j <= i; j++) {
// System.out.print(number + " "); // Print the current number followed by a
// space....

// number++;
// }
// System.out.println();
// }

// }
// }

// triangle number pattern.................

// public class patterns {
// public static void main(String args[]) {
// int n = 5;
// for (int i = 1; i <= n; i++) {

// for (int j = 1; j <= i; j++) {

// int sum = i + j;

// if (sum % 2 == 0) {
// System.out.print("1");
// } else {
// System.out.print("0");
// }
// }
// System.out.println();

// }
// }
// }

// homework.................

// 1. solid rhombus.....

// public class patterns {
// public static void main(String args[]) {
// int n = 5; // Number of rows

// for (int i = 1; i <= n; i++) {
// // Print leading spaces
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }

// // Print stars
// for (int j = 1; j <= n; j++) {
// System.out.print("*");
// }
// System.out.println(); // Move to the next line after each row
// }
// }
// }

// 2. print the number pyramid.....

// public class patterns {
// public static void main(String args[]) {
// int n = 5; // Number of rows

// for (int i = 1; i <= n; i++) {
// // Print leading spaces
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }

// // Print numbers
// for (int j = 1; j <= i; j++) {
// System.out.print(i + " ");
// }
// System.out.println(); // Move to the next line after each row

// }

// for (int i = n; i <= 1; i--) {
// // Print leading spaces
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }

// // Print numbers
// for (int j = 1; j <= i; j++) {
// System.out.print(i + " ");
// }
// System.out.println(); // Move to the next line after each row

// }
// }
// }

// hollow rectangle with stars.................

// public class patterns {
// public static void main(String args[]) {
// int n = 5; // Number of rows
// int m = 6;

// for (int i = 1; i <= n; i++) {
// // space print
// for (int j = 1; j <= m; j++) {

// if (i == 1 || j == 1 || i == n || j == m) {

// System.out.print("*");

// } else {
// System.out.print(" ");
// }

// }

// System.out.println(); // Move to the next line after each row
// }
// }
// }