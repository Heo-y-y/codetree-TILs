import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double h = sc.nextDouble();
        double w = sc.nextDouble();

        double b = w / ((h * h) / 10000);

        if (b > 25) {
            System.out.println((int)b);
            System.out.println("Obesity");
        } else {
            System.out.println((int)b);
        }

    }
}