import java.util.Scanner;
public class Mergesort{
    public static void partition(int array[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            partition(array,low,mid);
            partition(array,mid+1,high);
            merge(array,low,mid,high);
        }
    }
        public static void merge( int array[],int low,int mid,int high){
            int num1=mid-1+1;
            int num2=high-mid;
            int array1[]=new int[num1];
            int array2[]=new int[num2];
            for(int i=0;i<num1;i++){
                array1[i]=array[low+i];
            }
            for(int j=0;j<num2;j++){
                array2[j]=array[mid+1+j];
            }
            int i=0,j=0,k=1;
            while(i<num1 && j<num2)
            i=low;
            low=high;
        }
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the sie of the array:");
            int size=scan.nextInt();
            System.out.println("Enter array elements:");
            int array[]=new int[size];
            for(int i=0;i<size;i++){
                array[i]=scan.nextInt();
            }
            partition(array,0,size-1);
            for(int i=0;i<size;i++){
                System.out.print(array[i]+ " ");
            }
        }
    }
