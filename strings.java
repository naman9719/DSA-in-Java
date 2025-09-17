// string.java kuch nam ya sentence ko store krne k liye use hota hai code mein
// string ko double quotes (" ") k andar likha jata hai

// import java.util.*;

// public class strings {

// public static void main(String[] args) {

// // String name = " hello wolrd";
// // String sentence = " my name is khan";

// // user input k liye string
// Scanner sc = new Scanner(System.in);
// StringBuilder sb = new StringBuilder(sc.nextLine());
// String name = sb.toString();
// System.out.println(" your name is = " + name);

// }

// }

// string ko concatenate krne k liye hum + operator ka use krte
// hain..............................

// import java.util.*;

// import javax.xml.stream.events.Namespace;

// public class strings {

// public static void main(String[] args) {

// // // // concatenate
// // String firstName = " naman";
// // String lastName = " tyagi";
// // String fullName = firstName + lastName;
// // System.out.println(fullName.length());

// // // charAt() function
// // for (int i = 0; i < fullName.length(); i++) {
// // System.out.println(fullName.charAt(i));
// // }

// // // // user input k liye string

// Scanner sc = new Scanner(System.in);
// String name = sc.nextLine();
// System.out.println(name);

// }

// }

// compareto function...................................

// import java.util.*;

// public class strings {

// public static void main(String[] args) {

// // // compare two strings
// // ya check karta hai kon se string badhe hai ya choti hai

// String name1 = "naman";
// String name2 = "naman";

// // ya thin value return karta hai

// // 1 s1>s2 (positive number)
// // 2 s1<s2 (negative number)
// // 3 s1==s2 (0)

// // if (name1.compareTo(name2) == 0) {
// // System.out.println(" strings are equal");

// // } else {
// // System.out.println(" strings are not equal");
// // }

// // ya kabi kabi ya fale ho jata hai es liya compareTo() function ka use karte
// hain\..... jasa uper kiya hai

// if (name1 == name2) {
// System.out.println(" strings are equal");

// } else {
// System.out.println(" strings are not equal");
// }
// }
// }

// substring function...................................

// import java.util.*;

// public class strings {

// public static void main(String[] args) {

// // substring function
// String sentence = " my name is naman tyagi";
// String name = sentence.substring(12);
// System.out.println(name);

// //string are immutable in java...................................imp.........

// String str = "naman";
// str = "tyagi";
// System.out.println(str);

// }
// }

// q1.................. combined length of all string...................

// import java.util.*;

// public class strings {

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// String name = sc.next();
// System.out.println(name);
// for (int i = 0; i < name.length(); i++) {
// System.out.println(name.charAt(i));
// }

// }
// }

// q2 replace the character in string...................

// import java.util.*;

// public class strings {

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// String name = "tyagi";
// String newName = name.replace('a', 'o'); // replace 'a' with 'o'
// System.out.println("Original Name: " + newName);
// System.out.println("Modified Name: " + name);

// }
// }

// q3 delete the character in string...................

// import java.util.*;

// public class strings {

// public static void main(String[] args) {

// // String mail = "naman971942@gmail.com";
// // String newMail = mail.substring(0, 11);
// // System.out.println(newMail);

// // user input k liye string

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your gmail:");
// String mail = sc.nextLine();

// for (int i = 0; i < mail.length(); i++) {
// if (mail.charAt(i) == '@') {
// mail = mail.substring(0, i);
// break; // stop after removing the part after '@'
// }
// }
// System.out.println("Modified Name: " + mail);

// }
// }

// string builder...................................

// stringbuilder method = stringbuilder sb = new stringbuilder();

// import java.util.*;

// public class strings {

// public static void main(String args[]) {
// StringBuilder sb = new StringBuilder("naman");
// System.out.println(sb);

// // char at index 0
// System.out.println(sb.charAt(3));

// // set char at index 0 to 't'
// sb.setCharAt(3, 't');
// System.out.println(sb);

// // // insert 'y' at index 3
// sb.insert(0, 's');
// System.out.println(sb);

// // delete char at index 0
// sb.delete(0, 1);
// System.out.println(sb);

// // append at last
// sb.append(" tyagi");
// System.out.println(sb);

// // length
// System.out.println(sb.length());

// // substring from index 0 to 5 ya string ka part hai
// String str = sb.substring(0, 5);
// System.out.println(str);

// // convert string builder to string
// String str2 = sb.toString();
// System.out.println(str2);

// }
// }

// q1...........string builder...................

// import java.util.*;

// public class strings {

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// StringBuilder sb = new StringBuilder(sc.nextLine());
// System.out.println(sb);

// // reverse the string
// sb.reverse();
// System.out.println(sb);

// }
// }

// khud input krke dekho string builder ka use karke.........................

// import java.util.*;

// public class strings {

// public static void main(String args[]) {

// StringBuilder sb = new StringBuilder("tyagi");

// for (int i = 0; i <= sb.length() / 2; i++) {
// int front = i;
// int back = sb.length() - 1 - i;

// char frontChar = sb.charAt(front);
// char backChar = sb.charAt(back);

// sb.setCharAt(front, backChar);
// sb.setCharAt(back, frontChar);
// }

// System.out.println(sb);
// }
// }