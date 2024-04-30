package Library;

public class main {
    public static void main(String[] args) {
        LibraryCollection buku = new Buku("1", "Structur Data", "Rinaldi Munir", "Informatika", "2015");
        buku.printCollection();

        LibraryCollection majalah = new Majalah("2", "Info Komputer", "Gramedia","2020");
        majalah.printCollection();

        Aplikasi2 aplikasi2 = new Aplikasi2();
        aplikasi2.cetak(buku);


    }
}
