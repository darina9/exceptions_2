import java.util.Scanner;

public class DZ2_4 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            if (sc.nextLine().isEmpty()) {
                throw new RuntimeException();
            }

        } catch (RuntimeException e) {
            System.out.println("Пустые строки вводить нельзя.");
        }

    }
}
