import java.util.Scanner;

public class Third {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");

        int size = scanner.nextInt();
        int c = 0;
        int sum = 0;

        for (int i = 1; i <= size; i++) {
            c = c * 10 + 1;
            System.out.println(c + " ");
            sum = sum + c;
        }
        System.out.println("Результат " + sum);
    }
}