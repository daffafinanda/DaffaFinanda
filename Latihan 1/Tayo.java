package TugasPemrogamanLanjutan;

public class Tayo {
    String merek = "Tayo";
    String warna = "biru";
    int jumlahroda = 6;
    String nomorPlat = "BM 1234 TIF";
    double kecepatan = 60;
    double waktutempuh = 2;
    
    // Method 1 : Mobil Tayo
    public void mobiltayo() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Jumlah Roda: " + jumlahroda);
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Waktu Tempuh: " + waktutempuh + " jam");
    }
    
    // Method 2 : Jarak Tempuh
    double hitungjaraktempuh() {
        double jaraktempuh = kecepatan * waktutempuh;
        return jaraktempuh;
    }
}
