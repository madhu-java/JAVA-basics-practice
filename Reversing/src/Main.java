import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int actualNumber = scanner.nextInt();
        int reverseNumber = 0;
        while (actualNumber > 0) {
            reverseNumber = (reverseNumber * 10) + (actualNumber % 10);
            //reverseNumber = reverseNumber *10;
            actualNumber = actualNumber / 10;
        }
        System.out.println(reverseNumber);
    }
}