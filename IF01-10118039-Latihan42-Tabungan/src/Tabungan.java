/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk transaksi saldo sederhana  
 */

/**
 *
 * @author Fatahillah Seno
 */
public class Tabungan {

    private int saldo;

    public void Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah) {
        int total = saldo - jumlah;
        return total;
    }

}
