package LatihanAlgoritmaPL;

public class M {
    public static void main(String[] args) {
       {
           int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

           System.out.println("Selisih angka dengan angka setelahnya:");
           int jumlahSelisih = 0;
           for (int i = 0; i <= array.length - 2; i++) {
               int selisih = array[i] - array[i + 1];
               System.out.println("Selisih antara " + array[i] + " dan " + array[i + 1] + " = " + Math.abs(selisih));
               jumlahSelisih += Math.abs(selisih);
                }

                System.out.println("Jumlah selisih: " + jumlahSelisih);
            }
        }

    }

