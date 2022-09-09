import java.util.Scanner;

public class AnotherUseOfScanner {
    public static void main(String[] args) {
        // String series of alpha-numerics and symbols
        // int - whole numbers
        // float = fractional numbers (up to 7 decimal places)
        // double = fractional number (up to 15 decimal places)
        // boolean = true or false

        String name = "Joanne" + " " + "Kamau";
        System.out.println(name);

        String anotherName = "Boogie Bandit";
        System.out.println(anotherName);

        String firstName = "Jamala";
        String lastName = "Kaiye";
        String number1 = "5";
        int shoeSize = 5;
        float piF = 3.141592654789543f;
        double piD = 3.141592654789453894;
        boolean female = true;
        int maxNumber = 2147483647;
        long maxNumber1 = 214748367;
        System.out.println(firstName + " " + lastName + " has a shoe size of " + shoeSize);
        System.out.println("Is Joanne a female? " + female);

        System.out.println(piD);
        System.out.println(piF);

        System.out.println(maxNumber + 2);
        System.out.println(maxNumber1 + 1);

        Scanner reader = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        int total = number + number;
        System.out.println(number + " + " + number + " = " + total + "!");

        // BODMAS
        //Brackets, Order, Divide, Multiply, Add, Substract



    }
}
