import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Boolean value = str.endsWith("burg");
        System.out.println(value);
    }
}