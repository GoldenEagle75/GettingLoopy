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
    }
}