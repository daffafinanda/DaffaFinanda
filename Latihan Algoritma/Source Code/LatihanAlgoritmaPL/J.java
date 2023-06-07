package LatihanAlgoritmaPL;

public class J {
    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int angka = 0; angka <= array.length - 2; angka++) {

            if (array[angka] %2 == 0 && array[angka + 1] %2 == 0 ) {
                int selisih ;
                selisih = array[angka] - array[angka+1] ;

                System.out.println("Selisih antara " + array[angka] + " dan " + array[angka+1] + " adalah " + Math.abs(selisih));
            }
        }
    }
}
