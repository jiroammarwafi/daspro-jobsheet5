import java.util.Scanner;
public class usia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte usia;

        System.out.print("Masukkan usia anda: ");
        usia = sc.nextByte();

        if (usia <= 12) {
            System.out.println("Status anda saat ini adalah: Anak-anak");
        } 
        else if (usia >= 13 && usia <= 19) {
            System.out.println("Status anda saat ini adalah: Remaja");
        } 
        else if (usia >= 20 && usia <= 64) {
            System.out.println("Status anda saat ini adalah: Dewasa");
        } 
        else if (usia > 64) {
            System.out.println("Status anda saat ini adalah: Lansia");
        }
        
        }

    }