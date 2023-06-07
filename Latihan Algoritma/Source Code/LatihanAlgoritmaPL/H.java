package LatihanAlgoritmaPL;

public class H {

    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int jumlah = array.length;
        int total = 0;
        for (int angka = 0; angka < array.length; angka++) {
            total += array[angka];
        }

        System.out.println("Terdapat " + jumlah +" angka didalam array, " + "\nTotal angka jika dijumlahkan yaitu : "+total);
    }
}
