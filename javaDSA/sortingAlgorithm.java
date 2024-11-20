public class sortingAlgorithm {
    static void bubbleSort(int[] a){
        for(int i = 0; i < a.length - 1; i++){
            boolean b = false;
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] > a[j+1]){
                    a[j]   =   a[j] ^ a[j+1];
                    a[j+1] =   a[j] ^ a[j+1];
                    a[j]   =   a[j] ^ a[j+1];
                    b = true;
                }
            }
            if(!false) return;  
        }
    }
    public static void main(String[] args) {
        int[] a = {2,3,1,5,6};
        bubbleSort(a);
        for(int a1 : a){
            System.out.print(a1 + " ");
        }
    }
}
