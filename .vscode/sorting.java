/* 
 

public class sorting {
    public static  void bubblesort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] =arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        public static void printarr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public static void main(String args[]){
            int arr[] ={5,4,1,3,2}
        }
    }
}


public class sorting{
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minpos =i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[minpos]> arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos]= arr[i];
            arr[i]=temp;

            
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionsort(arr);
        System.out.printArr(arr);
    }
}

public class sorting{
    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(minPos>arr[j]){
                    minPos = j;

                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
       System.out.println(arr);
    }

}

public class sorting{
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length;i++){
            int curr = arr[i];
            int prew = i-1;
            while(prew >=0 && arr[prew] > curr){
                arr[prew+1] = arr[prew];
                prew--;
            }
            arr[prew+1] = curr ;
        }
        public static void main(String args[]){
            int arr[] = {5,4,1,3,2};
            insertionSort(arr);
        }
    }
}
*/

Arrays.sort(arr,0,2,Collections.reverseorder())k