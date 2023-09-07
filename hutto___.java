// Binary Integer array sorting,

/*class Example{
    public static void sortArr(int[] arr){
         int j=arr.length-1;
         for(int i=0;i<j;){
            if((arr[i] == 1) && (arr[j] == 0)){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
            }
            if(arr[i] == 0){
               i++;
            }
            if(arr[j] == 1){
               j--;
            }
            
         }
    }

    public static void printArr(int[] arr){
         System.out.print("[");
         for(int x:arr){
            System.out.print(x+", ");
         }
         System.out.println("\b\b]");
    }

    public static void main(String args[]){
         
         int[] binaryIntArr={0,1,1,0,1,0,0};
           
         printArr(binaryIntArr);
         sortArr(binaryIntArr);
         printArr(binaryIntArr);
    }
}*/


// ========================================================================================

//Second largest value,

/*class Example{
    public static void printArr(int[] arr){
         System.out.print("[");
         for(int x:arr){
            System.out.print(x+", ");
         }
         System.out.print("\b\b]\n");
    }

    public static void sortArr(int[] arr){
         int max=0;
         int idx=0;
         for(int j=0;j<2;j++){
            max=arr[0];
            for(int i=1;i<arr.length-j;i++){
               if(max < arr[i]){
                  max=arr[i];
                  idx=i;
               }
            }
            arr[idx]=arr[arr.length-1-j];
            arr[arr.length-1-j]=max;
         }
    }

    public static void main(String args[]){
         int[] arr={3,5,1,7,0,9};

         printArr(arr);
         sortArr(arr);
         printArr(arr);
    }
}*/


// ===========================================================================================
import java.util.*;

class Example{
    public static void printArr(int[] arr){
         System.out.print("[");
         for(int x:arr){
            System.out.print(x+", ");
         }
         System.out.print("\b\b]");
    }

    public static boolean checkDuplicates(int[] arr,int num){
         for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
               return true;
            }
         }
         return false;
    }

    public static int[] readNumbers(int[] arr,int num){
         int[] tempArr=new int[arr.length+1];
         for(int i=0;i<arr.length;i++){
            tempArr[i] = arr[i];
         }
         tempArr[arr.length] = num;
         return tempArr;
    }

    public static void main(String args[]){
         Scanner input=new Scanner(System.in);
         System.out.print("Input integer number : ");
         int num=input.nextInt();

         int[] arr=new int[0];

         while(num != -1){
             arr = readNumbers(arr,num);
             while(checkDuplicates(arr,num)){
                 System.out.print("Input integer number : ");
                 num=input.nextInt();
             }
             
         }
        
         printArr(arr);      
    }
   
}


















