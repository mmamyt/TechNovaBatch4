public class dataTypes {

    public static void main(String[] args) {

        //whole numbers
        byte a = 10;
        short b = 1000;
        int c = 2500;
        long d = 3000;

        //floating points
        float e = 10.55f;
        double f = 3.14;

        //data type that stores one char
        char g = 'A';

        int xyz = a + g; //10 + 65

        //stores 2 values - true or false
        boolean h;


        //task 6
        int one = 7;
        int two = 8;

        //System.out.println("***** initial values ****");
        //System.out.println("the value of var one is " + one);
        //System.out.println("the value of var two is " + two);

        //manipulation - swaping values
        int three;
        three = one; //int three = one;

        one = two;
        two = three;

        //System.out.println("***** after manupilation ****");
        //System.out.println("the value of var one is " + one);
        //System.out.println("the value of var two is " + two);

        //task 5
        int num3 = 100;
        int num4 = 500;
        int result = num3 + num4;
        //System.out.println(result);


        //create 2 vars with double data type, and swap their values.

        double x1 = 6.5;
        double x2 = 3.5;

        //result should be x1 = 3.5 and x2 = 6.5

        //solution is to create empty box:
        double x3 = x1;
        x1 = x2;
        x2 = x3;


        //System.out.println("x1: " + x1);
        //System.out.println("x2: " + x2);


        //create 2 vars with char data type, and swap their values.
        char c1 = 'A';
        char c2 = 'B';

        char c3; //
        c3 = c1;
        c1 = c2;
        c2 = c3;

        //System.out.println("c1: " + c1);
        //System.out.println("c2: " + c2);




        //widening casting
        byte b1 = 30;
        byte b2 = 120;
        long i1 = b1 + b2;

        //narrowing casting
        double d1 = 1500.55;
        int i2 = (int) d1;

        short myShort = 30000;
        byte myByte = (byte) myShort; //-128 to 127
        //System.out.println(myByte);


        double num = 10.99;
        double num1 = 11.99;

        int num11 = (int) (num + num1); //22.98

        System.out.println(num11 + num1);

        //Declare a long variable and assign it the value 100000. Convert it to a short and print the result.

        long l = 100000l;
        short s = (short) l;
        System.out.println(s);


    }

}
