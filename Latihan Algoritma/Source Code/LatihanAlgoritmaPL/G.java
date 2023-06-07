package LatihanAlgoritmaPL;

public class G {
    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Angka-angka kelipatan 5 yang sebelumnya juga angka kelipatan 5 yaitu : ");
        for (int angka = 1 ; angka <= array.length -2; angka++){

            if (array[angka] % 5 == 0 && array[angka - 1] % 5 == 0 ) {
                System.out.print(array[angka] + " ");
            }
        }
    }
}
