package TugasPemrogamanLanjutan;

public class StokBarang {
    //Variabel
    String nama ;
    int harga ;
    boolean stok ;
   
    //Konstruktor
    StokBarang(){
    }
    StokBarang (String nama , int harga){
    }
    StokBarang (boolean stok){
    }
    
    
    //Method
    
    //Method 1 : Memasukkan nama dan harga barang
    void setstok(String nama, int harga){
        System.out.println("Nama Produk \t:" + nama +
                "\nHarga    \t:" + harga);
    }
    
    //Method 2 : Menanyakan ketersediaan barang 
    String infostok (){
        var jumlahstok = "Apakah Stok Barang Ini Masih Ada ?" ;
        System.out.println(jumlahstok);
        
        return jumlahstok ;
    }
    //Method 3 Pernyataan tentang ketersediaan barang
        void setketersediaan (boolean stok){
        this.stok = stok ;
    }
    String hasilinfo (){
        String ketersediaan;
        if(stok){
            ketersediaan = "Tersedia" ;
        }else {
            ketersediaan = "Tidak Tersedia";   
        }
        return ketersediaan ;
    
    }

}
    
