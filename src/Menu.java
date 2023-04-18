public class Menu {
    String namaMenu;
    int hargaMenu;

    public Menu(String nama, int harga){
        this.namaMenu = nama;
        this.hargaMenu = harga;
    }


    public String getNama() {
        return namaMenu;
    }

    public void setNama(String nama) {
        this.namaMenu = nama;
    }

    public double getHarga() {
        return hargaMenu;
    }

    public void setHarga(int harga) {
        this.hargaMenu = harga;
    }
    public String toString() {
        return "Nama Menu : " + namaMenu + " || Rp." + hargaMenu;
    }
}
