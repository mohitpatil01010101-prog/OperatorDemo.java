public class OperatorsDemo {
    void add(int a, int b) {
        int sum = a + b;
         System.out.println("Addition: " + sum);

    }

    // Method with return
     int multiply(int a, int b) {
          return a* b;
     }

     public static void main(String[] args) {
      // operators 
        int x = 10, y = 3;
        System.out.println("x + y =" + (x +y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x * y =" +(x * y));
        System.out.println("x / y =" +(x / y));
        System.out.println("x % y =" +(x % y));
     
        //Arithmetic Promotion
        byte a = 10, b = 20;
        int result = a= b; // promoted to int 
         System.out.println("Arithmetic Promotion Result: " +result);

         // Method Calling 
         OperatorsDemo obj = new OperatorsDemo();
            obj.add(10, 20);
            int product = obj.multiply(10, 20);
            System.out.println("Multiplication: " + product);
     }
    }
         
     