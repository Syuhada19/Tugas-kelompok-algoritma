public class SelectionSort {
    public static void main(String[] args) {
        int nilai[] = { 69, 89, 31, 56, 99 } ;
        SelectionSortInt(nilai);
    }

    public static void SelectionSortInt( int[] angka){
        // tampilan sebelum
        System.out.println("===Sebelum===");
        for( int a : angka ){
            System.out.print(a + ", ");
        }

        // logic selection sort for integer
        for( int i = 0; i < angka.length; i++ ){

            int indexArray = i;
            for( int j = i; j < angka.length; j++ ){
                if( angka[indexArray] < angka[j] ){
                        indexArray = j;
                }
            }
            // tukar nilai
            int tampungan = angka[i];
            angka[i] = angka[indexArray];
            angka[indexArray] = tampungan;

        }

        // tampilan sesudah
        System.out.println("\n===Sesudah===");
        for( int a : angka ){
            System.out.print(a + ", ");
        }
    }
}
