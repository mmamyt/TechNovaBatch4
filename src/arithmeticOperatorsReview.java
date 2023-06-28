import java.util.Scanner;

public class arithmeticOperatorsReview {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Addition +
        //create a program that calculates the total of all products user bought
/*
        System.out.print("Please enter the price of 1st item: ");
        double itemOne = sc.nextDouble();
        System.out.print("Please enter the price of the 2nd item: ");
        float itemTwo = sc.nextFloat();
        System.out.print("Please enter the price of the 3rd item: ");
        int itemThree = sc.nextInt();
        double total = itemOne + itemTwo + itemThree;
        System.out.println("Total Expenses: " + total);*/

/*        //Subtraction -
        //create a program that asks user to enter 2 numbers and deducts first number from the second number and returns the result
        System.out.print("Please enter any whole number: ");
        double numOne = sc.nextDouble();
        System.out.print("Please enter second number: ");
        double numTwo = sc.nextDouble();

        double difference = numTwo - numOne;
        System.out.println("The difference between "+ numTwo + " and " + numOne + " is " + difference);*/


        //Multiplication *
        //create a program that asks user to enter a number and program should multiply the number to 2 and prints the result

/*        System.out.println("PLease enter a number ");
        double multiNum = sc.nextDouble();
        double multiNum1 = multiNum * 2;
        System.out.println(multiNum1);

        //Division
        //Modulus % remainder of division
        System.out.println(100 % 10); //0
        System.out.println(103 % 10); //3
        System.out.println(505 % 5);  //0
        System.out.println(8 % 2);    //0*/

        //Increment ++
        int i = 3;
        i++;
        i = i + 1;

        //Decrement --
        int j = 5;
        j--;
        j = j-1;


        //Write a program that prompts the user to enter a length in meters and converts it to centimeters and inches.
        //cm = meter * 100
        //inches = meter * 39.26
        //Print the converted lengths.

        System.out.print("Please enter a length in meters: ");
        int meter = sc.nextInt();
        double cm = meter * 100;
        double inches = meter * 39.26;
        System.out.println(meter + " meters is equal to " + cm + " cm, " + inches + " inches");





    }

}
