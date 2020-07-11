import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] numArray =  new int[4];
        for (int i = 0; i < 4; i++) {
            numArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(--numArray[i] + " ");
        }
        
        
    }
}
