public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        double feet = 9.2;
        double miles = 1.3;

        double feetToCm = feet * 30.48;
        double milesToCm = miles * 160934;

        System.out.printf("%.1fft = %.1fcm\n", feet, feetToCm);
        System.out.printf("%.1fmi = %.1fcm\n", miles, milesToCm);
    }
}