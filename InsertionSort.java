public class InsertionSort {
    public static void main(String[] args) {
        
        int[] nilai = {90, 54, 67, 98, 76};
        InsertionSortInt(nilai); 

    }
    // this procedure for intenger
    public static void InsertionSortInt( int[] angka ){


        // tampilkan data sebelum
        System.out.println("===Sebelum===");
        for( int a : angka ){
            System.out.print(a + ", ");
        }

        // logicnya
        for( int i = 1; i < angka.length; i++){
            for(int j = i; j > 0; j-- ){
                if( angka[j] < angka[j-1]){
                    // dituker
                    int tampungan = angka[j];
                    angka[j] = angka[j-1];
                    angka[j-1] = tampungan;
                }
            }
        }

        // tampilkan data sesudah
        System.out.println("\n===Sesudah===");
        for( int a : angka ){
            System.out.print(a + ", ");
        }
    }
}
