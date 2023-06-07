package LatihanAlgoritmaPL;

public class K {
    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int angka = 0; angka <= array.length - 2; angka++) {

            if (array[angka] < array[angka + 1]) {
                System.out.println("Setelah angka " + array[angka] + ", nilainya lebih besar  " );
            }
        }
    }
}