package LatihanAlgoritmaPL;

public class C {

    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Seluruh angka ganjil didalam array yaitu : ");
        for (int angka : array) {
            if (angka % 2 != 0){
                System.out.print(angka + " ");
            }
        }
    }
}



