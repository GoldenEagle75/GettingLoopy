import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //PART A

        //#1
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //#2
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        //#3
        for (int i = 0; i <= 18; i+=3) {
            System.out.print(i + " ");
        }

        System.out.println();

        //#4
        for (int i = 10; i >= 0; i-=2) {
            System.out.print(i + " ");
        }

        System.out.println();

        //PART B

        //#5
        for (int i = 1; i <= 5; i++){
            for (int z = 1; z <= i; z ++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //#6
        for (int i = 5; i >= 1; i--){
            for (int z = 1; z <= i; z ++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //#7
        for (int i = 1; i <= 5; i++) {
            for (int z = 1; z <= 5; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //CtoF.main(args);

        //EC
        for (int i = 1; i <= 3; i++){
            System.out.print("\t");
            for (int z = 1; z <= 18; z ++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 6; i++){
            System.out.print("\t       ");
            for (int z = 1; z <= 3; z ++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("****     ****");
        System.out.println(" ***********");
    }
}

class CtoF {
    public static void main(String[] args) {
        double CelsiusTemp;
        double FahrenheitTemp;
        boolean done = false;
        String trash;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the temperature you wish to convert from Celsius to Fahrenheit: ");
            if (in.hasNextDouble()){
                done = true;
                CelsiusTemp = in.nextDouble();
                FahrenheitTemp = CelsiusTemp * 1.8 + 32;
                System.out.println(CelsiusTemp + " degrees in Celsius is equal to " + FahrenheitTemp + " degrees Fahrenheit.");
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid temperature, not " + trash + ".");
            }
        }while (!done);
    }
}