import java.util.Scanner;

public class readNumbers {
    public static void main(String[] args) {
        System.out.println("enter your number: ");
        Scanner  scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        int ones = scanner.nextInt();
        String read = "";
//        String read = "";
        if (number > 0 && number <= 20){
            switch (number){
                case 1:
                   read = "one";
                    break;
                case 2:
                    read = "two";
                    break;
                case 3:
                    read = "three";
                    break;
                case 4:
                    read = "four";
                    break;
                case 5:
                    read = "five";
                    break;
                case 6:
                    read = "six";
                    break;
                case 7:
                    read = "seven";
                    break;
                case 8:
                    read = "eight";
                    break;
                case 9:
                    read = "nine";
                    break;
                case 10:
                    read = "ten";
                    break;

                    case 11:
                        read = "eleven";
                        break;
                    case 12:
                        read = "twelve";
                        break;
                    case 13:
                        read = "thirteen";
                        break;
                    case 14:
                        read = "fourteen";
                        break;
                    case 15:
                        read = "fifteen";
                        break;
                    case 16:
                        read = "sixteen";
                        break;
                    case 17:
                        read = "seventeen";
                        break;
                    case 18:
                        read = "eighteen";
                        break;
                    case 19:
                        read = "nineteen";
                        break;
                    case 20:
                        read = "twenty";
                        break;
                }

            System.out.printf("the number %d read is %s ",number ,read);
        }
    }
}
