import java.util.Scanner;
public class Siakad14 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim; 
        char kelas;
        //char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, Nilai_Akhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        Nilai_Akhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.print("\nMahasiswa atas nama " + nama + " dengan NIM " + nim);
        System.out.println(" di Kelas " + kelas + " dengan nomor absen " + absen);
        System.out.println("Nilai Akhir: " + Nilai_Akhir);

        if (Nilai_Akhir > 80 && Nilai_Akhir <= 100){
            System.out.println("Nilai Akhir Huruf : A");
            System.out.println("Kualifikasi : Sangat Baik");
    }
    else if (Nilai_Akhir > 73 && Nilai_Akhir <= 80){
            System.out.println("Nilai Akhir Huruf : B+");
            System.out.println("Kualifikasi : Lebih dari Baik");
    }
    else if (Nilai_Akhir > 65 && Nilai_Akhir <= 73){
            System.out.println("Nilai Akhir Huruf : B");
            System.out.println("Kualifikasi : Baik");
    }
    else if (Nilai_Akhir > 60 && Nilai_Akhir <= 65){
            System.out.println("Nilai Akhir Huruf : C+");
            System.out.println("Kualifikasi : Lebih dari Cukup");
    }
    else if (Nilai_Akhir > 50 && Nilai_Akhir <= 60){
            System.out.println("Nilai Akhir Huruf : C");
            System.out.println("Kualifikasi : Cukup");
    }
    else if (Nilai_Akhir > 39 && Nilai_Akhir <= 50){
            System.out.println("Nilai Akhir Huruf : D");
            System.out.println("Kualifikasi : Kurang");
    }
    else if (Nilai_Akhir <= 39){
            System.out.println("Nilai Akhir Huruf : E");
            System.out.println("Kualifikasi : Gagal");
    }
    }
}