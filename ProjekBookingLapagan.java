import java.util.Scanner;

public class ProjekBookingLapagan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menampilkan menu lapangan
        System.out.println("Pilih Lapangan Olahraga yang Akan Disewa:");
        System.out.println("1. Lapangan Futsal");
        System.out.println("2. Lapangan Badminton");
        System.out.print("Masukkan pilihan (1/2): ");
        int lapanganPilihan = input.nextInt();
        
        // Menentukan harga lapangan berdasarkan pilihan
        double hargaLapangan = 0.0;
        if (lapanganPilihan == 1) {
            hargaLapangan = 100.0; // Harga lapangan Futsal
        } else if (lapanganPilihan == 2) {
            hargaLapangan = 40.0; // Harga lapangan Badminton
        } else if (lapanganPilihan == 3) {
            System.out.println("Pilihan tidak valid.");
            return;
        }
        
        // Meminta jam booking
          System.out.print("Masukkan Jam Booking (Pagi/Siang/Malam): ");
        String PagiMalamBooking = input.next();
        System.out.print("Masukkan Jam Booking (6AM-11PM): ");
        int WaktuBooking = input.nextInt();


          // Meminta jam booking
        System.out.print("Masukkan Durasi Booking (0-23): ");
        int jamBooking = input.nextInt();

        
        // Memvalidasi jam booking
        if (jamBooking < 0 || jamBooking > 23) {
            System.out.println("Jam booking tidak valid.");
            return;
        }
        
        // Menghitung total biaya
        double totalBiaya = hargaLapangan;
        
        // Menampilkan informasi booking
        System.out.println("\nBooking Lapangan Olahraga:");
        System.out.println("Lapangan: " + (lapanganPilihan == 1 ? "Futsal" : "Badminton"));
        System.out.println("Jam Booking: " + WaktuBooking + ":00 - " + (WaktuBooking + jamBooking) + ":00");
        System.out.println("Harga: Rp. " + totalBiaya + "00");
        System.out.println("Total Biaya: Rp. " + (hargaLapangan * jamBooking) + "00");
        
        
        // Meminta metode pembayaran
        System.out.print("\nPilih metode pembayaran (Cash/QRIS/E-Wallet): ");
        String metodePembayaran = input.next();
        System.out.println(metodePembayaran);
       
          

        // Memproses pembayaran
        if (metodePembayaran.equalsIgnoreCase("Cash")) {
            System.out.println("Silahkan Melakukan Pembayaran pada Admin dan Selamat Menikmati Permainan!");
        } else if (metodePembayaran.equalsIgnoreCase("QRIS")) {
            System.out.println("Silahkan Scan QR code!");
            System.out.println("Selamat Menikmati Permainan:)"); 
        }else if (metodePembayaran.equalsIgnoreCase("E-Wallet")) {
             System.out.println("ShopeePay/GoPay/DANA/OVO:" );
            System.out.println("Selamat Menikmati Permainan:)"); 
            // Simulasikan proses pembayaran kartu di sini
        } else {
            System.out.println("Metode pembayaran tidak valid.");
           
        }
        
        input.close();
    


    }
}