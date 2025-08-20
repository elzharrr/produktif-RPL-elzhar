import java.util.Scanner;

public class OperatorElzhar1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang di Toko Kami");
        System.out.println("Silahkan Berbelanja");
        System.out.println("Masukkan Barang: ");
        String barang = input.nextLine();
        System.out.println("Masukkan Harga: ");
        int harga = input.nextInt();
        System.out.println("Jumlah Barang: ");
        int jumlah = input.nextInt();
        int totalharga = harga*jumlah;
        System.out.println("============================");
        System.out.println("Total Harga:  "+ totalharga);
        System.out.println("Total Bayar: ");
        int bayar = input.nextInt();
        if (bayar < totalharga){
            System.out.println("Uang anda tidak mencukupi");
            return;
        }
        int kembalian = bayar-totalharga;
        System.out.println("Total Kembalian: "+ kembalian);
        System.out.println("============================");
        System.out.println("Terimakasih Sudah Berbelanja di Toko Kami");
        System.out.println("Silahkan Kembali Lagi Lain Kali");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}