package Library;

public class Buku extends LibraryCollection {
    private String kodeKoleksi;
    private String judulBuku;
    private String penulis;
    private String penerbit;
    private String tahunTerbit;

 Buku(){

 }
 Buku(String kodeKoleksi, String judulBuku, String penulis, String penerbit, String tahunTerbit){
    this.kodeKoleksi = kodeKoleksi;
    this.judulBuku = judulBuku;
    this.penulis = penulis;
    this.penerbit = penerbit;
    this.tahunTerbit = tahunTerbit;
 }
 public String getKodeKoleksi() {
     return kodeKoleksi;
 }
 public String getJudulBuku() {
     return judulBuku;
 }
 public void setPenulis(String penulis) {
     this.penulis = penulis;
 }
 public String getPenulis() {
     return penulis;
 }
 public String getPenerbit(){
     return penerbit;
 }

    public String getTahunTerbit() {
        return tahunTerbit;
    }
    public void printCollection(){
        System.out.println("Kode Koleksi: " + kodeKoleksi);
        System.out.println("Judul Buku: " + judulBuku);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }


























}
