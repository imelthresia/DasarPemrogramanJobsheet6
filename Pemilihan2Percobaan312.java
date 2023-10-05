import java.util.Scanner;

/**
 * Pemilihan2Percobaan312
 */
public class Pemilihan2Percobaan312 {


    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        String kategori;
        double pajak;
        int penghasilan;
        int gajiBersih;

        System.out.println("Masukkan Kategori: ");
        kategori = input12.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan: ");
        penghasilan = input12.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasil Bersih: " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasil Bersih: " + gajiBersih);
        } else {
            System.out.println("Masukkan Kategori Salah");
        }

        input12.close();
    }
}