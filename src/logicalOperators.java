import java.util.Scanner;

public class logicalOperators {

    public static void main(String[] args) {

        //logical AND &&
        boolean b1 = 3 == 1; //false
        boolean b2 = 4 > 2; //true

        boolean logicalAnd = b1 && b2;
        //false vs true = false
        //false vs false = false
        //true vs true = true
       // System.out.println(logicalAnd);

        //logical OR ||
        boolean logicalOr = b1 || b2;
        //false vs true = true
        //true vs true = true
        //false vs false = false

        //logical NOT !
        boolean logicalNot = !true;

        //task 1
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        boolean check = age >= 18 && age <= 65;
        System.out.println(check);


    }

}
