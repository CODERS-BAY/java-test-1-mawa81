import java.util.Scanner;

public class romanNumerals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        String romanNumber = "";

        while (true) {
            System.out.println("Bitte gib eine positive Ganzzahl zwischen 0 und 100 ein!");
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                if (number / 100 > 0) {
                    int temp = number / 100;

                    for (int i = 0; i < temp; i++) {
                        romanNumber += 'C';
                        number -= 100;
                    }

                }
                if (number / 50 > 0) {
                    int temp = number / 50;
                    if (temp <= 9) {
                        for (int i = 0; i < temp; i++) {
                            romanNumber += 'L';
                            number -= 50;
                        }
                    } else {
                        romanNumber += 'X';
                        romanNumber += 'C';
                        number -= 90;
                    }

                }
                if (number / 10 > 0) {
                    int temp = number / 10;
                    if (temp <= 3) {
                        for (int i = 0; i < temp; i++) {
                            romanNumber += 'X';
                            number -= 10;
                        }
                    } else {
                        romanNumber += 'X';
                        romanNumber += 'L';
                        number -= 40;
                    }

                }
                if (number / 5 > 0) {
                    int temp = number / 5;
                    if (temp <= 9) {
                        for (int i = 0; i < temp; i++) {
                            romanNumber += 'V';
                            number -= 5;
                        }
                    } else {
                        romanNumber += 'I';
                        romanNumber += 'X';
                        number -= 9;
                    }
                }
                if (number / 1 > 0) {
                    int temp = number / 1;
                    if (temp <= 3) {
                        for (int i = 0; i < temp; i++) {
                            romanNumber += 'I';
                            number -= 1;
                        }
                    } else {
                        romanNumber += 'I';
                        romanNumber += 'V';
                        number -= 4;
                    }
                }

            } else {
                scan.next();
                System.out.println("Falsche Eingabe!");
            }
            System.out.println(romanNumber);
            romanNumber = "";


        }
    }
}
