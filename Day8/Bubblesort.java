import java.util.Scanner;
class Bubblesort{
    static void bubbleSort(int arr[], int n){                                       
        if (n == 1){
            return;
        }
        for (int i=0; i<n-1; i++){
            if (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr, n-1);           //one pass done, proceed to the next
    }
    void display(int arr[])                 //display the array
    {  
        for (int i=0; i<arr.length; ++i) 
        {
            System.out.print(arr[i]+" ");
        } 
    } 
     
    public static void main(String[] args)
    {
        Bubblesort ob = new Bubblesort();
        int arr[] = {32,56,12,1,52,9,89,86};    
        bubbleSort(arr, arr.length);
        ob.display(arr);
    }
}