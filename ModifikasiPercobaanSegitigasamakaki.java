import java.util.Scanner;


public class ModifikasiPercobaanSegitigasamakaki {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.println("Masukkan panjang sudut 1: ");
        double sudut1 = input12.nextDouble();

        System.out.println("Masukkan panjang sudut 2: ");
        double sudut2 = input12.nextDouble();

        System.out.println("Masukkan panjang sudut 3: ");
        double sudut3 = input12.nextDouble();

        if (sudut1 == sudut2 && sudut1 != sudut3) {
            System.out.println("Segitiga tersebut adalah Segitiga Sama Kaki.");
        } else if (sudut1 == sudut3 && sudut1 != sudut2) {
            System.out.println("Segitiga tersebut adalah Segitiga Sama Kaki.");
        } else if (sudut2 == sudut3 && sudut2 != sudut1) {
            System.out.println("Segitiga tersebut adalah Segitiga Sama Kaki.");
        } else {
            System.out.println("Segitiga tersebut bukan Segitiga Sama Kaki.");
        }
    input12.close();
}
}