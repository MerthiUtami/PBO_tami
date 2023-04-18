import java.util.ArrayList;

public class Restaurant {

    private int idRestaurant;
    private String namaRestaurant;
    private String alamatRestaurant;
    private ArrayList<Menu> menuRestaurant;

    public Restaurant(int id, String nama, String alamat) {
        this.idRestaurant = id;
        this.namaRestaurant = nama;
        this.alamatRestaurant = alamat;
        this.menuRestaurant = new ArrayList<>();
    }

    public int getId() {
        setId(idRestaurant);
        return idRestaurant;
    }

    public ArrayList<Menu> getMenus() {
        return menuRestaurant;
    }

    public void setMenus(Menu menu){
        this.menuRestaurant.add(menu);
    }

    public void setId(int id) {
        this.idRestaurant = id;
    }

    public String getNama() {
        setNama(namaRestaurant);
        return namaRestaurant;
    }

    public void setNama(String nama) {
        this.namaRestaurant = nama;
    }

    public String getAlamat() {
        setAlamat(alamatRestaurant);
        return alamatRestaurant;
    }

    public void setAlamat(String alamat) {
        this.alamatRestaurant = alamat;
    }

    @Override
    public String toString() {
        return "masukan ID Restaurant : " + idRestaurant +
                " || nama Restaurant = " + namaRestaurant + ' ' +
                " || alamat Restaurant = " + alamatRestaurant + ' ';
    }

}