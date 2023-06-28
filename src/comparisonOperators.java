import java.util.Scanner;

public class comparisonOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int b = 3;
        int c = 2, d = 5;

        //System.out.println(d >= c); //5 >= 2


/*        //task 1

        System.out.print("Please enter first number: ");
        int numOne = sc.nextInt();
        System.out.print("Please enter second number: ");
        int numTwo = sc.nextInt();
        boolean b2 = numOne >= numTwo;
        System.out.println(b2);*/


        //task 3
        System.out.println("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        int n3 = sc.nextInt();

        boolean c1 = n1 < n2;
        boolean c2 = n2 < n3;

        boolean result = n1 < n2 && n2 < n3;
        System.out.println(result);


    }
}
