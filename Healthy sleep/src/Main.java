import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int minSleepHours = scanner.nextInt();
        int tooMuchSleep = scanner.nextInt();
        int hoursOfSleep = scanner.nextInt();
        if (hoursOfSleep < minSleepHours) {
            System.out.println("Deficiency");
        } else if (hoursOfSleep > tooMuchSleep) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }

    }
}