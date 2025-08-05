import java.util.Scanner;

public class BelanjaBarangValdi {
    public static void main(String[] args) {
     try    (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan Nama Barang1: ");
            String namabarang = input.nextLine();
            System.out.println("ini barangnya "+namabarang);
             System.out.println("Masukkan Harga Barang: ");
            double hargabarang = input.nextDouble();
            System.out.println("Harga Barang: "+hargabarang);

            input.nextLine();
             System.out.println("Masukkan Nama Barang2: ");
            String namabarangg = input.nextLine();
            System.out.println("ini barangnya "+namabarangg);
             System.out.println("Masukkan Harga Barang2: ");
            double hargabarang2 = input.nextDouble();
            System.out.println("Harga Barang2: "+hargabarang2);

            //======================================================================;
            String hasil = "Barang yang dibeli: " + (namabarang + " dan " + namabarangg );
            System.out.println(hasil);
            String hasil2 = "Harga Barang: " + (hargabarang + " dan " +  hargabarang2 );
            System.out.println(hasil2);
            


          
        }
      




    }
}



