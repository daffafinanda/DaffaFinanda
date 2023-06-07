package LatihanAlgoritmaPL;

public class I {

    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Selisih angka-angka dengan angka setelahnya :");
        for (int angka = 0 ; angka <= array.length -2; angka++){

        int selisih = array[angka] - array[angka+1];
            System.out.println("Selisih antara " + array[angka] + " dan " + array[angka+1] + " adalah " + Math.abs(selisih));
            }
        }
    }

