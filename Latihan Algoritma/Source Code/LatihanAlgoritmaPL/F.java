package LatihanAlgoritmaPL;

public class F {
    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Angka-angka ganjil yang diapit oleh angka genap didalam array yaitu : ");
        for (int angka = 1 ; angka <= array.length -2; angka++){

            if (array[angka] % 2 != 0 && array[angka - 1] % 2 == 0 && array[angka + 1] % 2 == 0) {
                System.out.print(array[angka] + " ");
            }
        }
    }
}