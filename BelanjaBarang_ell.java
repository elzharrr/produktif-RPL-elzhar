import java.util.Scanner;

public class BelanjaBarang_ell {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nama barang 1: ");
        String nama1 = input.nextLine();
        System.out.println("harga barang 1: ");
        Double harga1 = input.nextDouble();
        input.nextLine();
        System.out.println("nama barang 2: ");
        String nama2 = input.nextLine();
        System.out.println("harga barang 2: ");
        Double harga2 = input.nextDouble();
       

        System.out.println("===============================");
        System.out.println(nama1);
        System.out.println(harga1);
        System.out.println(nama2);
        System.out.println(harga2);
        System.out.println("===============================");
        System.out.println("barang yang sudah dibeli adalah " +nama1+" dan "+nama2);
        System.out.println("masing masing memiliki harga "+harga1+" dan "+harga2);

    }
}
