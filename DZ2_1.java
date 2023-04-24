import java.util.Scanner;

public class DZ2_1 {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите дробное число (через  запятую): ");
                float floatValue = sc.nextFloat();
                System.out.println("Ваше число  " + floatValue);
                sc.close();
                break;
            } catch (Exception e) {
                System.out.println("Вы ввели не число. ");
            }
        }
    }
}