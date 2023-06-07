package LatihanAlgoritmaPL;

public class B {
    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int cari = 12;
        boolean ditemukan = false;


        for (int angka : array) {
            if (angka == cari) {
                ditemukan = true;
                break ;
            }
        }

        if (ditemukan) {
            System.out.println("Angka ditemukan dalam Array ");
        } else {
            System.out.println("Angka tidak ditemukan dalam array");
        }
    }
}

