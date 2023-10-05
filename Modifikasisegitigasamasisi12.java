
import java.util.Scanner;

/**
 * Modifikasisegitigasamasisi12
 */
public class Modifikasisegitigasamasisi12 {

    public static void main(String[] args) {
    
        Scanner input12 = new Scanner(System.in);

        System.out.println ("Masukkan  Sudut Segitiga: ");
        float sudut1 = input12.nextInt();

        System.out.println ("Masukkan  Sudut Segitiga: ");
        float sudut2 = input12.nextInt();

        System.out.println ("Masukkan  Sudut Segitiga: ");
        float sudut3 = input12.nextInt();

        float totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180)  {
            if ((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60))
             System.out.println("Segitiga tersebut adalah Segitiga Sama Sisi");
        else 
            System.out.println("Segitiga tersebut bukan Segitiga Sama Sisi");
        } else System.out.println("Bukan Segitiga");
    input12.close();
}

}