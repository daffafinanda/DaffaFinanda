package TugasPemrogamanLanjutan;

public class HasilStokBarang {
    public static void main(String[] args) {
        
        //Inisialisasi Objek
        StokBarang stokbarang = new StokBarang();
        
        //Pemanggilan konstruktor dan method yang sudah dideklarasikan sebelumnya
        
        //Method 1
        stokbarang.setstok("Pena", 2000);
        //Method 2
        stokbarang.infostok();
        //Method 3
        stokbarang.setketersediaan(true);
        System.out.println(stokbarang.hasilinfo());
    }
}

//Semua atribut harus ada di konstruktor
//di kelas main ga ada rumus
