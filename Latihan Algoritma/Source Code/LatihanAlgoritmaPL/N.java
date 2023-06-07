package LatihanAlgoritmaPL;

public class N {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Jumlah angka dengan angka sebelumnya:");
        for (int indeks = 0; indeks < array.length; indeks++) {
            int jumlah = 0;
            for (int angka = 0; angka <= indeks; angka++) {
                jumlah += array[angka];
            }
            System.out.println("Jumlah angka di indeks " + indeks + ": " + jumlah);
        }
    }
}


