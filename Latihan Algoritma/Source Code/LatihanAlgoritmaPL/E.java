package LatihanAlgoritmaPL;

public class E {

    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Angka-angka yang memiliki angka 2 didalam array yaitu : ");
        for (int angka : array) {
            String Angka = Integer.toString(angka);
            if (Angka.contains("2")){
                System.out.print(Angka+" ");
            }
        }
    }
}
