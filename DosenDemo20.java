import java.util.Scanner;

public class DosenDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen20 list = new DataDosen20();

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<jumlah;i++) {
            System.out.println("Data Dosen ke-"+(i+1));

            System.out.print("Kode Dosen    : ");
            String kode = sc.nextLine();

            System.out.print("Nama Dosen    : ");
            String nama = sc.nextLine();

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            LatihanDosen20 d = new LatihanDosen20(kode, nama, usia);
            list.tambah(d);

            System.out.println();
        }

        System.out.println("Data dosen sebelum sorting:");
        list.tampil();

        System.out.println("Data dosen yang sudah terurut menggunakan BUBBLE SORT (ascending):");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data dosen yang sudah terurut menggunakan SELECTION SORT (discending):");
        list.selectionSort();
        list.tampil();
    }    
}
