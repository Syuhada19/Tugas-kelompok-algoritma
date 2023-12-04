public class BubbleSort {
    public static void main(String[] args) {
        int nilai[] = {80, 13, -5, 72};
        BubbleSortA(nilai);
    }
    public static void BubbleSortA( int[] angka){
        //tampilkan sebelum
         System.out.println("===sebelum===");
            for( int ang : angka ){
            System.out.print(ang + ", ");
        }

        //logicnya
        for( int i = 0; i < angka.length; i++ ){
            for( int j= 0; j < angka.length-1; j++ ){

                // kalau nilai saat ini lebih besar daripada nilai selanjunya
                if( angka[j] > angka[j+1] ){
                    // maka ditukar
                   int tampungan = angka[j];
                   angka[j] = angka[j+1];
                   angka[j+1] = tampungan;
                }

            }
        }

        //tampilkan sesudah
        System.out.println("\n===sesudah===");
            for( int ang : angka ){
            System.out.print(ang + ", ");
        }
    }
}
