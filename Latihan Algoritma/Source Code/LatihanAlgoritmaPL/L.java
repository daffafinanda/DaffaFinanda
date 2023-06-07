package LatihanAlgoritmaPL;

public class L {

    public static void main(String[] args) {

        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int angka = 0; angka <= array.length - 2; angka++) {
            int jumlah = array[angka] + array[angka+1];

            if(jumlah %2 == 0){
                System.out.println("Hasil jumlah angka " + array[angka] +" dan " + array[angka+1] + " menghasilkan angka genap : " + jumlah);
            }
        }
    }
}