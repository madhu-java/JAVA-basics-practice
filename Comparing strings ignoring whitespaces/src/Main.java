import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String lineOne = scanner.nextLine();
        String lineTwo = scanner.nextLine();
        System.out.println(lineOne.replace(" ", "").equals(lineTwo.replace(" ", "")));

    }
}