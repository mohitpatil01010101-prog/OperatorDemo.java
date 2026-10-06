public class StringMathDemo {
     public static void main(String[] args) {
     // String class example 
        String str1 = "namskar";
        String str2 = "sir";

        String str3 = str1.concat("  " + str2);
         
        System.out.println("Concatenated String: " + str3);
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str3.charAt(1));
        System.out.println("Substring from index 2 (0-3): " + str2.substring(0, 3));
        System.out.println("Equals str1 and str2: " + str1.equals(str2));
        System.out.println("Lowercase str1: " + str1.toLowerCase());

        //Math class examples
        double a = 16.0;
        double b = 4.4;

        System.out.println("Square root of " + a + ": " + Math.sqrt(a));
        System.out.println("a raised to the power of b: " + Math.pow(a, b));
        System.out.println("Max of a and b: " + Math.max(a, b));
        System.out.println("Min of a and b: " + Math.min(a, b));
        System.out.println("Random number  (0-1): " + Math.random());
        System.out.println("Random number (10-20): " + (10 * Math.random() * (20-10)));
        System.out.println("Random number (1-100): " + (1 + Math.random() * (100 - 1)));
        System.out.println("Ceil of b: " + Math.ceil(b));
        System.out.println("Floor of b: " + Math.floor(b));
        System.out.println("Round of b: " + Math.round(b));

     }
     }