import java.util.Scanner;

public class iof
{
    public static int inputInt(String text)
    {
        Scanner inputInt = new Scanner(System.in);
        int number;

        System.out.print(text);
        number = inputInt.nextInt();

        return number;
    }

    public static double inputDouble(String text)
    {
        Scanner inputDouble = new Scanner(System.in);
        double number;

        System.out.print(text);
        number = inputDouble.nextDouble();

        return number;
    }

    public static String inputString(String text)
    {
        Scanner inputString = new Scanner(System.in);
        String textIn;

        System.out.print(text);
        textIn = inputString.nextLine();

        return textIn;
    }

    public static char inputChar(String text)
    {
        Scanner inputChar = new Scanner(System.in);
        char textIn;

        System.out.print(text);
        textIn = inputChar.next().charAt(0);

        return textIn;
    }

}