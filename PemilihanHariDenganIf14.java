import java.util.Scanner;
public class PemilihanHariDenganIf14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Byte dayName;
        String dayType;

        System.out.print("Input day name : ");
        dayName = sc.nextByte();

        switch (dayName) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid Number";

        }
        System.out.println(dayName + " is a " + dayType);

    }
}