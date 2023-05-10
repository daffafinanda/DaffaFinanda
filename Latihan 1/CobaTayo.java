
package TugasPemrogamanLanjutan;

public class CobaTayo {
     public static void main(String[] args) {
        Tayo mobil = new Tayo();
        
        mobil.mobiltayo(); 
        
        double jaraktempuh = mobil.hitungjaraktempuh();
        System.out.println("Jarak Tempuh: " + jaraktempuh + " km");
    }
}
