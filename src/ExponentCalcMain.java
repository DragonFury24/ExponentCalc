import java.util.*;

public class ExponentCalcMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double base, exponent;
        System.out.println("Enter a base : ");
        base = keyboard.nextDouble();
        System.out.println("Enter an exponent: ");
        exponent = keyboard.nextDouble();
        System.out.println(base + " to the power of " + exponent + " is " + Math.pow(base, exponent));
        System.out.println("Enter another base (0 to exit) : ");
        do {
            base = keyboard.nextDouble();
            if (base == 0)
                break;
            System.out.println("Enter an exponent: ");
            exponent = keyboard.nextDouble();
            System.out.println(base + " to the power of " + exponent + " is " + Math.pow(base, exponent));
            System.out.println("Enter another base (0 to exit) : ");
        }while (base != 0);
        System.out.println("Good-bye!");
    }
}