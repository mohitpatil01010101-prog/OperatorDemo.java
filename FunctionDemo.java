  class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}

class Student{
   String name;
   int age;

    Student() {
         name = "Unknown";
         age = 0;
    }

    Student(String n,int a) {
        name = n;
        age = a;
    }

    //Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    
    Student getStudent() {
        return this;
    }
}

public class FunctionDemo {
    public static void main(String[] args){
       // -----
       Calculator calc = new Calculator();
        System.out.println("Add  of two integers: " + calc.add(5, 10));
        System.out.println("Add  of three integers: " + calc.add(5, 10, 15));
        System.out.println("Add  of two doubles: " + calc.add(5.5, 10.5));

        //----- Constructors-----
        Student student1 = new Student();                // Default constructor
        Student student2 = new Student("Mayur", 20);     // Parameterized constructor
        Student student3 = new Student(student2);        // Copy constructor

        student1.display();
        student2.display();
        student3.display();

        //----- Returning by Reference-----
        Student s4 = student2.getStudent();// returns reference of s2
        System.out.println("Student s4 details (reference to s2):");
        s4.display();
}
}

    