import java.util.Scanner;

public class convertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.printf("'%.2f' usd convert to vnd is %.2f  ",usd,vnd);
    }
}
