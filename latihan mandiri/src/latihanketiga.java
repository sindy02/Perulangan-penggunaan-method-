
public class LatihanKetiga {

    public static int hitungKembalian(
            int uangBayar, int totalHarga) {

        return uangBayar - totalHarga;
    }

    public static void main(String[] args) {

        int totalHarga = 15000;
        int uangBayar = 20000;

        System.out.println("Total Harga: Rp" + totalHarga);
        System.out.println("Uang Bayar: Rp" + uangBayar);

        if (uangBayar >= totalHarga) {

            int kembalian =
                hitungKembalian(uangBayar, totalHarga);

            System.out.println("Pembayaran Berhasil");
            System.out.println("Kembalian: Rp" + kembalian);

        } else {

            System.out.println("Uang tidak cukup");
        }
    }
}

