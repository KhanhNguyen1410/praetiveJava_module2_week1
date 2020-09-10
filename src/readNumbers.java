import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int number = scanner.nextInt();
        int hundreds, tens, units;
        hundreds = number / 100;
        tens = (number % 100)/10;
        units = (number % 100)%10;
//        System.out.printf("%d %d %d",hundreds,tens,units);
        String readUnits = "";
        String readTens = "";
        String readHundreds = "";
        String specialNumber = "";

        switch (units) {
            case 0:
                readUnits = "";
                break;
            case 1:
                readUnits = "one";
                break;
            case 2:
                readUnits = "two";
                break;
            case 3:
                readUnits = "three";
                break;
            case 4:
                readUnits = "four";
                break;
            case 5:
                readUnits = "five";
                break;
            case 6:
                readUnits = "six";
                break;
            case 7:
                readUnits = "seven";
                break;
            case 8:
                readUnits = "eight";
                break;
            case 9:
                readUnits = "nine";
                break;
        }


        switch (tens){
            case 2:
                readTens = "twenty";
                break;
            case 3:
                readTens = "thirty";
                break;
            case 4:
                readTens = "forty";
                break;
            case 5:
                readTens = "fifty";
                break;
            case 6:
                readTens = "sixty";
                break;
            case 7:
                readTens = "seventy";
                break;
            case 8:
                readTens = "eighty";
                break;
            case 9:
                readTens = "ninety";
                break;
        }
        switch (hundreds){
            case 0:
                readHundreds = "";
                break;
            case 1:
                readHundreds = "one hundred ";
                break;
            case 2:
                readHundreds = "two hundred ";
                break;
            case 3:
                readHundreds= "three hundred  ";
                break;
            case 4:
                readHundreds = "four hundred";
                break;
            case 5:
                readHundreds = "five hundred ";
                break;
            case 6:
                readHundreds = "six hundred ";
                break;
            case 7:
                readHundreds = "seven hundred ";
                break;
            case 8:
                readHundreds = "eight hundred ";
                break;
            case 9:
                readHundreds = "night hundred ";
                break;
        }
//        switch (number){
//            case 11:
//                System.out.printf("%d red is eleven",number);
//                break;
//            case 12:
//                System.out.printf("%d read is twelve",number);
//                break;
//            case 13:
//                System.out.printf("%d read is thirteen",number);
//                break;
//
//        }
//        if (tens == 1 && units < 20 && units > 13 ){
//            System.out.printf("%d read is %s%steen",number,readHundreds,readUnits);
//        }
        if (tens == 1 && units == 1){
            System.out.printf("%d read is %s eleven",number,readHundreds);
        }
        else if (number < 10 & number > 0){
            System.out.printf("%d read is %s",number,readUnits);
        }
        else if (number < 100 && number > 20){
            System.out.printf("%d read is %s%s",number,readTens,readUnits);
        }
        else if (number < 1000 && number >= 100){
            System.out.printf("%d read is %s and %s %s",number,readHundreds,readTens,readUnits);
        }

    }
}