import java.util.Scanner;

public class PemilihanPercobaan1_12 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka "+angka+" bilangan genap");
        }else {
            System.out.println("angka "+angka+"bilangan ganjil");
        }
            
            input.close();
     }
}
