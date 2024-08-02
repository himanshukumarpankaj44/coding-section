// Program to Find the Sum of Two Large Numbers.
// Input  : str1 = "7777555511111111", 
            //  str2 =  "3332222221111"
// Output : 7780887733332222

import java.util.*;
public class TwoStringValueSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st value:");
        String str1 = sc.next();
        System.out.println("Enter the 2nd value:");
        String str2 = sc.next();
        //first approach
        // BigInteger a = new BigInteger(str1);
        // BigInteger b = new BigInteger(str2);
        // System.out.println("Sum of the the two value is:"+ a.add(b));
        sc.close();
        System.out.println("Sum of the values:"+twoValSum(str1, str2));
    }
  
  
     // Function to calculate the sum of two large numbers represented as strings
     public static String twoValSum(String str1, String str2) {
      String str = "";

      // Make sure str1 is the smaller or equal length string
      if (str1.length() > str2.length()) {
          String temp = str1;
          str1 = str2;
          str2 = temp;
      }

      // Reverse both strings
      str1 = new StringBuilder(str1).reverse().toString();
      str2 = new StringBuilder(str2).reverse().toString();

      int carry = 0;
      int sum;

      // Sum the digits of both strings up to the length of str1
      for (int i = 0; i < str1.length(); i++) {
          sum = ((int) (str1.charAt(i) - '0') + (int) (str2.charAt(i) - '0') + carry);
          str += (char) (sum % 10 + '0');
          carry = sum / 10;
      }

      // Add remaining digits of str2
      for (int i = str1.length(); i < str2.length(); i++) {
          sum = ((int) (str2.charAt(i) - '0') + carry);
          str += (char) (sum % 10 + '0');
          carry = sum / 10;
      }

      // Add remaining carry if any
      if (carry > 0) {
          str += (char) (carry + '0');
      }

      // Reverse the result to get the final sum
      str = new StringBuilder(str).reverse().toString();
      return str;
  }

   
}
