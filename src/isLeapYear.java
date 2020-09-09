import java.util.Scanner;

public class isLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year ");
        int year = scanner.nextInt();
        boolean Div4 = year % 4 == 0;
        boolean Div100 = year % 100 == 0;
        boolean Div400 = year % 400 == 0;

        boolean isLeapYear = false;

        if (Div4){
            if (Div100){
                if (Div400){
                   isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear){
            System.out.printf("'%d' is a leap year", year);
        } else {
            System.out.printf("'%d' is not a leap year ", year);
        }
    }
}
