public class insertionsort {
    public static void main(String args[]){
        int arr[]={3,6,1,8,2,5};
        InsertionSort(arr);
    }
    public static void InsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];

            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
        for(int val:arr){
            System.out.println(val);
        }
    }

    
}
