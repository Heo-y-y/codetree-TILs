import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-"); // - 기준으로 잘라서 입력 받겠다는 뜻
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        System.out.println(a + "-" + c + "-" + b);
    }
}