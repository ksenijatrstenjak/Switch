public class New {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("My name is Ksenija");
        System.out.print("I will print on the same line. ");
        System.out.println("I will print on the same line.");
        System.out.println( 5 );
        System.out.println( 5 + 3 );

        String name = "Ksenija";
        System.out.println(name);

        int number = 15;
        number = 20;
        System.out.println(number);

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false




        System.out.println(x > y); // returns false, because 5 is lower than 6
        System.out.println(8 > 7);



        int myAge = 25;
        int drinkingAge = 18;

        if (myAge >= drinkingAge) {
            System.out.println("Old enough to drink!");
        } else {
            System.out.println("Not old enough to drink.");
        }

        if (16 > 18) {
            System.out.println("20 is greater than 18");
        }
        else { System.out.println("Error");}

    }
}