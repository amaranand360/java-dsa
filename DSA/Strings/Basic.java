package Strings;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        //string Declaration
        // String name1 = "Hello";
        // String name2 = "Wello" ;

        //string concatenation
        // String resultString = name1 + ' ' + name2;
        // System. out. println("Your name is : "+ resultString);

        //string input handle with sapce tab
        // Scanner sc = new Scanner (System.in);
        // String name = sc.next();
        // String name = sc.nextLine();
        // System. out. println("Your name is : "+ name);
        // sc.close();
        
        
        /* charAt(int index) 
        Returns the char value at the specified index. An index ranges from 0 to length() - 1. 
        The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing
        */
        // for (int i=0; i<name.length(); i++) {
        //     System.out.println("At Index"+ i + "->"+name.charAt(i));
        // }

        /* substring(int beginIndex, int endIndex)
        Returns a string that is a substring of this string.
        The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. 
        Thus the length of the substring is endIndex-beginIndex.
        */
        // String subStringExaple = name.substring(4,name.length());
        // System.out.println(subStringExaple);


        /* compareTo(String anotherString)
        1 s1 > s2 : return +ve value
        2 s1 == s2 : return 0
        3 s1 < s2 : return -ve value
        */ 

        // if (name1.compareTo(name2) == 0) {
        //     System. out.println("Strings are equal");
        // } 
        // else if (name1.compareTo(name2) < 0) {
        //     System. out.println("Strings 2 bigger ");
        // }
        // else {
        //     System.out.println("Strings are not equal");
        // }
        
        //string to int conversion 
        
        // String name1 = "34";
        // String name2 = "1234" ;
        //Float.parseFloat()
        //Double.parseDouble():
        // int number1 = Integer.parseInt(name1);
        // int number2 = Integer.parseInt(name2);
        // if (number1 < number2) {
        //     System. out.println("number2 is bigger ");
        // }
        // else {
        //     System.out.println("numbers1 is bigger");
        // }


        // String.hashCode() //Returns:a hash code value for this object.

        // String name1 = "John";
        // String name2 = "John";
        
        // // Getting hash codes of two strings
        // System.out.println("Hash code of name1: " + name1.hashCode());
        // System.out.println("Hash code of name2: " + name2.hashCode());
        
        // // Checking if hash codes of two objects are the same
        // System.out.println("Are hash codes equal? " + (name1.hashCode() == name2.hashCode()));
        
        // // Checking if the objects are equal
        // System.out.println("Are objects equal? " + name1.equals(name2));

        // String.isEmpty() //Returns:true if, and only if, length() is 0.

        // String str = "Hello World";
        // int index1 = str.indexOf('o');           // Output: 4
        // int index2 = str.indexOf("World");       // Output: 6
        // int index3 = str.indexOf('o', 5);        // Output: 7 (search starts from index 5)
        // int index4 = str.indexOf("World", 7);    // Output: -1 (search starts from index 7)
        

        // String str = "Hello World Hello";
        // int firstIndex = str.indexOf("o");  // Output: 4
        // int lastIndex = str.lastIndexOf("o");  // Output: 12
        // System.out.println(firstIndex);
        // System.out.println(lastIndex);


        // String lower = str.toLowerCase();  // Output: "hello world"
        // String upper = str.toUpperCase();  // Output: "HELLO WORLD"
        // System.out.println(lower);
        // System.out.println(upper);

        // String str = "Hello World";
        // boolean starts = str.startsWith("h");    // Output: false
        // boolean ends = str.endsWith("d");       // Output: true
        // System.out.println(starts);
        // System.out.println(ends);

        // String str = "  Hello World  ";
        // String trimmed = str.trim();  // Output: "Hello World"
        // System.out.println(trimmed);

        //.split(String regex)
        // String str = "apple,orange,banana";
        
        // // Split by comma
        // String[] fruits = str.split(",");
        // String[] fruits = str.split("[,; ]");

        // // Print the resulting array
        // for (String fruit : fruits) {
        //     System.out.println(fruit);
        // }

        // String str = "apple,orange,banana,grape";
        
        // // Split by comma, with a limit of 2
        // String[] fruits = str.split(",", 2);
        
        // // Print the resulting array
        // for (String fruit : fruits) {
        //     System.out.println(fruit);
        // }


        // String str = "hello";
        
        // Use the chars() method to get an IntStream of Unicode values
        // str.chars()
        //     .forEach(ch -> System.out.println((char) ch));  // Cast int to char to print


        // String str = "Hello World";
        // String replacedChar = str.replace('o', 'a');     // Output: "Hella Warld"
        // String replacedString = str.replace("World", "Java");  // Output: "Hello Java"
        // System.out.println(replacedChar);
        // System.out.println(replacedString);

        // String str = "Hello World";
        // boolean contains = str.contains("World");
        // boolean present = str.contains("w");
        // System.out.println(contains);
        // System.out.println(present);


        // String str = "12345";
        // boolean matches = str.matches("\\d+");  // Output: true (matches digits)
        // System.out.println(matches);


        // StringBuilder sb = new StringBuilder ("Tony");
        // StringBuilder str = new StringBuilder("");
        // System.out.println(sb);
        // sb.insert(2, 'n');
        // System.out.println(sb);
        // //delete the extra 'n"
        // sb.delete (2, 3);
        
        // for (int i = sb.length()-1; i >=0 ; i--) {
        //     str.append(sb.charAt(i));
        // }
        // System.out.println(str);

        // for (int i = 0; i < sb.length()/2; i++) {
        //     int front = i;
        //     int back = sb.length()-1-i;
        //     char temp = sb.charAt(front);

        //     sb.setCharAt(front, sb.charAt(back));
        //     sb.setCharAt(back, temp);

        // }
        // System.out.println(sb);
        // System.out.println(sb.reverse());  // Output: "yotn"

        String s = " a good   example ";
        String cleanedString = s.trim().replaceAll("\\s+", " ");
        System.out.println(cleanedString);
        
        String[] words = cleanedString.split(" ");
        System.out.println(words[0]);

     }
}
