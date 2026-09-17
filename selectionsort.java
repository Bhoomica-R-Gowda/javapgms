import java.util.*;
public class selectionsort {
    public static void main(String args[]){
        int arr[]={-1,5,2,7,4,12,8};
        SelectionSort(arr);
    }
        public static void SelectionSort(int[] arr)
        {
            for(int i=0;i<arr.length-1;i++){
                int minvalue=arr[i];
                int minindex=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<minvalue){
                        minvalue=arr[j];
                        minindex=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;

            }
            for(int val:arr){
                System.out.println(val);
            }

        }
    }
    
