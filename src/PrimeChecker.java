import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int count = 0;


        while (true) {
            System.out.println("Bitte eine Ganzzahl eingeben!");
            if (scan.hasNextInt()) {
                count = 0;
                number = scan.nextInt();
                if (number > 1) {
                    for (int i = 1; i <= number; i++) {
                        if (number != i && number % i == 0) {
                            count++;
                        }
                    }
                    if (count <= 1) {
                        System.out.println("Super! Die Nummer ist eine Primzahl!!!");

                    }
                }
            } else {
                scan.next();
                System.out.println("Falsche Eingabe! Bitte eine Ganzzahl eingeben:");
            }
            System.out.println(number);
        }
    }
}

