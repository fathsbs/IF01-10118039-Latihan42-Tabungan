
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk transaksi saldo sederhana  
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        Scanner masuk = new Scanner(System.in);
        int jumlah;

        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan saldo awal   \t\t: ");
        tabungan.Tabungan(masuk.nextInt());
        System.out.print("Jumlah uang yang diambil \t: ");
        jumlah = masuk.nextInt();
        System.out.println("Saldo anda sekarang   \t\t: " + tabungan.ambilUang(jumlah));
    }

}
