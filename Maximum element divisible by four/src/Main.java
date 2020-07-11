import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxNumDivisibleByFour = 0;
        for (int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            if ((num % 4 == 0) && (maxNumDivisibleByFour < num)) {
                maxNumDivisibleByFour = num;
            }
        }
        System.out.println(maxNumDivisibleByFour);

    }
}