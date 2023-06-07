package LatihanAlgoritmaPL;

public class D {

    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Seluruh angka kelipatan 3 didalam array yaitu : ");
        for (int angka : array) {
            if (angka % 3 == 0){
                System.out.print(angka + " ");
            }
        }
    }
}



