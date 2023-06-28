import java.util.Scanner;

public class operators {
    public static void main(String[] args) {

/*        //arithmetic operators

        //Addition +
        double bread = 5.33;
        float milk = 4.20f;
        float apple = 2.20f;
        int fish = 10;
        float total = (float) (bread + milk + apple + fish);
        System.out.println("Total spent is " + total);

        //Subtraction  -
        int currentYear = 2023;
        int yearOfBirth = 1973;
        int age = currentYear - yearOfBirth;
        System.out.println("Your age is " + age);

        //Multiplication *
        float x = 10;
        float y = 2.5f;
        float z = x * y;
        System.out.println(z);

        //Division /
        int a = 1000;
        int b = 40;
        int c = a / b;
        System.out.println(c);

        //Increment ++
        int i = 1;
        i++; //i = 2
        System.out.println(i);


        //Decrement --
        int t = 1;
        t--; //0
        System.out.println(t);
        --t; //-1
        System.out.println(t);*/


        //Modulus
     /*   System.out.println(100 % 10); //0
        System.out.println(101 % 10); //1
        System.out.println(202 % 10); //2
        System.out.println(5 % 5); //0
        System.out.println(3 % 2); //1
        System.out.println(1003 % 10); //3
        System.out.println(6 % 5); //1*/

        //2 4 6 8 10
        //1 3 5 7

        //create a program that checks if the user entered even number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any whole number: ");
        int num = sc.nextInt();
        boolean even = num % 2 == 0;
        System.out.println(even);

    }
}
