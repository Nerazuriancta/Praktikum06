public class LatihanDosen20 {
    String kode;
    String nama;
    int usia;

    public LatihanDosen20(String kode, String nama, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.usia = usia;
    }

    public void tampil() {
        System.out.println("Kode Dosen  : "+kode);
        System.out.println("Nama        : "+nama);
        System.out.println("Usia        : "+usia);
        System.out.println("---------------------");
    }
}
